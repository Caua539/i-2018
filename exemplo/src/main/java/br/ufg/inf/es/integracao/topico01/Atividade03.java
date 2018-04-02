/*******************************************************************************
 * Copyright (c) 2018 Cauã Pessoa
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cauã Pessoa
 *******************************************************************************/

package br.ufg.inf.es.integracao.topico01;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade03 {

	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get(args[0]);
		Charset uft8 = Charset.forName("UTF-8");
		for (String linha : Files.readAllLines(arquivo, uft8)) {
			   System.out.println(linha);
		}


	}

}
