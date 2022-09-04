package exercicios2;

public class Dados {
	
	private String estado;
	private float pib;
	private float percentual;
	
	public Dados() {
      
	}

	public Dados(String estado, float pib, float percentual) {
//		super();
		this.estado = estado;
		this.pib = pib;
		this.percentual = percentual;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public float getPib() {
		return pib;
	}

	public void setPib(float pib) {
		this.pib = pib;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual) {
		this.percentual = percentual;
	}
	


}
	

