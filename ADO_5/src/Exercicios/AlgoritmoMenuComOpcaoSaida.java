package Exercicios;

import java.util.Scanner;

public class AlgoritmoMenuComOpcaoSaida {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		
		do  { 
			
			System.out.println("\nSEJA BEM VINDO AO ** JOGO VIRTUAL ** " + "\n\nEscolha Op��es Menu a Seguir: " + "\n1-INSTRU��ES JOGO" + "\n2-JOGAR" + "\n3-CR�DITOS" + "\n4-SAIR");
			numero = entrada.nextInt();
			
			
			switch (numero){

		     case 1:
		         System.out.println("\nINSTRU��ES" + "\n\nO JOGO VIRTUAL" + "\nO Manual de Instru��es � um g�nero textual do tipo injuntivo, que tem a fun��o de apresentar, ensinar a montar, operar, armazenar e conservar um equipamento.\r\n"
		         		+ "O Manual de Instru��es serve tamb�m para apresentar regras de jogos. Por se tratar de texto utilit�rio, a reda��o � econ�mica, com vocabul�rio simples.\r\n"
		         		+ "Os verbos s�o empregados no Infinitivo (Fazer...; Montar...; Conectar... etc.) ou no Imperativo (Fa�a...; Monte...; Conecte... etc.). As t�cnicas descritivas s�o utilizadas na reda��o dos manuais (cor, espessura, largura etc.).\r\n"
		         		+ "O Manual deve ter duas partes: 1) a apresenta��o/a descri��o do material; 2) o passo a passo para que, ao final das instru��es, o equipamento (ou o jogo) esteja pronto para ser usado e, al�m disso, o usu�rio saiba como manuse�-lo, limp�-lo, guard�-lo etc. Geralmente, os �passos� s�o numerados.");
		         break;
		     case 2:
		         System.out.println("\nJOGAR" + "\n *** PARABENS CAMPE�O ***");
		         break;
		     case 3:
		         System.out.println("\nCR�DITOS" + "\nNenhum pixel foi morto ou machucado durante a produ��o desse jogo.");
		         break;
		}	
		}
	
		
		while(numero != 4);
		System.out.println("AT� A PR�XIMA");
	}
}
