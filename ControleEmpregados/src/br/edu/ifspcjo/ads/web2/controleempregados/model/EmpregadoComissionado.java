package br.edu.ifspcjo.ads.web2.controleempregados.model;

public class EmpregadoComissionado extends Empregado {
	
	protected double vendas;
	protected double porcentagemComissao;
	
	public EmpregadoComissionado(String nome, String cpf, double vendas, double porcentagemComissao) {
		super(nome, cpf);
		this.vendas = vendas;
		this.porcentagemComissao = porcentagemComissao;
	}

	public double getVendas() {
		return vendas;
	}

	public void setVendas(double vendas) {
		this.vendas = vendas;
	}

	public double getPorcentagemComissao() {
		return porcentagemComissao;
	}

	public void setPorcentagemComissao(double porcentagemComissao) {
		this.porcentagemComissao = porcentagemComissao;
	}

	@Override
	public String toString() {
		return "Empregado Comissionado [Vendas: R$ + vendas + " + " Porcentagem Comissao: " + porcentagemComissao + ", Nome: "
				+ nome + ", CPF: " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return vendas * porcentagemComissao / 100;
	}
	
}
