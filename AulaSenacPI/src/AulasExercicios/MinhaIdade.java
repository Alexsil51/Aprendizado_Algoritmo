package AulasExercicios;

import java.util.Scanner;

public class MinhaIdade {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite sua Idade: ");
		
		int idade = entrada.nextInt();
		
		System.out.println("Sua idade � " + idade + "anos");
	}

}
