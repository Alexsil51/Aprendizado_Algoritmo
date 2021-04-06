package Exercicios;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		
		
		double valorHora;
        double horasTrabalhadas;
        double valorMes;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor que você ganha a hora: ");

		valorHora = entrada.nextDouble();
		
		System.out.println("Informe as horas trabalhadas no mês");
		
		horasTrabalhadas = entrada.nextDouble();
		
		 valorMes = (valorHora * horasTrabalhadas);
		 
		 System.out.println("O valor do salário no mês é de " + valorMes);
	}
}
