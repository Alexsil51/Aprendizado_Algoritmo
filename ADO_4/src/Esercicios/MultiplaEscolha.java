package Esercicios;

import java.util.Scanner;

public class MultiplaEscolha {

	
	public static void main(String[] args) {
		
		
        Scanner entrada = new Scanner(System.in);
		
		char vogal;
		
		
		System.out.println("O que � o Acordo de Paris?: " + "\na) Acordo internacional que trata da restri��o de imigrantes em Paris" + 
		"\n\nb) Acordo internacional que trata da prote��o da Fran�a dos atentados terroristas" + "\n\nc) Acordo internacional que trata do Desenvolvimento Sustent�vel" +
				"\n\nd) Acordo internacional que trata da polui��o radioativa" + "\n\ne) Acordo internacional que trata do aquecimento global");
		vogal = entrada.nextLine().charAt(0);
		
		 switch (vogal){

	     case 'a':
	         System.out.println("Alternativa Errada, Tente Novamente");
	         break;
	     case 'b':
	         System.out.println("Alternativa Errada, Tente Novamente");
	         break;
	     case 'c':
	         System.out.println("Alternativa Errada, Tente Novamente");
	         break;
	     case 'd':
	         System.out.println("Alternativa Errada, Tente Novamente");
	         break;
	     case 'e':
	         System.out.println("Alternativa Correta, Parabens.");
	         break;
	    

	     default:
	         System.out.println("N�o Existe esta op��o");
		  }
		}
	}


	

