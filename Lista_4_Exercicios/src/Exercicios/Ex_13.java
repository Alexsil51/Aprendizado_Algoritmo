package Exercicios;

import java.util.Random;

public class Ex_13 {
	
			public static void main(String[] args) {
			Random r = new Random();

			int vetorA[] = new int[10];
			int vetorB[] = new int[10];
			int vetorC[] = new int[vetorA.length + vetorB.length];

			for (int i = 0; i < vetorA.length & i < vetorB.length; i++) {
				vetorA[i] = r.nextInt(30);
				vetorB[i] = r.nextInt(30);
				// REMOVER OS COMENTÁRIOS PARA MOSTRAR OS ELEMENTOS DOS VETORES A E B
				// System.out.printf("VETOR A [%d]: %d\n", i, vetorA[i]);
				// System.out.printf("VETOR B [%d]: %d\n", i, vetorB[i]);
			}
			for (int i = 0; i < vetorC.length; i++) {
				if (i < vetorA.length) {
					vetorC[i] = vetorA[i];
					System.out.printf("VETOR C[%d]: %d\n", i, vetorC[i]);
				} else {
					for (int j = 0; j < vetorC.length; j++) {
						vetorC[i] = vetorB[j];
						System.out.printf("VETOR C[%d]: %d\n", i, vetorC[i]);
						i++;
					}
				}
			}
		}
	}
	


