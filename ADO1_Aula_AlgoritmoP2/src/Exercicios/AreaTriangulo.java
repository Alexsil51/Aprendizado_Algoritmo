package Exercicios;

import java.util.Scanner;

public class AreaTriangulo {

	
	public static void main(String[] args) {
		
		
		float base;
		float altura;
		float area;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite a Base do Tri�ngulo: ");

		base = input.nextFloat();
		
		System.out.print("\nDigite a Altura do Tri�ngulo: ");

		altura = input.nextFloat();
		
		area = (base * altura)/ 2;
		
		System.out.println("Area do Triangulo �: " + area);
		
	}
}
