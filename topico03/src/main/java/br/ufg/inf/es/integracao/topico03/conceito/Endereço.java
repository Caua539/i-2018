package br.ufg.inf.es.integracao.topico03.conceito;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"logradouro", "numero", "complemento", "cep"})
public class Endereço {
	private String logradouro = "";
	private String complemento = "";
	private int cep  = 0;
	private int numero = 0;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	

}
