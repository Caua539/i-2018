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
import java.io.IOException;

public class Atividade01 {
	public static void main (String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);
		
		int valor = dis.readInt();
		dis.close();
		System.out.println(Integer.toHexString(valor));
		
	}

}
