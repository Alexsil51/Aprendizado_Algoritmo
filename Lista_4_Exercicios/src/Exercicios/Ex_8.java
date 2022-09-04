package Exercicios;

import java.util.Scanner;
import java.util.Random;


public class Ex_8 {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			int event, count = 0;

			int vetor[] = new int[10];
			int temp[] = new int[10];

			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = r.nextInt(10);
			}

			System.out.println("NÚMERO A SER PROCURADO: ");
			event = sc.nextInt();

			for (int j = 0, i = 0; j < vetor.length; j++) {
				System.out.printf("ELEMENTO[%d]: %d\n", j, vetor[j]);
				if (vetor[j] == event) {
					count++;
					temp[i] = j;
					i++;
				}

			}
			int position[] = new int[count];

			if (count > 0) {
				for (int i = 0, j = 0; i < position.length; i++, j++) {
					position[i] = temp[j];
					System.out.printf("VALOR ENCONTRADO NA POSIÇÃO [%d].\n", position[i]);
				}
			} else {
				System.out.println("VALOR NÃO ENCONTRADO.");
			}

		}
	}
	

