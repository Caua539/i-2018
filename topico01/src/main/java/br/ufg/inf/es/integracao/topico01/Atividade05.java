/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

/**
 * Programa que recebe um arquivo texto e o nome de
 * um arquivo a ser criado como entrada e insere todo o
 * conteúdo do arquivo texto no arquivo em formato
 * de bytes, linha por linha. À frente de cada linha de bytes
 * vai um conjunto de 4 bytes representando um número inteiro equivalente
 * ao número de bytes que vem em seguida.
 * @author caua539
 *
 */
public class Atividade05 {
	
	/**
	 * O método recebe o arquivo texto no formato Scanner
	 * e itera sobre cada linha do arquivo, verificando seu tamanho,
	 * convertendo-a em bytes e salvando as duas informações num
	 * OutputStream que é então convertido num array de bytes.
	 * @param text: Um Scanner contendo o arquivo texto de entrada
	 * @return um array de bytes contendo todas as linhas do arquivo texto
	 * convertidas em byte e precedidas por seu tamanho
	 * @throws IOException
	 */
	public static byte[] textToByte(Scanner text) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		
		while(text.hasNextLine()) {
			byte[] textonly = text.nextLine().getBytes("UTF-8");
			byte[] tamanho = ByteBuffer.allocate(4).putInt(textonly.length).array();
			outputStream.write( tamanho );
			outputStream.write( textonly );
		}
		return outputStream.toByteArray( );	    
	}

	/**
	 * O método recebe um arquivo texto como argumento
	 * e salva-o num Scanner que é passado para frente para
	 * processamento. O resultado do processamente é então salvo num arquivo
	 * cujo nome é informado como argumento
	 * @param args: [0]: arquivo texto; [1]: arquivo a ser gravado;
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader(args[0]));
		FileOutputStream fos = new FileOutputStream(args[1]);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(textToByte(in));
		dos.close();
			
		}
}
