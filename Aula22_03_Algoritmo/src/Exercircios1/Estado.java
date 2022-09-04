package Exercircios1;


public class Estado {

	

		String estado;
		int pib;
		

	
	public Estado(String estado, int pib) {
	    this.estado = estado;
		this.pib = pib;
	    	   
	}

	public String getNome() {
	    return estado;
	}

	public void setNome(String nome) {
	    this.estado = nome;
	}

	public String getEndereco(int pib) {
	    return null;
	}

	public void setEndereco(int pib) {
	    this.pib = pib;
	}

	

	@Override
	public String toString() {
	    return "Estado=" + estado + ", Pib=" + pib;
	}}

