package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex_3 {

	

			public static void main(String[]args) {
			int tamanhoVetor, maior = 0;
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("N° DE ELEMENTOS DO VETOR: ");
			tamanhoVetor = sc.nextInt();
			
			int vetor [] = new int[tamanhoVetor];
			
			for (int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = r.nextInt(100);
				maior = (vetor[i] > maior) ? maior = vetor[i] : maior;
				System.out.printf("ELEMENTO[%d]: %d",i , vetor[i]);
				System.out.println("\n");
			}
			System.out.println("MAIOR ELEMENTO DO VETOR É: "+maior);
		}

	}
	

