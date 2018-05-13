package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.Calendar;

public class Vinculo {
	private String relacionamento;
	private Calendar datainicio;
	private Calendar datafim;
	private Identificador id;
	
	
	public String getRelacionamento() {
		return relacionamento;
	}
	public void setRelacionamento(String relacionamento) {
		this.relacionamento = relacionamento;
	}
	public Calendar getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(Calendar datainicio) {
		this.datainicio = datainicio;
	}
	public Calendar getDatafim() {
		return datafim;
	}
	public void setDatafim(Calendar datafim) {
		this.datafim = datafim;
	}
	public Identificador getId() {
		return id;
	}
	public void setId(Identificador id) {
		this.id = id;
	}
	
	
	

}
