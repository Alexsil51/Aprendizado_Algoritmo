package Aula_04_Qui;

import java.util.Scanner;

public class MaiorDeTres {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Digite i valor de A: ");
		a = entrada.nextInt();
		
		System.out.print("Digite i valor de B: ");
		b = entrada.nextInt();
		
		System.out.print("Digite i valor de C: ");
		c = entrada.nextInt();
		
		if((a > b ) && (a > c)) {
			System.out.println("A é o maior dos três:" +a);
			
		} else if ((b > a) && (b > c)) {
			System.out.println("B é o maior dos três:" +b);
			
		}else {
			System.out.println("C é o maior dos três:" +c);
		}
	}

}
