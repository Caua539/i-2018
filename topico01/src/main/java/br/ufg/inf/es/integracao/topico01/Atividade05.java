/*******************************************************************************
 * Copyright (c) 2018.
 * Cauã Pessoa
 * Creative Commons Attribution 4.0 International License.
 *******************************************************************************/
package br.ufg.inf.es.integracao.topico01;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Atividade05 {
	
	public static byte[] textToByte(Scanner text) throws IOException {
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		
		while(text.hasNextLine()) {
			byte[] textonly = text.nextLine().getBytes("UTF-8");
			byte[] tamanho = ByteBuffer.allocate(4).putInt(textonly.length).array();
			outputStream.write( tamanho );
			outputStream.write( textonly );
		}
		return outputStream.toByteArray( );	    
	}

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader(args[0]));
		FileOutputStream fos = new FileOutputStream(args[1]);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(textToByte(in));
		dos.close();
			
		}
}
