package Exercicios;

import java.util.Scanner;

public class AlgoritmoMenuComOpcaoSaida {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		
		
		do  { 
			
			System.out.println("\nSEJA BEM VINDO AO ** JOGO VIRTUAL ** " + "\n\nEscolha Opções Menu a Seguir: " + "\n1-INSTRUÇÕES JOGO" + "\n2-JOGAR" + "\n3-CRÉDITOS" + "\n4-SAIR");
			numero = entrada.nextInt();
			
			
			switch (numero){

		     case 1:
		         System.out.println("\nINSTRUÇÕES" + "\n\nO JOGO VIRTUAL" + "\nO Manual de Instruções é um gênero textual do tipo injuntivo, que tem a função de apresentar, ensinar a montar, operar, armazenar e conservar um equipamento.\r\n"
		         		+ "O Manual de Instruções serve também para apresentar regras de jogos. Por se tratar de texto utilitário, a redação é econômica, com vocabulário simples.\r\n"
		         		+ "Os verbos são empregados no Infinitivo (Fazer...; Montar...; Conectar... etc.) ou no Imperativo (Faça...; Monte...; Conecte... etc.). As técnicas descritivas são utilizadas na redação dos manuais (cor, espessura, largura etc.).\r\n"
		         		+ "O Manual deve ter duas partes: 1) a apresentação/a descrição do material; 2) o passo a passo para que, ao final das instruções, o equipamento (ou o jogo) esteja pronto para ser usado e, além disso, o usuário saiba como manuseá-lo, limpá-lo, guardá-lo etc. Geralmente, os “passos” são numerados.");
		         break;
		     case 2:
		         System.out.println("\nJOGAR" + "\n *** PARABENS CAMPEÃO ***");
		         break;
		     case 3:
		         System.out.println("\nCRÉDITOS" + "\nNenhum pixel foi morto ou machucado durante a produção desse jogo.");
		         break;
		}	
		}
	
		
		while(numero != 4);
		System.out.println("ATÉ A PRÓXIMA");
	}
}
