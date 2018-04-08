package br.ufg.inf.es.integracao.topico01;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class Atividade06 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		DataInputStream dis = new DataInputStream(fis);
		
		try {
			while(true) {
				int len = dis.readInt();
				byte[] line = new byte[len];
				dis.readFully(line);
				String text = new String(line, "UTF-8");
				System.out.println(text);
			}
		} catch (EOFException eof) {
			dis.close();
		}

	}

}
