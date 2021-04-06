package Exercicios;

import java.util.Scanner;

public class EstoqueMedioPeça {

	
	public static void main(String[] args) {
		
		
		double QtdMinimo;
		double QtdMaximo;
		double EstoqueMedio;
		
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Informe Quantidade peças vendidas: ");
		QtdMinimo = entrada.nextDouble();
		
		System.out.print("Informe Quantidade peças em Estoque: ");
		QtdMaximo = entrada.nextDouble();
		
		EstoqueMedio = (QtdMinimo + QtdMaximo)/ 2;
		
		System.out.println("O Estoque Médio desta peça é " + EstoqueMedio);
	}
}
