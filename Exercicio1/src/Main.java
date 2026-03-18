import java.util.Scanner;

public class Main {
	private static Scanner teclado = new Scanner(System.in);
	
	private static produtos gerente = new produtos();
	
	public static int menu() {
        System.out.println("----------------------------------");
        System.out.println("--Sistema de Controle de Pessoas--");
        System.out.println("----------------------------------");
        System.out.println("----------MENU DE OPÇÕES----------");
        System.out.println("----------------------------------");
        System.out.println("1 - Alterar nome");
        System.out.println("2 - Alterar preço");
        System.out.println("3 - Mostrar produtos");
        System.out.println("4 - Sair");
        System.out.println("----------------------------------");
        System.out.println("Escolha uma opção: ");
        return teclado.nextInt();
    }
	
	public static void alteNome() {
		System.out.println("Digite o nome: ");
		teclado.nextLine();
		String nome = teclado.nextLine();
		gerente.setNome(nome);
	}
	
	private static void altePreco() {
		System.out.println("Digite o preço: ");
		teclado.nextLine();
		double preco = Double.parseDouble(teclado.nextLine());
		gerente.setPreco(preco);
	}	
	
	private static void mostra() {
		System.out.println(gerente.toString());
	}

	
	public static void main(String[] args) {
		 int opcao;
	        do {
	            opcao = menu();
	            switch (opcao) {
	                case 1: {
	                    alteNome();
	                    break;
	                }
	                case 2:{
	                	altePreco();
	                	break;
	                }
	                case 3:{
	                	mostra();
	                	break;
	                }
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	            System.out.println("Pressione ENTER para continuar...");
	            teclado.nextLine();
	        } while (opcao != 4); 
	        
	}
	
}

	       
	
	