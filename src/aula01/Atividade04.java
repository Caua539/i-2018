package aula01;

import java.io.IOException;
import java.io.PrintWriter;

public class Atividade04 {

	public static void main(String[] args) throws IOException {
		PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
		arquivo.write(args[1]);
		arquivo.close();


	}

}
