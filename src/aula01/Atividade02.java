package aula01;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Atividade02 {
	public static void main (String[] args) throws IOException {
		Path arquivo = Paths.get(args[0]);
		ByteBuffer[] buffer = new ByteBuffer[4];
		for (int i=0; i<4; i++) {
			buffer[i] = ByteBuffer.allocate(1);
		}
		FileChannel fc = FileChannel.open(arquivo);
		fc.read(buffer, 0, 2);
		fc.position(fc.size() - 2);
		fc.read(buffer, 2, 2);
		fc.close();
		String ref = "FFD8FFD9";
		String file = "";
		for (int i =0; i<4; i++) {
			file += String.format("%02X", buffer[i].get(0));
		}
		if (file.equals(ref)) {
			System.out.println("É um JPEG!");
		}
		
		
		
	}

}
