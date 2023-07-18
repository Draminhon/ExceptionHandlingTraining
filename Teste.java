package com.murilo.training;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int escolha = 1;
		String nome;
		Agenda agenda = new Agenda();

		System.out.println("Digite 1 para inserir, 2 para procurar por um nome e 3 para terminar e exibir");

		while (true) {

			System.out.println("Digite sua escolha:");
			try {

				escolha = scan.nextInt();

				if (escolha < 0 || escolha > 3) {
					throw new OpcaoInvalidaException();
				}

			} catch (OpcaoInvalidaException e) {
				System.out.println(e.getMessage());
			}

			if (escolha == 3) {
				System.out.println(agenda);
				break;
			} else if (escolha == 2) {

				System.out.println("Digite o nome a ser pesquisado:");
				 nome = scan.next();
				try {

					int valor = agenda.consultarContato(nome);
					
					if(valor <0) {
						throw new ContatoNaoExisteException(nome);
					}
					
				} catch (ContatoNaoExisteException e) {
					
					System.out.println(e.getMessage());
					
				}

			} else if (escolha == 1) {

				Contato contato = new Contato();
				System.out.println("Digite o nome: ");
				contato.setNome(scan.next());
				System.out.println("Digite o telefone: ");
				contato.setTelefone(scan.next());

				try {
					agenda.adicionarContato(contato);
				} catch (AgendaCheiaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

}
