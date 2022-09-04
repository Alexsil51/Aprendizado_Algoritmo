package Exercircios1;

import java.util.ArrayList;

public class Operacoes extends Estado {

		public Operacoes(String estado, int pib) {
		super(estado, pib);
		
		}

		ArrayList<Estado> listaEstado = new ArrayList<>();

		public void inserePessoa(Object usuario) {
			listaEstado.add((Estado) usuario);
		}

		public String consultaPessoa() {
		    for (@SuppressWarnings("unused") Estado c: listaEstado) {
		        System.out.println(listaEstado.get(0));
		    }
		    return "oi";
		}}


