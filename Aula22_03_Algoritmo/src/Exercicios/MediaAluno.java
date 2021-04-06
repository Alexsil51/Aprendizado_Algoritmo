package Exercicios;

import java.util.Scanner;



public class MediaAluno {

	
	public static void main(String[] args) {
		
		
		float n1, n2, n3, media;
		int faltas;
		String nomeAluno;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*--* Calcular Média *--*");
		System.out.println("Nome: ");
		nomeAluno = entrada.next();
		
		System.out.println("N1: ");
		n1 = entrada.nextFloat();
		
		System.out.println("N2: ");
		n2 = entrada.nextFloat();
		
		System.out.println("N3: ");
		n3 = entrada.nextFloat();
		
		System.out.println("Quantidade Faltas: ");
		faltas = entrada.nextInt();
		
		media = (n1 + n2 + n3)/ 3;
		
		if (media >= 6 && faltas <= 10 ) {
			System.out.println(nomeAluno + "\nEsta APROVADO \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
			
			}
		
		else {
			System.out.println(nomeAluno + "\nEsta REPROVADO \nCom Média: " + media + "\nNúmero Faltas: " + faltas);
		}
	}
}
