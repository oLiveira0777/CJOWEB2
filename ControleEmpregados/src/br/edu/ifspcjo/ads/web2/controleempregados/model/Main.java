package br.edu.ifspcjo.ads.web2.controleempregados.model;

public class Main {

	public static void main(String[] args) {
		
		Empregado empregado1 = new EmpregadoAsslariado("Ana", "l234", 3000);
		System.out.println(empregado1);
		System.out.println("Rendimentos = R$ " + empregado1.calculateIncome());
		
		Empregado empregado2 = new EmpregadoHorista("Adriana", "5678", 40, 30);
		System.out.println(empregado2);
		System.out.println("Rendimentos = R$ " + empregado2.calculateIncome());
		
		
		Empregado empregado3 = new EmpregadoComissionado("Juliana", "48390", 50000, 5);
		System.out.println(empregado3);
		System.out.println("Rendimentos = R$ " + empregado3.calculateIncome());
		
		Empregado empregado4 = new AssalariadoeComissionado("felipe", "4324", 50000, 5, 2000);
		System.out.println(empregado4);
		System.out.println("Rendimentos = R$ " + empregado4.calculateIncome());
		
	}
}