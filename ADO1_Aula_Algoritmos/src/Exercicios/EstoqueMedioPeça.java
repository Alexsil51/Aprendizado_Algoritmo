package Exercicios;

import java.util.Scanner;

public class EstoqueMedioPe�a {

	
	public static void main(String[] args) {
		
		
		double QtdMinimo;
		double QtdMaximo;
		double EstoqueMedio;
		
		Scanner entrada = new Scanner(System.in);	
		System.out.print("Informe Quantidade pe�as vendidas: ");
		QtdMinimo = entrada.nextDouble();
		
		System.out.print("Informe Quantidade pe�as em Estoque: ");
		QtdMaximo = entrada.nextDouble();
		
		EstoqueMedio = (QtdMinimo + QtdMaximo)/ 2;
		
		System.out.println("O Estoque M�dio desta pe�a � " + EstoqueMedio);
	}
}
