package br.edu.ifspcjo.ads.web2.controleempregados.model;

public abstract class Empregado {
	
	protected String nome;
	protected String cpf;
	
	
	public Empregado(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public abstract double calculateIncome();
}
