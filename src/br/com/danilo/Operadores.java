package br.com.danilo;

public class Operadores {

	public static void main(String[] args) {
		int anoDePublicacao = 1994;
		double avaliacao = 4.5;
		boolean planoPlus = false;
		String clienteVip = "regular";
		
		if(anoDePublicacao > 1990) System.out.println("O livro é atual.");
		else System.out.println("Um livro nostalgico");
		
		if (avaliacao == 5) {
			System.out.println("Excelente livro!");
		} else if (avaliacao < 5 && avaliacao > 4) {
			System.out.println("Um bom livro.");
		} else if (avaliacao < 4) {
			System.out.println("Um livro regular.");
		}
		
		if (planoPlus) System.out.println("Pode levar o livro.");
		else System.out.println("Voce deve alugar o livro");
		
		if (clienteVip.equals("vip") || planoPlus) System.out.println("Esse cliente é vip.");
		else System.out.println("Faça um plano para ser nosso cliente vip.");
	}

}
