package Exercicios;


import java.util.Scanner;

public class Multipla_Escolha_Contador  {


public static void main(String[] args) {
		

	int contador = 0;
	String letra;
	
	
	

	
	
	Scanner entrada = new Scanner(System.in);
	
	
	 
	
		
		System.out.println("\n**Teste Seu Conhecimento Em Administração Cientifica** \n\nDentre as Teorias de Administração, aquela que tem, entre suas principais propostas, a conservação dos recursos naturais como "
				+ "\nfase preliminar da eficiência nacional, " 
				+ "a eficiência no trabalho através da racionalização e a especialização de tarefas, é a Escola?");
		
		System.out.println( "\n\na) Estruturalista." + "\n\nb) de Administração Científica." + "\n\nc) de Relações Humanas." + "\n\nd) Burocrática." + "\n\ne) Neoclássica.");
		
		
		
		
		
		
	
		do  { 			
			
	
			letra = entrada.nextLine();
			
			
			
		
		switch (letra){

	     case "a":
	         System.out.println("\nResposta Incorreta Tente Novamente");
	         
	         if (contador <= 3) {
	     		contador++;
	         }
	         
	         if (contador >= 3) {
	         System.out.println("\nAcabou Numero Tentativas" + "\nQuantidade Tentativas: " + contador);
	         }
	         
	         break;
	         
	        	
				 
				
	         
	       
	        	 
	        
	         
	         
	     case "b":
	         System.out.println("\nResposta Correta !!" + "\nQuantidade Tentativas: " + contador + 1);
	         
	           if  (letra == "b") {
	        	  
	        }
	           else 
	        	   
	           break;
	          
	           
	           
	         
	     case "c":
	         System.out.println("\nResposta Incorreta Tente Novamente");
	         
	         
	         if (contador <= 3) {
	     		contador++;
	         }
	         
	           if (contador >= 3) {
	         System.out.println("\nAcabou Numero Tentativas" + "\nQuantidade Tentativas: " + contador);
	         }
	          
	         break;
	       
	     case "d":
	         System.out.println("\nResposta Incorreta Tente Novamente");
	         
	         
	         if (contador <= 3) {
	     		contador++;
	         }
	         
	           if (contador >= 3) {
	         System.out.println("\nAcabou Numero Tentativas" + "\nQuantidade Tentativas: " + contador);
	         }
	          
	         break;
	         
	     case "e":
	         System.out.println("\nResposta Incorreta Tente Novamente");
	         
	         
	         if (contador <= 3) {
	     		contador++;
	         }
	         
	         if (contador >= 3) {
	         System.out.println("\nAcabou Numero Tentativas" + "\nQuantidade Tentativas: " + contador);
	         }
	          
	         break;
	         
	        
	         
	     default:
                System.out.println("Resposta Devem ser inseridas entre Alternativas A Até E");
                
                
		         if (contador <= 3) {
		     		contador++;
		         }
		         
		          if (contador >= 3) {
		         System.out.println("\nAcabou Numero Tentativas" + "\nQuantidade Tentativas: " + contador);
		         }
		          
                break;
                
		
                
}
	}
	
		
		while (contador <= 2);
		System.out.println("Obrigado !!");
	

}
}
