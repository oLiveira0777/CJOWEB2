package br.edu.ifspcjo.ads.web2.controleempregados.model;

public class EmpregadoHorista extends Empregado {

	private int horarioTrabalhado;
	private double valorHorario;
	
	public EmpregadoHorista(String nome, String cpf, int horarioTrabalhado ,double valorHorario) {
		super(nome, cpf);
		this.horarioTrabalhado = horarioTrabalhado;
		this.valorHorario = valorHorario;
	}

	public int getHorarioTrabalhado() {
		return horarioTrabalhado;
	}

	public void setHorarioTrabalhado(int horarioTrabalhado) {
		this.horarioTrabalhado = horarioTrabalhado;
	}

	public double getValorHorario() {
		return valorHorario;
	}

	public void setValorHorario(double valorHorario) {
		this.valorHorario = valorHorario;
	}

	@Override
	public String toString() {
		return "Empregado Horista [Horario Trabalhado:" + horarioTrabalhado + ", Valor Horario: R$" + valorHorario + ", Nome: "
				+ nome + ", CPF: " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return horarioTrabalhado * valorHorario;
	}

}
