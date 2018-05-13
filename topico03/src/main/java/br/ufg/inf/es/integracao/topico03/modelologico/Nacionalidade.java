package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.Calendar;

public class Nacionalidade {
	private String municipio;
	private String estado;
	private String pais;
	private Calendar datapais;
	
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Calendar getDatapais() {
		return datapais;
	}
	public void setDatapais(Calendar datapais) {
		this.datapais = datapais;
	}
	
	
}
