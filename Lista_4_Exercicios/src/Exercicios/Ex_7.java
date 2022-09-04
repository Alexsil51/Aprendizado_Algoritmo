package Exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex_7 {

	

	
		public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			Random r = new Random();
			int multi, result;
			
			System.out.println("VALOR: ");
			multi = sc.nextInt();
			
			int vetor [] = new int[10];
			
			for (int i = 0; i < vetor.length; i++) {
				vetor[i] = r.nextInt(100);
				result = vetor[i] * multi;
				
				System.out.printf("VETOR[%d] DE VALOR %d * %d = %d\n", i, vetor[i], multi,  result);
			}
			
			
		}
		
}
