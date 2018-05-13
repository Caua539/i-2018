package br.ufg.inf.es.integracao.topico03.modelologico;

import java.util.Calendar;

public class Identificador {
	protected int designacao;
	protected int area;
	protected String emissor;
	protected Calendar dataemissao;
	protected int tipo;
	
	public int getDesignacao() {
		return designacao;
	}
	public void setDesignacao(int designacao) {
		this.designacao = designacao;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getEmissor() {
		return emissor;
	}
	public void setEmissor(String emissor) {
		this.emissor = emissor;
	}
	public String getEmissao() {
		return (dataemissao.get(Calendar.YEAR)+"/"+ (dataemissao.get(Calendar.MONTH)+1)+"/"+ dataemissao.get(Calendar.DAY_OF_MONTH));
	}
	public void setEmissao(Calendar emissao) {
		this.dataemissao = emissao;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
}
