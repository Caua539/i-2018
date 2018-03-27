/*
 * Copyright (c) 2018.
 * Você deve colocar aquia a licença e de quem são os direitos autorais do código.
 *
 */

// Todo mude o nome desse package (sugestão): br.ufg.inf.es.integracao.aula01
package aula01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * O que é públic precisa ser comentado.
 * Programa que ...
 */
public class Atividade00 {

    /**
     * Método públic também deve ser comentado...
     * @param args
     * @throws IOException Não acho apropriado. Você deveria tratar a
     * exceção, ou seja, indicar para o usuário que não foi possível
     * criar o arquivo.
     */
	public static void main (String[] args) throws IOException {
	    // TODO numero mágico, transforme em uma constante.
		int inteiro = 256;
		FileOutputStream fos = new FileOutputStream(args[0]);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(inteiro);
		dos.close();
        // Todo remova essa linha, não é o padrão este espaço em branco. 
	}
}
