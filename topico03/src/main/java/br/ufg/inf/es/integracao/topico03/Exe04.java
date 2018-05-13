package br.ufg.inf.es.integracao.topico03;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import br.ufg.inf.es.integracao.topico03.modelologico.Data;
import br.ufg.inf.es.integracao.topico03.modelologico.Endereço;
import br.ufg.inf.es.integracao.topico03.modelologico.Individuo;
import br.ufg.inf.es.integracao.topico03.modelologico.Nome;
import br.ufg.inf.es.integracao.topico03.modelologico.TituloEleitoral;

public class Exe04 {

	public static void main(String[] args) throws JsonProcessingException, FileNotFoundException, UnsupportedEncodingException {
		Individuo pessoa = new Individuo();
		
		Nome name = new Nome();
		name.setNome("Joao");
		name.setSobrenome("Silva");
		name.setSufixo("Filho");
		name.setTitulo("Dr.");
		name.setNomepreferido(true);
		pessoa.setNomes(name);
		
		TituloEleitoral titulo = new TituloEleitoral();
		titulo.setArea(2);
		titulo.setDesignacao(000000001);
		titulo.setEmissor("Estado de Goias");
		Calendar data = Calendar.getInstance();
		data.set(Calendar.YEAR, 1995); 
		data.set(Calendar.MONTH, Calendar.MARCH); 
		data.set(Calendar.DAY_OF_MONTH, 20);
		titulo.setEmissao(data);
		titulo.setTipo(3);
		titulo.setSecao(123);
		titulo.setZona(333);
		pessoa.setDocumentos(titulo);
		
		Endereço address = new Endereço();
		address.setBairro("Bairro");
		address.setCaixapostal(00001);
		address.setCep(74001001);
		address.setEstado("Goias");
		address.setMunicipio("Goiania");
		address.setPais(1);
		address.setDistrito("62");
		Data date = new Data(2000, 4, 15);
		address.setDatainicial(date);
		pessoa.setAddresses(address);
		
		ObjectMapper objectMapper = new XmlMapper();
		objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		String xml = objectMapper.writeValueAsString(pessoa);
		
		PrintWriter arquivo = new PrintWriter("individuo.xml", "UTF-8");
		arquivo.write(xml);
		arquivo.close();
		
		
		
		
		
		
		
		

	}

}
