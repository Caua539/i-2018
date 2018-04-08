/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Programa que exibe o conteúdo de um arquivo texto
 * na saída padrão
 * @author caua539
 *
 */
public class Atividade03 {

	/**
	 * O método recebe como argumento o nome de um arquivo
	 * e lê suas linhas uma a uma usando formato UTF-8
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get(args[0]);
		Charset uft8 = Charset.forName("UTF-8");
		for (String linha : Files.readAllLines(arquivo, uft8)) {
			   System.out.println(linha);
		}


	}

}
