package Exercicios;

import java.util.Scanner;

public class CotacaoDolar {
	
	public static void main(String[] args) {
		
		double real;
		double dolar;
		double cotacao;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite a Quantidade em D�lar: ");

		dolar = input.nextFloat();
		
		System.out.print("\nDigite a Cota��o do D�lar: ");

		cotacao = input.nextFloat();
		
		real = dolar * cotacao;
		
		System.out.println("\nQuantia em Reais R$: " + real);
	}

}
