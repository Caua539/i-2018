/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Atividade02 {
	public static void main (String[] args) throws IOException {
		
		File arquivo = new File(args[0]);
		long size = arquivo.length();
		
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);
		
		byte ff = dis.readByte();
		byte d8 = dis.readByte();
		dis.skip(size - 4);
		byte ff2 = dis.readByte();
		byte d9 = dis.readByte();
		
		boolean first = ff == (byte)0xFF;
		boolean second = d8 == (byte)0xD8;
		boolean third = ff2 == (byte)0xFF;
		boolean fourth = d9 == (byte)0xD9;
		
		if (first && second && third && fourth) {
			System.out.println("É um JPEG");
			
		}
		
		
		
	}

}
