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
			String b = " b) de Administra��o Cient�fica.";
			String c = " c) de Rela��es Humanas.";
			String d = " d) Burocr�tica.";
			String e = " e) Neocl�ssica.";
			
			
			Random aleatorio = new Random();
			
			
			Scanner entrada = new Scanner(System.in);
			
			
			 
			
				
				System.out.println("\n**Teste Seu Conhecimento Em Administra��o Cientifica** \n\nDentre as Teorias de Administra��o, aquela que tem, entre suas principais propostas, a conserva��o dos recursos naturais como "
						+ "\nfase preliminar da efici�ncia nacional, " 
						+ "a efici�ncia no trabalho atrav�s da racionaliza��o e a especializa��o de tarefas, � a Escola?");
				
						//+ "\n\na) Estruturalista." 
			//	+ "\n\nb) de Administra��o Cient�fica." + "\n\nc) de Rela��es Humanas." + "\n\nd) Burocr�tica." + "\n\ne) Neocl�ssica.");
				
				
				
				
				System.out.println(a+b+c+d+e);
				//System.out.println("\na) Estruturalista.");
				//System.out.println("b) de Administra��o Cient�fica.");
				//System.out.println("c) de Rela��es Humanas.");
				//System.out.println("d) Burocr�tica.");
				//System.out.println("e) Neocl�ssica.");
				
				
			
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
		                System.out.println("Resposta Devem ser inseridas entre Alternativas A At� E");
		                
		                
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

	


