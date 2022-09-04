package Exercicios;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Ex_5 {

	

	
		public static void main(String[]args) {
			int tamanhoVetor, sum = 0;
			double media;
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			DecimalFormat df = new DecimalFormat("##.00");
			
			System.out.println("N° DE ELEMENTOS DO VETOR: ");
			tamanhoVetor = sc.nextInt();
			
			int vetor [] = new int [tamanhoVetor];
			
			for (int i = 0; i < tamanhoVetor; i++) {
				vetor[i] = r.nextInt(100);
				sum+= vetor[i];
				System.out.printf("ELEMENTO[%d]: %d", i, vetor[i]);
				System.out.println("\n");
			}
			media = sum/tamanhoVetor;
			System.out.println("MÉDIA: "+df.format(media));
		}
		
}
