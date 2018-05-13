package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.Calendar;

public class Data {
	private Calendar data;
	private String acuraciadia;
	private String acuraciames;
	private String acuraciaano;
	
	public Data(int ano, int month, int date) {
		Calendar c = Calendar.getInstance();
		c.set(ano, month, date);
		data = c;
		acuraciadia = "alta";
		acuraciames = "baixa";
		acuraciaano = "baixa";

		
	}
	
	public String getData() {
		return (data.get(Calendar.YEAR)+"/"+ (data.get(Calendar.MONTH)+1)+"/"+ data.get(Calendar.DAY_OF_MONTH));
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getAcuraciadia() {
		return acuraciadia;
	}
	public void setAcuraciadia(String acuraciadia) {
		this.acuraciadia = acuraciadia;
	}
	public String getAcuraciames() {
		return acuraciames;
	}
	public void setAcuraciames(String acuraciames) {
		this.acuraciames = acuraciames;
	}
	public String getAcuraciaano() {
		return acuraciaano;
	}
	public void setAcuraciaano(String acuraciaano) {
		this.acuraciaano = acuraciaano;
	}
}
