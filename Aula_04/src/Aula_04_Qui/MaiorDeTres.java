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
			System.out.println("A � o maior dos tr�s:" +a);
			
		} else if ((b > a) && (b > c)) {
			System.out.println("B � o maior dos tr�s:" +b);
			
		}else {
			System.out.println("C � o maior dos tr�s:" +c);
		}
	}

}
