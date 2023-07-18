package com.murilo.training;

public class ContatoNaoExisteException extends Exception{

	
	private String nomeContato;
	
	public ContatoNaoExisteException(String nome) {
		this.nomeContato = nome;
	}
	
	public String getMessage() {
		return "O contato " + nomeContato + " não existe na agenda";
	}
}
