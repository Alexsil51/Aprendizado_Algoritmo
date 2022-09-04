package Exercicios;

import java.util.Scanner;

public class Ex_22 {

			public static void main(String[]args) {
			Scanner sc = new Scanner(System.in);
			int nCol, nLin;
			
			System.out.println("NÚMERO DE LINHAS: ");
			nLin = sc.nextInt();
			System.out.println("NÚMERO DE COLUNAS: ");
			nCol = sc.nextInt();
					
			int matriz [][] = new int[nLin][nCol];
			
			for (int i = 0; i < nLin; i++) {
				for (int j = 0; j < nCol; j++) {
					matriz[i][j] = 20;
					System.out.printf("ELEMENTO[L%d][C%d]: %d\n",i , j, matriz[i][j]);
				}
			}
		}
	}
	

