package Exercicios;

import java.util.Random;

public class Ex_11 {
	
		public static void main(String[] args) {
			int size = 0;
			double sum = 0, media = 0;
			Random r = new Random();

			int vetor[] = new int[10];
			int temp[] = new int[vetor.length];

			for (int i = 0, j = 0; i < vetor.length; i++) {
				vetor[i] = r.nextInt(20);
				sum += vetor[i];
				// RETIRAR O COMENTÁRIO PARA MOSTRAR OS ELEMENTOS DO VETOR
				// System.out.printf("ELEMENTO[%d]: %d\n", i, vetor[i]);
			}

			media = (sum / vetor.length);

			for (int j = 0, i = 0; i < vetor.length; i++) {
				if (vetor[i] > media) {
					temp[j] = vetor[i];
					j++;
					size++;
				}
			}

			int mediaVet[] = new int[size];

			System.out.println("MÉDIA: " + media + "\n");
			System.out.println("ELEMENTOS ACIMA DA MÉDIA: " + mediaVet.length + "\n");
			for (int i = 0; i < mediaVet.length; i++) {
				mediaVet[i] = temp[i];
				System.out.printf("ELEMENTO[%d]: %d\n", i, mediaVet[i]);
			}
		}

	}
	

