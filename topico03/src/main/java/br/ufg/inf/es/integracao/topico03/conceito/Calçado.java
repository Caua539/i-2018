package br.ufg.inf.es.integracao.topico03.conceito;

public class Calçado {
	protected String marca = "";
	protected float preço = 0;
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getPreço() {
		return preço;
	}
	public void setPreço(float preço) {
		this.preço = preço;
	}
	@Override
	public String toString() {
		return "Calçado [marca=" + marca + ", preço=" + preço + "]";
	}

}
