package br.ufg.inf.es.integracao.topico01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * O programa lê um arquivo binário com um
 * vetor de índices e imprime na saída padrão
 * uma das linhas do arquivo binário como texto
 * @author caua539
 *
 */
public class Atividade08 {
	/**
	 * O método recebe um arquivo binário de certo formato
	 * como argumento. O primeiro dado recebido é o tamanho
	 * do array de índices. Então o array de índices é recuperado em um
	 * array de inteiros. O número passado no segundo argumento
	 * é utilizado para identificar a linha que se deseja ler.
	 * A linha está na posição determinada pelo índice no array de índices.
	 * @param args: [0]: arquivo binário; [1]: número da linha a ser impressa;
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);
		
		int tamanhoindice = dis.readInt(); // lê o tamanho do array de índices

		// Cria um array de inteiros e popula ele com os índices do array de índices do arquivo binário
		int[] indices = new int[tamanhoindice/4]; // dividido por 4 pois cada inteiro é 4 bytes
		for (int i = 0; i < indices.length; i++) {
			indices[i] = dis.readInt();
		}
		
		int byteslidos = 4 + tamanhoindice; // variável de controle para saber a posição do DataInputStream
		
		// a linha desejada é o número informado -1 (pois arrays começam em 0).
		int linhadesejada = new Integer(args[1]) -1;
		linhadesejada  = indices[linhadesejada];
		
		dis.skip(linhadesejada - byteslidos); // pula para a posição desejada no DataInputStream
		int len = dis.readInt();
		byte[] line = new byte[len];
		dis.readFully(line);
		String text = new String(line, "UTF-8");
		System.out.println(text);

		dis.close();

	}

}
