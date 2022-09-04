package Exercicios;

import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class Ex_12 {
	


			public static void main(String[]args) {
			int somaA = 0, somaB = 0, size; 
			double mediaA = 0, mediaB = 0, maiorSoma, menorMedia;
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			DecimalFormat df = new DecimalFormat("##.00");
			
			System.out.println("N° DE POSIÇÕES DOS VETORES: ");
			size = sc.nextInt();
			
			int vetorA[] = new int[size];
			int vetorB[] = new int[size];
			
			for (int i = 0; i < vetorA.length & i < vetorB.length; i++) {
				vetorA[i] = r.nextInt(30);
				vetorB[i] = r.nextInt(30);
				
				somaA += vetorA[i];
				somaB += vetorB[i];
			}
			mediaA = somaA/size;
			mediaB = somaB/size;
			
			if (somaA > somaB) {
				maiorSoma = somaA;
				System.out.println("MAIOR SOMA: VETOR A");
			} else {
				maiorSoma = somaB;
				System.out.println("MAIOR SOMA: VETOR B");
			}
			
			if (mediaA < mediaB) {
				menorMedia = mediaA;
				System.out.println("MENOR MÉDIA: VETOR A");
			} else {
				menorMedia = mediaB;
				System.out.println("MENOR MÉDIA: VETOR B");
			}
			
			System.out.println("VALOR DA SOMA: "+maiorSoma+". VALOR DA MÉDIA: "+menorMedia);
			
		}

	}
	


