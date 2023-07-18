package com.murilo.training;

import java.util.Arrays;

public class Agenda {

	private Contato[] contatos;

	public Agenda() {
		contatos = new Contato[5];
	}

	public void adicionarContato(Contato c) throws AgendaCheiaException {

		boolean cheia = true;

		for (int i = 0; i < contatos.length; i++) {

			if (contatos[i] == null) {
				contatos[i] = c;
				cheia = false;
				break;
			}
		}
		if (cheia) {
			throw new AgendaCheiaException();
		}

	}

	public int consultarContato(String a) throws ContatoNaoExisteException {

		for (int i = 0; i < contatos.length; i++) {
			if (contatos[i] != null) {
				if (contatos[i].getNome().equalsIgnoreCase(a)) {
					System.out.println("Contato existe!");
					System.out.println(contatos[i]);
					return i;
				}
			}
		}
		throw new ContatoNaoExisteException(a);
		
	}

	@Override
	public String toString() {
		String s = "";
		for(Contato c : contatos) {
			s+= c;
		}
		return s;
	}

}
