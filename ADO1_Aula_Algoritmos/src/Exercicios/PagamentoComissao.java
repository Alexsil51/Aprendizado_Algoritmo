package Exercicios;

import java.util.Scanner;

public class PagamentoComissao {

	
	public static void main(String[] args) {
		
		
		double identVendedor = 002;
		double codPeca = 5567;
		double qtdVendida;
		double precoPeca;
		double resultado;
		double comissao;
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nInforme Quantidade Pe�a: ");
		qtdVendida = entrada.nextDouble();
		
		System.out.print("\nInforme Pre�o Unit�rio: ");
		precoPeca = entrada.nextDouble();
		
		resultado = qtdVendida * precoPeca;
		
		comissao = (resultado * 5) / 100;
		
		System.out.println("\nTotal Venda: " + resultado + "\nCodigo Pe�a: " + codPeca + "\nComissao Vendedor: " + comissao + "\nID Vendedor: " + identVendedor);
	}
}
