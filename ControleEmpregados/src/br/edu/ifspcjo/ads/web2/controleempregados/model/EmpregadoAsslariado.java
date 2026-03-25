package br.edu.ifspcjo.ads.web2.controleempregados.model;

public class EmpregadoAsslariado extends Empregado {
	
	private double salario;

	public EmpregadoAsslariado(String nome, String cpf, double salario) {
		super(nome, cpf);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado Asslariado [Salário: R$" + salario + ", Nome: " + nome + ", CPF: " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salario;
	}
}
