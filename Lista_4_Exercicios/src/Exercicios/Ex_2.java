package Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex_2 {
	

			public static void main(String[]args) {
			int tamanhoVetor, sum = 0;
			Random r = new Random();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("N° DE ELEMENTOS DO VETOR");
			tamanhoVetor = sc.nextInt();
			
			int vetor [] = new int[tamanhoVetor];
			
			//preenchimento do vetor com elementos aleatórios
			for (int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = r.nextInt(50);
			}
			//soma dos valores contidos no vetor
			for (int i = 0; i < tamanhoVetor; i++) {
				System.out.printf("ELEMENTO[%d]: %d ", i, vetor[i]);
				System.out.println("\n");
				sum += vetor[i];
			}
			System.out.println("SOMA: "+sum);
		}
	}


