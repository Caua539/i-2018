package br.ufg.inf.es.integracao.topico03.modelologico;

public class Nome {
	private String nome;
	private String sobrenome;
	private String sufixo;
	private String titulo;
	private boolean nomepreferido;
	private Representacao rep;
	private Utilizacao uso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSufixo() {
		return sufixo;
	}
	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean isNomepreferido() {
		return nomepreferido;
	}
	public void setNomepreferido(boolean nomepreferido) {
		this.nomepreferido = nomepreferido;
	}
	public Representacao getRep() {
		return rep;
	}
	public void setRep(Representacao rep) {
		this.rep = rep;
	}
	public Utilizacao getUso() {
		return uso;
	}
	public void setUso(Utilizacao uso) {
		this.uso = uso;
	}
	
	
	
	
	
	
}
