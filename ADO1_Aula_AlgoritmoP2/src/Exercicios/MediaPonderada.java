package Exercicios;

import java.util.Scanner;

public class MediaPonderada {

	
	public static void main(String[] args) {
		
		double n1;
		double n2;
		double media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme a Primeira Nota: ");
		n1 = entrada.nextInt();
		
		System.out.print("\nInforme a Segunda Nota: ");
		n2 = entrada.nextInt();
		
		media = (n1 + n2) / 2;
		
		if (media >=5)
		{
			System.out.println("\nA Média do Aluno è: " + media + "\nAluno Aprovado");
			
		}
		else
		{
			System.out.println("\nA Média do Aluno è: " + media + "\nAluno Reprovado");
		}
	}
}
