package br.ufg.inf.es.integracao.topico03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.stream.*;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.ufg.inf.es.integracao.topico03.conceito.Calçado;
import br.ufg.inf.es.integracao.topico03.conceito.Sapato;
import br.ufg.inf.es.integracao.topico03.conceito.Tenis;

public class Exe02 {


	public static void main(String[] args) throws IOException, XMLStreamException {
		
		FileInputStream fis = new FileInputStream(args[0]);
		XMLInputFactory factory = XMLInputFactory.newFactory();
		XMLStreamReader reader = factory.createXMLStreamReader(fis);
		XmlMapper mapper = new XmlMapper();
		
		ArrayList<Calçado> lista = new ArrayList<Calçado>();

		int evento = reader.next();
		while (evento != XMLStreamConstants.END_DOCUMENT) {
		   if (evento == XMLStreamConstants.START_ELEMENT) {
			   String tag = reader.getLocalName();
		       //System.out.println(tag);
		       if (tag == "tenis") {
		    	   Tenis item = mapper.readValue(reader, Tenis.class);
		    	   lista.add(item);
		       }
		       else if (tag == "sapato") {
		    	   Sapato item = mapper.readValue(reader, Sapato.class);
		    	   lista.add(item);
		       }
		       
		   }
		   evento = reader.next();
		}
		
		for (Calçado item : lista) {
			System.out.println(item);
		}


	}

}
