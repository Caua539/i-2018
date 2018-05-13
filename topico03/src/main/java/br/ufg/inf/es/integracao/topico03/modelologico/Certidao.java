package br.ufg.inf.es.integracao.topico03.modelologico;

public class Certidao extends Identificador {
	private String tipocertidao;
	private String cartorio;
	private int livro;
	private int folha;
	private int termo;
	
	

	public String getTipocertidao() {
		return tipocertidao;
	}
	public void setTipocertidao(String tipocertidao) {
		this.tipocertidao = tipocertidao;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public int getLivro() {
		return livro;
	}
	public void setLivro(int livro) {
		this.livro = livro;
	}
	public int getFolha() {
		return folha;
	}
	public void setFolha(int folha) {
		this.folha = folha;
	}
	public int getTermo() {
		return termo;
	}
	public void setTermo(int termo) {
		this.termo = termo;
	}
	
	
	
}
