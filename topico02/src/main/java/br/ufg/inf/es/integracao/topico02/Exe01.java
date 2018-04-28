package br.ufg.inf.es.integracao.topico02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Classe que tenta serializar um objeto serializable
 * que possui uma instancia de outra classe não serializable
 * dentro de si, gerando uma exceção.
 * @author caua539
 *
 */
public class Exe01 
{
    public static void main( String[] args ) throws IOException
    {
        TesteserialExe01 one = new TesteserialExe01();
        one.setIdade(56);
        one.setNome("Name");
        TamanhoemBytes(one);
    }
    
    public static int TamanhoemBytes (Serializable s) throws IOException {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream();
    	ObjectOutputStream oos = new ObjectOutputStream(baos);

    	oos.writeObject(s);
    	oos.close();

    	return baos.toByteArray().length;
    }
}
