package br.com.lmartins;

class Pessoa implements Comparable<Pessoa> {
    
	private String nome;
    private char gen;

    public Pessoa(String nome, char gen) {
        this.nome = nome;
        this.gen = gen;
}

	public String getNome() {
		return nome;
	}


	public char getGen() {
		return gen;
	}

	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return 0;
	}

    
}   
