package Exercicios;

import java.util.Scanner;

public class LeNumeroImprime {

	
	public static void main(String[] args) {
		
		float numero;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um Número: ");
		numero = entrada.nextFloat();
		
		System.out.println("Valor Informado Foi: " + numero);
	}
}
