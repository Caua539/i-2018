package br.ufg.inf.es.integracao.topico03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.ufg.inf.es.integracao.topico03.conceito.Endereço;
import br.ufg.inf.es.integracao.topico03.conceito.Estudante;
import br.ufg.inf.es.integracao.topico03.conceito.Turma;

public class Exe03 {

	public static void main(String[] args) throws JsonProcessingException, FileNotFoundException, UnsupportedEncodingException {
		String[] ruas = {"Primeira", "Segunda", "Terceira", "Quarta"};
		String[] comp = {"Apto 100", "Apto 200", "Apto 300", "Apto 400"};
		Endereço address;
		Estudante aluno;
		Turma turma = new Turma();
		
		Estudante[] lista = new Estudante[ruas.length];
		
		
		for (int i = 0; i < 4; i++) {
			address = new Endereço();
			int num = i +1;
			int cep = 74000 + num;
			address.setNumero(num);
			address.setCep(cep);
			address.setLogradouro(ruas[i]);
			address.setComplemento(comp[i]);
			
			aluno = new Estudante();
			aluno.setAddress(address);
			lista[i] = aluno;	
		}
		
		turma.setLista(lista);
		
		ObjectMapper objectMapper = new XmlMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		String xml = objectMapper.writeValueAsString(turma);
		
		PrintWriter arquivo = new PrintWriter(args[0], "UTF-8");
		arquivo.write(xml);
		arquivo.close();
		

	}

}
