package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.Calendar;

public class Utilizacao {
	private int uso;
	private Calendar inicial;
	private Calendar datafinal;
	private Identificador id;
	
	public int getUso() {
		return uso;
	}
	public void setUso(int uso) {
		this.uso = uso;
	}
	public Calendar getInicial() {
		return inicial;
	}
	public void setInicial(Calendar inicial) {
		this.inicial = inicial;
	}
	public Calendar getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(Calendar datafinal) {
		this.datafinal = datafinal;
	}
	public Identificador getId() {
		return id;
	}
	public void setId(Identificador id) {
		this.id = id;
	}
	
	
}
