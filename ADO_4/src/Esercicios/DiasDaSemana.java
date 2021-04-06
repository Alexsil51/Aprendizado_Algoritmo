package Esercicios;

import java.util.Scanner;

public class DiasDaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		while(numero != 0);{
		System.out.println("Informe um número para verificar o Dia Correspondente: ");
		numero = entrada.nextInt();
		
		 switch (numero){

	     case 1:
	         System.out.println("Domingo");
	         break;
	     case 2:
	         System.out.println("Segunda-Feira");
	         break;
	     case 3:
	         System.out.println("Terça-Feira");
	         break;
	     case 4:
	         System.out.println("Quarta-Feira");
	         break;
	     case 5:
	         System.out.println("Quinta-Feira");
	         break;
	     case 6:
	         System.out.println("Sexta-Feira");
	         break;
	     case 7:
	         System.out.println("Sábado");
	         break;
	    

	     default:
	         System.out.println("Dia Invalido");
		  }
		}
	}
}
	
	
	


