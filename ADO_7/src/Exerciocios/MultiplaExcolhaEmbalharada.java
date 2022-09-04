package Exerciocios;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class MultiplaExcolhaEmbalharada {
	
		
		public static void main(String[] args) {
		
			

			int contador = 0;
			String letra;
			String a = "\n a) Estruturalista.";
			String b = " b) de Administração Científica.";
			String c = " c) de Relações Humanas.";
			String d = " d) Burocrática.";
			String e = " e) Neoclássica.";
			
			
			Random aleatorio = new Random();
			
			
			Scanner entrada = new Scanner(System.in);
			
			
			 
			
				
				System.out.println("\n**Teste Seu Conhecimento Em Administração Cientifica** \n\nDentre as Teorias de Administração, aquela que tem, entre suas principais propostas, a conservação dos recursos naturais como "
						+ "\nfase preliminar da eficiência nacional, " 
						+ "a eficiência no trabalho através da racionalização e a especialização de tarefas, é a Escola?");
				
						//+ "\n\na) Estruturalista." 
			//	+ "\n\nb) de Administração Científica." + "\n\nc) de Relações Humanas." + "\n\nd) Burocrática." + "\n\ne) Neoclássica.");
				
				
				
				
				System.out.println(a+b+c+d+e);
				//System.out.println("\na) Estruturalista.");
				//System.out.println("b) de Administração Científica.");
				//System.out.println("c) de Relações Humanas.");
				//System.out.println("d) Burocrática.");
				//System.out.println("e) Neoclássica.");
				
				
			
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
			        
			         else { 
			        	 System.out.println(a+b+c+d+e);
			         
			         }
			         
			         
			         break;
			         
			        	// a = aleatorio. toString()+a+b+c+d+e;
			       
					//	b = aleatorio. toString();
						
						//c = aleatorio. toString();
						
						//d = aleatorio. toString();
						 
						//e = aleatorio. toString();
						 
						
			         
			       
			        	 
			        
			         
			         
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

	


