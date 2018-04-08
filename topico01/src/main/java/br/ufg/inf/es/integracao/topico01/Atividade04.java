/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Programa que recebe o nome de um arquivo e uma sequência
 * de caracteres e persiste essa sequência no arquivo informado
 * @author caua539
 *
 */
public class Atividade04 {

	/**
	 * O método recebe como argumento o nome de um arquivo
	 * e uma sequência de caracteres. O arquivo é codificado
	 * no formato UTF-8 e então a sequência de caracteres é 
	 * persistida no arquivo.
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
		arquivo.write(args[1]);
		arquivo.close();


	}

}
