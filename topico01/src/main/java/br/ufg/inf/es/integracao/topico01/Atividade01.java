/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Programa que recebe o nome de um arquivo e exibe os 4 
 * primeiros bytes em formato hexadecimal
 * @author caua539
 *
 */
public class Atividade01 {

	/**
	 * Chama método passando nome do arquivo para parâmetro e 
	 * exibe valor retornado como hexadecimal.
	 * 
	 * @param args nome do arquivo.
	 */
	public static void main (String[] args) {
		int valor;
		try {
			valor = obtemQuatroPrimeirosBytesComoInteiro(args[0]);
			System.out.println(Integer.toHexString(valor));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Nome do arquivo não informado.");
			e.printStackTrace();
		}		
	}

	/**
	 * Lê 4 primeiros bytes do arquivo como inteiro 32 bits
	 * 
	 * @param arquivo o arquivo recebido como argumento
	 * 
	 * @return o valor lido pelo arquivo
	 */
	public static int obtemQuatroPrimeirosBytesComoInteiro(String arquivo) {
		FileInputStream fis;
		DataInputStream dis;
		try {
			fis = new FileInputStream(arquivo);
			dis = new DataInputStream(fis);
			int valor = dis.readInt();
			dis.close();
			
			return valor;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
