package Exercicios;

import java.util.Scanner;

public class ImprimeNumeroESoma {

	public static void main(String[] args) {
		
		
		float a;
		float b;
		float soma;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite o Primeiro valor: ");

		a = input.nextFloat();
		
		
		System.out.print("\nDigite o Segundo valor: ");

		b = input.nextFloat();
		
		soma = a + b;
		System.out.println("\nPrimeiro Número Digitado: " + a + "\nSegundo Número Digitado: " + b + "\nResultado: " + soma);
	}
}
