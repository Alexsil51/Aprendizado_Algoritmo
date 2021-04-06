package Exercicios;

import java.util.Scanner;

public class ImprimeProduto {

	
	public static void main(String[] args) {
		
		
		int a;
		int b;
		int soma;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe Primeiro valor para Multiplicação: ");
	       a = entrada.nextInt();
	       
	   	System.out.print("Informe Segundo valor para Obter o Produto: ");
	       b = entrada.nextInt();
	       
	       soma = a * b;
	       
	       System.out.println("resultado: " + soma);
	}
}
