/*******************************************************************************
 * Copyright (c) 2018 Cauã Pessoa
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Cauã Pessoa
 *******************************************************************************/

package br.ufg.inf.es.integracao.topico01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Atividade05 {
	
	public static String stringToBinary(String text) {
		
	    String bWord = "";
	    String bText = "";
	    String temp = "";
	    String[] words = text.split(" ");
	    for (int a=0; a<words.length; a++) {
	    	for(int i=0;i<words[a].length();i++) {
		    	
		        temp=Integer.toBinaryString(text.charAt(i));
		        for(int j=temp.length();j<8;j++) {
		            temp="0"+temp;
		        }
		        
		        bWord+=temp+" ";
		    }
	
		    System.out.println(bWord);
		    bText += bWord+" ";
	    }
	    
	    return bText;
		    
	}

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(new FileReader(args[0]));
		System.out.println(in.nextLine());
		while(in.hasNextLine()) {
			
		}
		

	}

}
