package br.ufg.inf.es.integracao.topico02;

import java.io.Serializable;

/**
 * Classe Serializable simples com nome e idade e uma instancia de outra classe
 * @author caua539
 *
 */
@SuppressWarnings("serial")
public class TesteserialExe01 implements Serializable {
	private String nome = new String();
	private int idade;
	private Testenaoserial teeste = new Testenaoserial();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
		teeste.setName(nome);
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		teeste.setAge(idade);
	}	
}