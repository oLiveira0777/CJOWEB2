
public class produtos {
	private int id;
	private String nome;
	private double preco;
	
	public produtos() {
	    this.id = 0;
	    this.nome = null;
	    this.preco = 0;
	}
	
	public produtos (int id, String nome, double preco) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Dados do produto [Código: ]" + id + "- Nome: "+ nome + "- Preço: R$"+ preco + "]"; 
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
