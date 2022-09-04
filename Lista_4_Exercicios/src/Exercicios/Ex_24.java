package Exercicios;

import java.util.Scanner;

public class Ex_24 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int nLin, nCol;

			System.out.println("NÚMERO DE LINHAS: ");
			nLin = sc.nextInt();
			System.out.println("NÚMERO DE COLUNAS: ");
			nCol = sc.nextInt();

			int matriz[][] = new int[nLin][nCol];

			for (int i = 0; i < nLin; i++) {
				for (int j = 0; j < nCol; j++) {
					
					if (j % 2 == 1) {
						matriz[i][j] = 7;
					} else {
						matriz[i][j] = 4;
					}

					System.out.printf("ELEMENTO[%d][%d]: %d\n", i, j, matriz[i][j]);
				}
			}
		}
	}
	


