package br.ufg.inf.es.integracao.topico02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

/**
 * Classe que lê um arquivo contendo um objeto serializado e o converte em objeto OU
 * grava um objeto em um arquivo de forma serializada.
 * @author caua539
 *
 */
public class Exe02 {
	
	public static void main( String[] args ) throws IOException, ClassNotFoundException
    {
		Scanner sc = new Scanner(System.in);
        TesteserialExe01 one = new TesteserialExe01();
        one.setIdade(56);
        one.setNome("Name");
        System.out.println("Deseja Gravar ou Ler o arquivo fornecido? Responda com G ou L.");
        String resposta = sc.nextLine();
        if (resposta == "G") {
        	GravaremArquivo(one, args[0]);
        }
        else if (resposta == "L") {
        	TesteserialExe02 novo = (TesteserialExe02) LerArquivo(args[0]);
        	System.out.println(novo.getNome());
        }
    }
    
    public static void GravaremArquivo (Serializable s, String filename) throws IOException {
    	FileOutputStream fos = new FileOutputStream(filename);
    	ObjectOutputStream oos = new ObjectOutputStream(fos);

    	oos.writeObject(s);
    	System.out.println("Objeto gravado em arquivo");
    	oos.close();
    }
    
    public static Object LerArquivo (String filename) throws IOException, ClassNotFoundException {
    	FileInputStream fis = new FileInputStream(filename);
    	ObjectInputStream ois = new ObjectInputStream(fis);

    	TesteserialExe02 novo = (TesteserialExe02) ois.readObject();
    	ois.close();
    	
    	return novo;
    }

}
