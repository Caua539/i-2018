/*
 * Copyright (c) 2018.
 * Voc� deve colocar aquia a licen�a e de quem s�o os direitos autorais do c�digo.
 *
 */

// Todo mude o nome desse package (sugest�o): br.ufg.inf.es.integracao.aula01
package aula01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * O que � p�blic precisa ser comentado.
 * Programa que ...
 */
public class Atividade00 {

    /**
     * M�todo p�blic tamb�m deve ser comentado...
     * @param args
     * @throws IOException N�o acho apropriado. Voc� deveria tratar a
     * exce��o, ou seja, indicar para o usu�rio que n�o foi poss�vel
     * criar o arquivo.
     */
	public static void main (String[] args) throws IOException {
	    // TODO numero m�gico, transforme em uma constante.
		int inteiro = 256;
		FileOutputStream fos = new FileOutputStream(args[0]);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(inteiro);
		dos.close();
        // Todo remova essa linha, n�o � o padr�o este espa�o em branco. 
	}
}
