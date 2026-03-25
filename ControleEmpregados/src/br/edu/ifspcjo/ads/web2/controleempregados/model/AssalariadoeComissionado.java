package br.edu.ifspcjo.ads.web2.controleempregados.model;

public class AssalariadoeComissionado extends EmpregadoComissionado {
	
	private double salario;

	public AssalariadoeComissionado(String nome, String cpf, double vendas, double porcentagemComissao, double salario) {
		super(nome, cpf, vendas, porcentagemComissao);
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
		return "Assalariado e Comissionado [salario: R$" + salario + ", vendas:" + vendas + ", porcentagem da Comissao:"
				+ porcentagemComissao + ", nome: " + nome + ", cpf: " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salario + vendas * porcentagemComissao / 100;
	}
	
}
