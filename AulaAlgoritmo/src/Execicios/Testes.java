package Execicios;

import java.util.Scanner;

public class Testes {
	
	 public static void main(String[] args) {
	        
		 Scanner input = new Scanner(System.in);
		    
		 float base;
			float altura;
			float area;
			
			
			
			System.out.print("\nDigite a Base do Tri�ngulo: ");

			base = input.nextFloat();
			
			System.out.print("\nDigite a Altura do Tri�ngulo: ");

			altura = input.nextFloat();
			
			area = (base * altura)/ 2;
			
			
			double a; a = Math.sqrt(base * base + altura * altura);
			
			System.out.println("\nArea do Triangulo �: " + area);
			
			
			System.out.println("\nHipotenusa do Triangulo �: " + a);
			
		}
}
