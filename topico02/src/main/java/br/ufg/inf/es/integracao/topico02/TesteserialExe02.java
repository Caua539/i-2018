package br.ufg.inf.es.integracao.topico02;

import java.io.Serializable;

/**
 * Classe Serializable simples com nome e idade
 * @author caua539
 *
 */
@SuppressWarnings("serial")
public class TesteserialExe02 implements Serializable {
	private String nome = new String();
	private int idade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	
}