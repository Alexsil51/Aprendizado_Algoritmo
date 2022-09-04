package Exercicios;


import java.util.Random;

public class Ex_1 {
	
	
		public static void main(String[]args) {
		Random r = new Random();	
			int [] v = new int[3];
			
			//preenchimento do vetor com elementos aleatórios
			for (int i = 0; i < v.length; i++) {
				v[i] = r.nextInt(100);
			}
			for (int j = 0; j < v.length; j++) {
				System.out.println(v[j]);
			}
		} 

	}


