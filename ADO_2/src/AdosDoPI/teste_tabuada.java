package AdosDoPI;

public class teste_tabuada {
	
	public static void main(String[] args) {
		
		int n = recebeInteiro();
		   for(int aux = 1;aux<=10;aux++)
		  {
		     System.out.println(n+" x "+aux+" = "+n*aux);
		  }
		  System.out.println("\nFim");
		}

		private int recebeInteiro()
		{
		   int n = 0;
		   Scanner in = new Scanner(System.in);
		   while(n<=0)
		   {
		      System.out.println("Digite um numero: ");
		      in.nextInt(n);
		      if(n<=0)
		     {
		        System.out.println("Numero invalido");
		     }
		   }
		   return n;
		}


