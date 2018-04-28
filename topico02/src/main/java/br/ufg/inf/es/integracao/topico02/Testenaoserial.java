package br.ufg.inf.es.integracao.topico02;

/**
 * Classe não serializable simples com nome e idade;
 * @author caua539
 *
 */
public class Testenaoserial {
	
	private int age;
	private String name = new String();
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
