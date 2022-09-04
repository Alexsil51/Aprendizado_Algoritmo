package br.com.tico.app.calculo;

import br.com.tico.app.Calculadora;
import br.com.tico.app.calculo.interno.OperacoesAritmeticas;
import br.com.tico.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

	private String id = "abc";
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
	
	
	//public Class<Logger> getLoggerClass(){
	//	return Logger.class;
	//}
}
