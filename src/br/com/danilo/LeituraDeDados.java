package br.com.danilo;
import java.util.Scanner;

public class LeituraDeDados {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int anoDePublicacao = 0;
		double avaliacao = 0;
		String clienteVip = "";
		
		System.out.println("Digite o ano de publicação");
		anoDePublicacao = scanner.nextInt();
		System.out.println("Digite a sua avaliação");
		avaliacao = scanner.nextDouble();
		System.out.println("Digite o tipo do cliente");
		clienteVip = scanner.next();
		
		System.out.println("Ano de publicação: " + anoDePublicacao);
		System.out.println("Avaliação: " + avaliacao);
		System.out.println("Tipo cliente: " + clienteVip);
	}
}
