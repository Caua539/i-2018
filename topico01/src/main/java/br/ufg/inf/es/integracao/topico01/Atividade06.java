package br.ufg.inf.es.integracao.topico01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Programa que recebe um arquivo binário
 * e interpreta as informações contidas para imprimir
 * na saída padrão
 * @author caua539
 *
 */
public class Atividade06 {

	/**
	 * O método recebe um arquivo binário como argumento
	 * que é lido da seguinte maneira: os primeiros 4 bytes
	 * representam o tamanho da sequencia de bytes que vem a seguida.
	 * Então os seguintes 4 bytes representam o tamanho da próxima sequencia etc.
	 * Essa segunda sequência de bytes é uma linha de texto que é 
	 * convertida de volta para texto e impressa na saída padrão.
	 * @param args: [0]: arquivo binário;
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);
		
		try {
			while(true) {
				int len = dis.readInt();
				byte[] line = new byte[len];
				dis.readFully(line);
				String text = new String(line, "UTF-8");
				System.out.println(text);
			}
		} catch (EOFException eof) {
			dis.close();
		}

	}

}
