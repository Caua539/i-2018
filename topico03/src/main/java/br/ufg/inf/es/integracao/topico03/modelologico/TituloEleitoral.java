package br.ufg.inf.es.integracao.topico03.modelologico;

public class TituloEleitoral extends Identificador {
	private int secao;
	private int zona;
	
	public int getSecao() {
		return secao;
	}
	public void setSecao(int secao) {
		this.secao = secao;
	}
	public int getZona() {
		return zona;
	}
	public void setZona(int zona) {
		this.zona = zona;
	}
	
	
}
