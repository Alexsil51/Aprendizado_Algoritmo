package Exercicios;

import java.util.Random;

public class Ex_19 {



			public static void main(String[] args) {
			Random r = new Random();

			int vetor[] = new int[20];

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = r.nextInt(100);
				// System.out.printf("VETOR[%d]: %d\n", i, vetor[i]);
				// retirar o comentário caso queira conferir os valores.
			}
			for (int i = 0; i < vetor.length; i += 2) {
				System.out.printf("VETOR[%d]: %d\n", i, vetor[i]);
			}
		}

	}
	

