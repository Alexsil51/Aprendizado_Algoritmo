package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex_4 {
	
	

	
		public static void main(String[]args) {
			int tamanhoVetor, menor = 100;
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("N° DE ELEMENTOS DO VETOR: ");
			tamanhoVetor = sc.nextInt();
			
			int vetor [] = new int[tamanhoVetor];
			
			for (int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = r.nextInt(100);
				menor = (vetor[i] < menor) ? menor = vetor[i] : menor;
				System.out.printf("ELEMENTO[%d]: %d", i, vetor[i]);
				System.out.println("\n");
				
			}
			System.out.println("MENOR ELEMENTO DO VETOR: "+menor);
		}

	}


