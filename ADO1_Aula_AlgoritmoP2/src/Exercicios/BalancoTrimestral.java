package Exercicios;

public class BalancoTrimestral {
	
	public static void main(String[] args) {
		
		
		int gastoJaneiro = 15000;
		int gastoFevereiro = 23000;
		int gastoMarco = 17000;
		int gastoTrimestre;
		int mediaMensal;
		
		gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;
		
		mediaMensal = gastoTrimestre / 3;
		
		System.out.println("O Gasto do Primeiro Trimestre é: " + "R$" + gastoTrimestre + "\n\nValor da Média Mensal: " + "R$" + mediaMensal);
		
	}

}
