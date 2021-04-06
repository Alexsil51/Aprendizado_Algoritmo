package Esercicios;

import java.util.Scanner;

public class MultiplaEscolha {

	
	public static void main(String[] args) {
		
		
        Scanner entrada = new Scanner(System.in);
		
		char vogal;
		
		
		System.out.println("O que é o Acordo de Paris?: " + "\na) Acordo internacional que trata da restrição de imigrantes em Paris" + 
		"\n\nb) Acordo internacional que trata da proteção da França dos atentados terroristas" + "\n\nc) Acordo internacional que trata do Desenvolvimento Sustentável" +
				"\n\nd) Acordo internacional que trata da poluição radioativa" + "\n\ne) Acordo internacional que trata do aquecimento global");
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
	         System.out.println("Não Existe esta opção");
		  }
		}
	}


	

