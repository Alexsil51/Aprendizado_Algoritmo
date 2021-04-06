package Exercicios;

import java.util.Scanner;

public class CalculeQuadrado4NumeosESoma {

	
	public static void main(String[] args) {
		
		
		double a; 
		double b;
		double c;
		double d;
		double calculo1;
		double calculo2;
		double calculo3;
		double calculo4;
		double calculo5;   
		   
	       Scanner entrada = new Scanner(System.in);
	       
	       System.out.print("\nInforme 1° valor que queira elevar ao Quadrado: ");
	       a = entrada.nextDouble();
	       
	       
	       System.out.print("\nInforme 2° valor que queira elevar ao Quadrado: ");
	       b = entrada.nextDouble();
	       
	       System.out.print("\nInforme 3° valor que queira elevar ao Quadrado: ");
	       c = entrada.nextDouble();
	       
	       System.out.print("\nInforme 4° valor que queira elevar ao Quadrado: ");
	       d = entrada.nextDouble();
	       
	       
	       calculo1 = Math.pow(a,2); 
	       calculo2 = Math.pow(b,2);
	       calculo3 = Math.pow(c,2);
	       calculo4 = Math.pow(d,2);
	       
	       calculo5 = calculo1 + calculo2 + calculo3 + calculo4;
	      
			System.out.println("resultado: " + calculo5);
	}
}
