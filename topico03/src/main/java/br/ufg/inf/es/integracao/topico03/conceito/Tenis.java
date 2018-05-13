package br.ufg.inf.es.integracao.topico03.conceito;

public class Tenis extends Calçado {
	private String esporte = "";

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	@Override
	public String toString() {
		return "Tenis [marca=" + marca + ", preço=" + preço +", esporte=" + esporte + "]";
	}
	
	

}
