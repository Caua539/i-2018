package br.ufg.inf.es.integracao.topico01;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.UUID;

public class Atividade01Test {

	private static String tempdir = System.getProperty("java.io.tmpdir")+UUID.randomUUID().toString();
	private static String arquivo = tempdir + "\\teste.txt";
	private static final int CONSTANTE = 256;
	
	@Before
	public void setUp() throws Exception {
		File folder = new File(tempdir);
		folder.mkdirs();
		FileOutputStream fos = new FileOutputStream(arquivo);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(CONSTANTE);
		dos.close();
	}

    @Test(expected = FileNotFoundException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
    	String nomeUnico = UUID.randomUUID().toString();
    	Atividade01.obtemQuatroPrimeirosBytesComoInteiro(nomeUnico);      
    }
    
    @Test
    public void quatroBytesConhecidos() throws Exception {
    	int valor = Atividade01.obtemQuatroPrimeirosBytesComoInteiro(arquivo);
    	assertEquals(CONSTANTE, valor);
    }
}

