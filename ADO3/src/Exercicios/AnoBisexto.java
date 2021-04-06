package Exercicios;

import java.util.Scanner;

public class AnoBisexto {

	
	public static void main(String[] args) {
		
		
		int ano = 0;
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("\nDigite o ano que deseja verificar : ");
		ano = input.nextInt();
		
		
		
		if (((ano % 4 == 0 ) && (ano % 100 != 0)) || (ano % 400 == 0)) {
			System.out.println("Este ano " + ano + " é ano Bisexto.");
		}
		
		else {
			System.out.println("Este ano " + ano + " Não é ano Bisexto.");
		}
	}
}
