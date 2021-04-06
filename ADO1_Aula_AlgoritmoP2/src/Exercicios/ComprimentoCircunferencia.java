package Exercicios;

import java.util.Scanner;

public class ComprimentoCircunferencia {

	
	public static void main(String[] args) {
		
		
		double pi = 3.14;
		double raio; 
		double area;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme raio da Circunferência: ");
		raio = entrada.nextInt();
		
		System.out.print("\nInforme o raio: ");
		area = entrada.nextInt();
		
		area = pi * (raio*raio);
		
		 System.out.println("\nresultado: " + area);
		
	}
}
