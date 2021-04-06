package Exercicios;

import java.util.Scanner;

public class IdentifiqueOsDados {

	
	public static void main(String[] args) {
		
		
		int codPeca = 534455;
		double valorPeca = 75.00;
		double QtdPeca;
		double calculo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe Quantidade peças vendidas: ");
		QtdPeca = entrada.nextDouble();
		
		calculo = (valorPeca * QtdPeca);
		
		System.out.println("Valor Total da Compra: " + calculo + "\nCodigo Produto: " + codPeca);
		
	}
}
