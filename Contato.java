package com.murilo.training;

public class Contato {

	private String nome, telefone;
	private int id;
	private static int contador = 0;

	public Contato() {
		contador++;
		id = contador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\ntelefone: " + telefone + "\nid: " + id + "\n";
	}

}
