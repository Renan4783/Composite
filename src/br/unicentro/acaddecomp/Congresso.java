package br.unicentro.acaddecomp;

import java.util.List;

public class Congresso {
	
	private int participantes;
	private int assentos;
	
	public int totalParticipantes(List<Individuo> i, List<Instituicao> n){
		for (int j = 0; j < i.size(); j++) {
			participantes ++;
		}
		for (int j = 0; j < n.size(); j++) {
			participantes ++;
		}
		return participantes;
	}
	
	public int totalAssentos(List<Individuo> i, List<Instituicao> n){
		
		Composite ga;
		
		for (int j = 0; j < i.size(); j++) {
			ga = i.get(j);
			assentos = assentos + ga.getAssentos();
		}
		for (int j = 0; j < n.size(); j++) {
			ga = n.get(j);
			assentos = assentos + ga.getAssentos();
		}
		return assentos;
	}
}
