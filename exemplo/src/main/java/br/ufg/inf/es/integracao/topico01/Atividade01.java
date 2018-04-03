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

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Atividade01 {
	public static void main (String[] args) throws IOException {
		int valor = obtemQuatroPrimeirosBytesComoInteiro(args[0]);		
		System.out.println(Integer.toHexString(valor));
	}

	public static int obtemQuatroPrimeirosBytesComoInteiro(String arquivo) throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream(arquivo);
		DataInputStream dis = new DataInputStream(fis);
		
		int valor = dis.readInt();
		dis.close();
		
		return valor;
	}
}
