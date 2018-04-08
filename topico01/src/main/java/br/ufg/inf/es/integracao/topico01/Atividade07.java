package br.ufg.inf.es.integracao.topico01;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Programa que melhora a implementação da Atividade05
 * Criando metadados no começo do arquivo binário gerado
 * que representam índices da posição de cada uma das linhas de texto
 * contidas no arquivo, para que seja possível ler diretamente daquela
 * posição sem antes precisa ler o arquivo inteiramente.
 * @author caua539
 *
 */
public class Atividade07 {
	
	/**
	 * O método recebe um arraylist de Strings em
	 * que cada posição representa uma linha do arquivo texto original.
	 * Então os dados da linha (seu tamanho, sua posição e seus dados)
	 * são convertidos em bytes para serem gravados no arquivo binário.
	 * @param text: arraylist contendo o texto do arquivo texto
	 * @return um array de bytes contendo as informações para serem gravadas no arquivo binário
	 * @throws IOException
	 */
	public static byte[] textToByte(List<String> text) throws IOException {
		
		// Um Stream vai gravando o array de índices enquanto o outro grava o texto convertido e seus tamanhos
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		ByteArrayOutputStream tempStream = new ByteArrayOutputStream( );
		
		/**
		 * nlines é quantidade de linhas de texto, enquanto que metadatasize representa
		 * a quantidade de bytes que precisarão ser alocados para o array de índices
		 */
		int nlines = text.size();
		int metadatasize = nlines * 4; // multiplicado por 4 pois cada índice é um inteiro, que consome 4 bytes
		
		/**
		 *  O primeiro dado do array de índices é seu tamanho em bytes para que
		 *  o programa de leitura saiba onde acabam os índices e começam os dados.
		 *  Isso é inserido no Stream final.
		 */
		byte[] tamanhoindice = ByteBuffer.allocate(4).putInt(metadatasize).array();
		outputStream.write(tamanhoindice);
		metadatasize += 4; //Incrementando em 4. Metadados são compostos por array de índices + tamanho do array(int)
		
		for (int i =0; i < nlines; i++) {
			
			/**
			 * Insere os índices um por um a cada linha que é lida, se baseando
			 * na posição que Stream secundário se encontra para saber a posição
			 * que a linha se encontra.
			 */
			byte[] indice = ByteBuffer.allocate(4).putInt(metadatasize+tempStream.size()).array();
			outputStream.write(indice);
			
			byte[] textonly = text.get(i).getBytes("UTF-8");
			byte[] tamanho = ByteBuffer.allocate(4).putInt(textonly.length).array();
			tempStream.write( tamanho );
			tempStream.write( textonly );
		}
		// Concatena os 2 Streams, juntando o array de índices e os dados
		outputStream.write(tempStream.toByteArray());
		return outputStream.toByteArray( );	    
	}

	/**
	 * O método recebe um arquivo de texto como argumento e
	 * o salva num scanner. Esse scanner é lido linha por linha
	 * e gravado num arraylist. Isto é feito pois para conseguir
	 * o tamanho de um Scanner (para ser utilizado) é necessário que ele seja totalmente lido,
	 * o que inutiliza o Scanner.
	 * O arraylist é então passado para processamento.
	 * O resultado do processamento é salvo num arquivo binário cujo nome
	 * é o segundo argumento recebido.
	 * @param args: [0]: arquivo texto; [1]: arquivo binário a ser criado;
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader(args[0]));
		List<String> lines = new ArrayList<String>();
		FileOutputStream fos = new FileOutputStream(args[1]);
		DataOutputStream dos = new DataOutputStream(fos);
		
		while(in.hasNextLine()) {
			lines.add(in.nextLine());
		}
		in.close();
		
		dos.write(textToByte(lines));
		dos.close();
			
	}

}
