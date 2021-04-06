package Exercicios;

import java.util.Scanner;

public class DescontoCompra {
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		double valortotal, desconto;

		System.out.print("\nDigite o valor da compra: ");

		valortotal = input.nextDouble();
		
		if(valortotal <= 299.99)
		{
		desconto = 1 - 0.15;
		desconto = valortotal * desconto;
		}
		else if (valortotal >= 300.00)
		{
		desconto = 1 - 0.20;
		desconto = valortotal * desconto;
		
		}
		else 
		{
		desconto = 1 - 0.10;
		desconto = valortotal - desconto;
		}
		desconto = valortotal - desconto;
		
		System.out.println("\nValor Total Compra : " + valortotal + "\nValor desconto : " + desconto + "\nValor da Compra com Desconto : " + (valortotal-desconto));
		
		
		}
		
	    

		}

		
	


