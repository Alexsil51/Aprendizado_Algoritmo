package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex_6 {
	
	

	
		public static void main(String[]args) {
			int tamanhoVetor, produto = 1;
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			
			System.out.println("TAMANHO DO VETOR: ");
			tamanhoVetor = sc.nextInt();
			
			int vetor [] = new int [tamanhoVetor];
			
			for (int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = r.nextInt(10);
				produto*= vetor[i];
				System.out.printf("ELEMENTO [%d]: %d", i, vetor[i]);
				System.out.println("\n");
			}
			System.out.println("PRODUTO DOS ELEMENTOS: "+produto);
		}
		

}
