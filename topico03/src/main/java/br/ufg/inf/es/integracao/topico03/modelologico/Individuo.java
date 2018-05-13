package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

@JsonPropertyOrder({"nomes", "addresses", "documentos"})
public class Individuo {
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("Endereço")
	private ArrayList<Endereço> addresses = new ArrayList<Endereço>();
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("Identificador")
	private ArrayList<Identificador> documentos = new ArrayList<Identificador>();
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("Nome")
	private ArrayList<Nome> nomes = new ArrayList<Nome>();
	private Dadosdemo dados;
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("MeiodeComunicacao")
	private ArrayList<Comunicacao> meios = new ArrayList<Comunicacao>();
	private Vinculo vinc;
	
	
	public Dadosdemo getDados() {
		return dados;
	}
	public void setDados(Dadosdemo dados) {
		this.dados = dados;
	}
	public Vinculo getVinc() {
		return vinc;
	}
	public void setVinc(Vinculo vinc) {
		this.vinc = vinc;
	}
	public ArrayList<Endereço> getAddresses() {
		return addresses;
	}
	public void setAddresses(Endereço address) {
		this.addresses.add(address);
	}
	public ArrayList<Identificador> getDocumentos() {
		return documentos;
	}
	public void setDocumentos(Identificador documento) {
		this.documentos.add(documento);
	}
	public ArrayList<Nome> getNomes() {
		return nomes;
	}
	public void setNomes(Nome nome) {
		this.nomes.add(nome);
	}
	public ArrayList<Comunicacao> getMeios() {
		return meios;
	}
	public void setMeios(Comunicacao meio) {
		this.meios.add(meio);
	}
	
	
	
	
	
	
	

}
