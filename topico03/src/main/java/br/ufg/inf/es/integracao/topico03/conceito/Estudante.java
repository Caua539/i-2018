package br.ufg.inf.es.integracao.topico03.conceito;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estudante {
	@JsonProperty("Endereço")
	Endereço address = new Endereço();

	public Endereço getAddress() {
		return address;
	}

	public void setAddress(Endereço address) {
		this.address = address;
	}
	

}
