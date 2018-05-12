package br.ufg.inf.es.integracao.topico03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Exe01 
{
    public static void main( String[] args ) throws DOMException, IOException
    {
        String csvFile = args[0];
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        
        try {

    		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
    		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
    		
    		br = new BufferedReader(new FileReader(csvFile));

    		Document doc = docBuilder.newDocument();
    		Element alunos = doc.createElement("alunos");
    		doc.appendChild(alunos);
    		
    		while ((line = br.readLine()) != null) {
    			Element aluno = doc.createElement("aluno");
        		alunos.appendChild(aluno);
        		
        		String[] linhaaluno = line.split(cvsSplitBy);

        		Element name = doc.createElement("nome");
        		name.appendChild(doc.createTextNode(linhaaluno[0]));
        		aluno.appendChild(name);

        		Element email = doc.createElement("email");
        		email.appendChild(doc.createTextNode(linhaaluno[1]));
        		aluno.appendChild(email);
    		}

    		// write the content into xml file
    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            String[] filename = args[0].split("\\.");
    		StreamResult result = new StreamResult(new File("target/"+filename[0]+".xml"));

    		transformer.transform(source, result);

    		System.out.println("File saved!");

    	  } catch (ParserConfigurationException pce) {
    		pce.printStackTrace();
    	  } catch (TransformerException tfe) {
    		tfe.printStackTrace();
    	  }
    }
}
