package Exercicos;

public class VariavelPossuiraOValor {
	
	public static void main(String[] args) {
		
		
		int n =5, a =0, b = 1, c = b;
		for(b=1; b<=n; b++) {
			for(c = b; c<=n; c++) {
				a = a +1;
			}
		}
		System.out.printf("%d \n", a);
	}

}
