package br.ufg.inf.es.integracao.topico01;

import org.junit.Test;

import java.io.FileNotFoundException;

public class Atividade01Test {

    @Test(expected = FileNotFoundException.class)
    public void arquivoInexistenteGeraExcecao() throws Exception {
    	Atividade01.obtemQuatroPrimeirosBytesComoInteiro("arquivo-inexisente.sem-sentido");      
    }
    
    @Test
    public void 
}

