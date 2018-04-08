package br.ufg.inf.es.integracao.topico01;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade07 {
	
	public static byte[] textToByte(Scanner text) throws IOException {
		
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream( );
		ByteArrayOutputStream tempStream = new ByteArrayOutputStream( );
		List<String> lines = countLines(text);
		int nlines = lines.size();
		int metadatasize = nlines * 4;
		
		for (int i =0; i < nlines; i++) {
			
			byte[] indice = ByteBuffer.allocate(4).putInt(metadatasize+tempStream.size()+1).array();
			outputStream.write(indice);
			
			byte[] textonly = lines.get(i).getBytes("UTF-8");
			byte[] tamanho = ByteBuffer.allocate(4).putInt(textonly.length).array();
			tempStream.write( tamanho );
			tempStream.write( textonly );
		}
		outputStream.write(tempStream.toByteArray());
		return outputStream.toByteArray( );	    
	}
	
	public static List<String> countLines(Scanner text) {
		
		List<String> lines = new ArrayList<String>();
		
		while(text.hasNextLine()) {
			lines.add(text.nextLine());
		}
		return lines;
	}

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader(args[0]));
		FileOutputStream fos = new FileOutputStream(args[1]);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.write(textToByte(in));
		dos.close();
			
	}

}
