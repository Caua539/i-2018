package br.ufg.inf.es.integracao.topico03;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.ufg.inf.es.integracao.topico03.conceito.Turma;

public class Exe03b {

	public static void main(String[] args) throws XMLStreamException, IOException {
		FileInputStream fis = new FileInputStream(args[0]);
		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLStreamReader reader = factory.createXMLStreamReader(fis);
		XmlMapper mapper = new XmlMapper();
		
		Turma newturma;

		reader.next();
		newturma = mapper.readValue(reader, Turma.class);
		
		String ruazero = newturma.getLista()[0].getAddress().getLogradouro();
		
		System.out.println("A rua do primeiro estudante é: "+ruazero);

	}

}
