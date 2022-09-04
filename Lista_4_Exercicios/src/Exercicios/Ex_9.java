package Exercicios;

import java.util.Random;

public class Ex_9 {
	

		public static void main(String[] args) {
			Random r = new Random();

			int vA[] = new int[5];
			int vB[] = new int[5];
			int vC[] = new int[5];

			for (int i = 0; i < 5; i++) {
				vA[i] = r.nextInt(10);
				vB[i] = r.nextInt(10);
				vC[i] = vA[i] * vB[i];
				System.out.printf("ELEMENTO VETOR A[%d]: %d. ELEMENTO VETOR B[%d]: %d. RESULTADO: %d", i, vA[i], i, vB[i],
						vC[i]);
				System.out.println("\n");
			}
		}
	}
	


