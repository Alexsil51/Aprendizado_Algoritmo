package Exercicios;

import java.util.Scanner;

public class ConverterTemperatura {

	
	public static void main(String[] args) {
		
		
		int celsius;
		int fah;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme a Temperatura em Fahrenheit: ");
		fah = entrada.nextInt();
		
		celsius = (fah - 32) * 5 / 9;
		
		 System.out.println("\nA Conversão de Graus Fahrenheit para Graus Celsius é: " + celsius + "°C");
	}
}
