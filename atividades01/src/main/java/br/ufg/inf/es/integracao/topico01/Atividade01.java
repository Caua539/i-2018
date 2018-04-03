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

/**
 * Programa que recebe o nome de um arquivo e exibe os 4 primeiros bytes em formato hexadecimal
 * @author caua539
 *
 */
public class Atividade01 {
	
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
