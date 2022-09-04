package Exercicos;

import java.util.Scanner;

public class FuncaoPrintf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int a =0, b = 0, n = 0;
		
		System.out.println("Numero de N: ");
		n = entrada.nextInt();
		
		
		while(n > 0)
		{
			if((n % 2) == 0)
				a = a + 1;
			else 
				b = b + 1;
					n = n / 2;
		}
		System.out.printf("%d %d \n", a, b);
	}

}
