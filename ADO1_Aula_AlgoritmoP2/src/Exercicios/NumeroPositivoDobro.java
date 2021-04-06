package Exercicios;

import java.util.Scanner;

public class NumeroPositivoDobro {
	
	public static void main(String[] args) {
		
		
		int a;
		int b;
		int resposta;
		int resposta1;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme Um Número Inteiro: ");
		a = entrada.nextInt();
		
		System.out.print("\nInforme Outro Número Inteiro: ");
		b = entrada.nextInt();
		
		resposta = a * 2;
		resposta1 = b * 2;
		
		
		
		System.out.println("\nResultado Primeiro Numero Digitado ao dobro: " + resposta + "\nResultado Segundo Numero Digitado ao dobro: " + resposta1);
	}

}
