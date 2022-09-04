package Exercircios1;

import java.util.Scanner;

public class ImprimirPibPorcentagem {
	
	public static void main(String[] args) {
		
		

		 Scanner input = new Scanner(System.in);
		    Estado usuario = new Estado(null, 0);
		    Operacoes acao = new Operacoes(null, 0);

		    int op;

		    do {
		        System.out.println("[1] Inserir");
		        System.out.println("[2] Consultar");
		        System.out.println("[3] Remover");
		        System.out.println("[4] Sair");
		        System.out.print("Opção desejada: ");
		        op = input.nextInt();
		        switch (op) {
		            case 1:
		                input.nextLine();
		                System.out.print("Estado: ");
		                usuario.setNome(input.nextLine());
		                System.out.print("Pib: ");
		               
		                acao.inserePessoa(usuario);
		                System.out.println(usuario);
		                break;
		            case 2:
		                acao.consultaPessoa();
		                break;
		            case 3:
		                break;
		        }
		    } while (op != 4);
		
		
		
		
		
//		List<ImprimirPibPorcentagem > lista=new ArrayList<ImprimirPibPorcentagem >();
//		
//		
//		       percentage = (score * 100/ total);
//		       
//		       System.out.println("A porcentagem é = " + percentage + " %");
//		       
//		  
	}
		}
	


