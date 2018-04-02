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
import java.io.PrintWriter;

public class Atividade04 {

	public static void main(String[] args) throws IOException {
		PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
		arquivo.write(args[1]);
		arquivo.close();


	}

}
