package br.ufg.inf.es.integracao.topico03.modelologico;

public class Endereço {
	private String bairro;
	private String distrito;
	private String municipio;
	private String estado;
	private int cep;
	private int caixapostal;
	private int pais;
	private String tipoendereço;
	private Data datainicial;
	private Data datafinal;
	private LinhaEnd linhaextra;
	
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
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
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getCaixapostal() {
		return caixapostal;
	}
	public void setCaixapostal(int caixapostal) {
		this.caixapostal = caixapostal;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public String getTipoendereço() {
		return tipoendereço;
	}
	public void setTipoendereço(String tipoendereço) {
		this.tipoendereço = tipoendereço;
	}
	public Data getDatainicial() {
		return datainicial;
	}
	public void setDatainicial(Data datainicial) {
		this.datainicial = datainicial;
	}
	public Data getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(Data datafinal) {
		this.datafinal = datafinal;
	}
	public LinhaEnd getLinhaextra() {
		return linhaextra;
	}
	public void setLinhaextra(LinhaEnd linhaextra) {
		this.linhaextra = linhaextra;
	}
	
	
}
