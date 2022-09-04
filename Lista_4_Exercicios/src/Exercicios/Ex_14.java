package Exercicios;

import java.util.Random;

public class Ex_14 {


			public static void main(String[] args) {
			Random r = new Random();

			int vetorA[] = new int[10];
			int vetorB[] = new int[10];
			int vetorC[] = new int[vetorA.length + vetorB.length];

			for (int i = 0, j = 0; i < vetorC.length; i++) {

				vetorA[i] = r.nextInt(50);
				vetorB[i] = r.nextInt(50);

				if (i == 0 || i % 2 == 0)
					vetorC[i] = vetorA[i];
				else
					vetorC[i] = vetorB[i];

				System.out.printf("VETOR C[%d]: %d\n", i, vetorC[i]);
			}
		}
	}
	

