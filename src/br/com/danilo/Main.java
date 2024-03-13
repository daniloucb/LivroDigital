package br.com.danilo;

public class Main {

	public static void main(String[] args) {
		
		// text block
		String welcome = """
				Seja bem vindo a biblioteca digital
				Um lugar de muito saber
				""";
		
		System.out.println("*******************");
		System.out.println(welcome);
		System.out.println("*******************");
		
		String nomeLivro = "Star Wars";
		int anoDePublicacao = 1994;
		double avaliacao = 4.5;
		boolean planoPlus = true;
		double mediaAvaliacao = 0;
		int valor;
		String sinopse = "Um ótimo livro para passar o tempo";
		
		mediaAvaliacao = (4.5 + 4.8 + 3.8) / 3;
		
		valor = (int) mediaAvaliacao;
		
		System.out.println("Nome: " + nomeLivro);
		System.out.println("Ano de publicação: " + anoDePublicacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Plano plus: " + planoPlus);
		System.out.println("Media das avaliações: " + valor);
		System.out.println("Sinopse: " + sinopse);
	}

}
