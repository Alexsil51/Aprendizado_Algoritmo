package Exercicios;

import java.util.Scanner;

public class CotacaoDolar {
	
	public static void main(String[] args) {
		
		double real;
		double dolar;
		double cotacao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite a Quantidade em Dólar: ");

		dolar = input.nextFloat();
		
		System.out.print("\nDigite a Cotação do Dólar: ");

		cotacao = input.nextFloat();
		
		real = dolar * cotacao;
		
		System.out.println("\nQuantia em Reais R$: " + real);
	}

}
