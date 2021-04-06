package Exercicios;

import java.util.Scanner;

public class Dados3Valores {

	
	public static void main(String[] args) {
	    System.out.println("Triangulo");

	
	int x, y, z;//declarando variaveis
	
	
	Scanner lado1 = new Scanner (System.in);//lendo dados do teclado, pois e o usuario que vai inserir os dados
	System.out.print("\nDigite o Primeiro valor : ");
	x = lado1.nextInt();
	
	
	Scanner lado2 = new Scanner (System.in);
	System.out.print("\nDigite o Segundo valor : ");
	y = lado2.nextInt();
	
	
	Scanner lado3 = new Scanner (System.in);
	System.out.print("\nDigite o Terceiro valor : ");
	
	z = lado3.nextInt();
	if (x < y + z || y < x + z || z < x+y){
		System.out.println("Trata-se de um triangulo");
	}

                     //comparando se eh um triangulo

	if (x == y && x == z){
		System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
	}else if(x == y || x == z){
		System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
		}else
		System.out.println("Três lados diferentes.");


	
	
}
}
	
	

			

	
