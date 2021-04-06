package Exercicios;

import java.util.Scanner;

public class ImprimeQuadrado {

	
	public static void main(String[] args) {
		
		
		
       double a; 
	   double calculo;
	   
	   
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Informe um valor que queira elevar ao Quadrado: ");
       a = entrada.nextDouble();
       
       calculo = Math.pow(a,2);
       
		System.out.println("resultado: " + calculo);
	}
}
