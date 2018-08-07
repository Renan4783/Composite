package br.unicentro.acaddecomp;

import java.util.*;

public class Principal {
	public static void main(String args[]){
		List<Individuo> li = new ArrayList<Individuo>();
		List<Instituicao> ln = new ArrayList<Instituicao>();
		Congresso c = new Congresso();
		for (int i = 0; i<10; i++){
			Individuo in = new Individuo();
			li.add(in);
		}
		for (int i = 0; i<10; i++){
			int[] assentos = {3, 5, 10, 20, 4, 8, 12, 25, 30, 14}; 
			Instituicao it = new Instituicao(assentos[i]);
			ln.add(it);
		}
		System.out.println("Total de Participantes: " + c.totalParticipantes(li, ln));
		System.out.println("Total de Assentos: " +c.totalAssentos(li, ln));
	}
}
