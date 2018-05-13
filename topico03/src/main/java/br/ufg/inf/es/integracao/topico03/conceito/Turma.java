package br.ufg.inf.es.integracao.topico03.conceito;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Turma {
	@JacksonXmlElementWrapper(useWrapping = false)
	@JsonProperty("Estudante")
	Estudante[] lista;

	public Estudante[] getLista() {
		return lista;
	}

	public void setLista(Estudante[] lista) {
		this.lista = lista;
	}

}
