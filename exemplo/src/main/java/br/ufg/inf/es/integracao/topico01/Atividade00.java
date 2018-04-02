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

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 
 * @author caua539
 * Programa que cria
 *
 */
public class Atividade00 {
	
	/**
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main (String[] args) throws IOException {
		int inteiro = 256;
		FileOutputStream fos = new FileOutputStream(args[0]);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(inteiro);
		dos.close();

	}
}
