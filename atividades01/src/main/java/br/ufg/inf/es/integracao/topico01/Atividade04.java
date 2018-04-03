/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.IOException;
import java.io.PrintWriter;

public class Atividade04 {

	public static void main(String[] args) throws IOException {
		PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
		arquivo.write(args[1]);
		arquivo.close();


	}

}
