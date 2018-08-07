package br.unicentro.acaddecomp;

public class Instituicao implements Composite{

	private int assentos;
	
	public Instituicao(int assentos){
		this.assentos = assentos;
	}
	
	@Override
	public int getAssentos() {
		return assentos;
	}

}
