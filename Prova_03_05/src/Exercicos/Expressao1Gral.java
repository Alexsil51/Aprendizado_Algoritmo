package Exercicos;

public class Expressao1Gral {
	
	public static void main(String[] args) {
		
		int x=28, y=17, aux;
		if(x%y==0) {
			x++;
			if((x%2 !=0) || (y<x)) {
				y = x*y;
			}
		}else {
			aux = x;
			x = y;
			y = aux;
		}
		System.out.printf("x=%d y=%d \n", x, y);
	}

}
