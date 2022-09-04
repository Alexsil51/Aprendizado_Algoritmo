package exercicios2;

import java.util.ArrayList;



public class ImprimirEstados {
	
	public static void main(String[] args) {
		
		
		
	     ArrayList<Dados> estados = new ArrayList<>();
	     
	  
	    
	    Dados estado1 = new Dados("São Paulo", 1349, 55);
	    estados.add(estado1);
	    
	    Dados estado2 = new Dados("Rio de Janeiro", 462, 18);
	    estados.add(estado2);
	    
	    Dados estado3 = new Dados("Minas Gerais", 386, 15);
	    estados.add(estado3);
	    
	    Dados estado4 = new Dados("Rio GRande do Sul", 263, 10);
	    estados.add(estado4);
	    
	    Dados estado5 = new Dados("Paraná", 239, 9);
	    estados.add(estado5);
	    
	    Dados estado6 = new Dados("Santa Catarina", 169, 6);
	    estados.add(estado6);
	    
	    Dados estado7 = new Dados("Distrito Federal", 164, 6);
	    estados.add(estado7);
	    
	    Dados estado8 = new Dados("Bahia", 159, 6);
	    estados.add(estado8);
	    
	    Dados estado9 = new Dados("Goias", 111, 4);
	    estados.add(estado9);
	    
	    Dados estado10 = new Dados("Pernambuco", 104, 4);
	    estados.add(estado10);
	    
	    Dados estado11 = new Dados("Espirito Santo", 97, 3);
	    estados.add(estado11);
	    
	    Dados estado12 = new Dados("Pará", 88, 3);
	    estados.add(estado12);
	    
	    Dados estado13 = new Dados("Ceará", 87, 3);
	    estados.add(estado13);
	    
	    Dados estado14 = new Dados("Mato Grosso", 71, 2);
	    estados.add(estado14);
	    
	    Dados estado15 = new Dados("Amazonas", 64, 2);
	    estados.add(estado15);
	    
	    Dados estado16 = new Dados("Maranhão", 52, 2);
	    estados.add(estado16);
	    
	    Dados estado17 = new Dados("Mato Grosso do Sul", 49, 2);
	    estados.add(estado17);
	    
	    Dados estado18 = new Dados("Rio Grande do Norte", 36, 1);
	    estados.add(estado18);
	    
	    Dados estado19 = new Dados("Paraiba", 35, 1);
	    estados.add(estado19);
	    
	    Dados estado20 = new Dados("Alagoas", 28, 1);
	    estados.add(estado20);
	    
	    Dados estado21 = new Dados("Rondonia", 27, 1);
	    estados.add(estado21);
	    
	    Dados estado22 = new Dados("Sergipe", 26, 1);
	    estados.add(estado22);
	    
	    Dados estado23 = new Dados("Piauí", 24, 0);
	    estados.add(estado23);
	    
	    Dados estado24 = new Dados("Tocantins", 18, 0);
	    estados.add(estado24);
	    
	    Dados estado25 = new Dados("Amapa", 8, 0);
	    estados.add(estado25);
	    
	    Dados estado26 = new Dados("Acre", 7, 00000);
	    estados.add(estado26);
	    
	    Dados estado27 = new Dados("Roraima", 6, 0);
	    estados.add(estado27);
	    
	    for(Dados d : estados) {
	         System.out.println("Pib Total Brasil R$ 4108" + "\n" + d.getEstado());
	    	 System.out.println("Pib R$ : " + d.getPib());
	    	 System.out.println("Percentual em relação ao Total: " + d.getPercentual()+ " %" + "\n");
//	    	 System.out.println(d.getPib() * 100 / d.getPercentual());
	    	
	    	
	     }
	   
      
	     
	}
		
	}
	


