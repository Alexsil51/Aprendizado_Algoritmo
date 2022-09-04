//import br.com.tico.app.Calculadora;
//import br.com.tico.app.calculo.CalculadoraImpl;
//import jdk.internal.org.jline.reader.impl.DefaultParser.Bracket;

module app.calculo {
	
	requires transitive app.logging;
	exports br.com.tico.app.calculo;
	
//	exports br.com.tico.app.calculo.interno
//	to app.financeiro;
	
	opens br.com.tico.app.calculo to app.logging, app.financeiro;
	
	requires app.api;
	provides br.com.tico.app.Calculadora
	with br.com.tico.app.calculo.CalculadoraImpl;
}