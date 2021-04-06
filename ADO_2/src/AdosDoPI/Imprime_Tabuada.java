package AdosDoPI;

import java.util.Scanner;

public class Imprime_Tabuada {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero ;
		System.out.println("Digite um numero de 1 a 10"); 
		numero = ler.nextInt();
		for (int i=1;i<=10;i++){

		        System.out.println(numero + " x " + i + " = " + numero*i);

		   }

		}
		}