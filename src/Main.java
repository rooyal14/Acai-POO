import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Hardcode teste
		ArrayList<Acai> listaDeAcais = new ArrayList<Acai>();
		ArrayList<String> array = new ArrayList<String>();
		array.add("granola");
		array.add("leite");
		listaDeAcais.add(new Acai("açaí do miranha",69.24,750,array));		
		
		
		Pedido pedidinho = new Pedido("Rodrigo", "6922241350", "123-123-123-12");
		pedidinho.definirEndereço("tranquedo", "tilapia", "6924");
		
		
		//Main menu
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Insira 1 para cadastrar");
			System.out.println("Insira 2 para fazer pedido");
			System.out.println("Insira 3 para sair");
			int input = scanner.nextInt();scanner.nextLine();
			System.out.println(input);
			
			if (input == 1) {
				//CADASTRA
				System.out.println("Bem vindo ao cadastramento");
				adicionar(listaDeAcais, scanner);
				
			} else if (input == 2) {
				//MOSTRA AÇAÍS
				System.out.println("Bem vindo ao atendimento");
				mostrar(listaDeAcais, scanner);
				
			} else if (input == 3) {
				System.out.println("Saindo...");
				break;
				
			}
		}		
		scanner.close();
		
	}
	
	static void mostrar(ArrayList<Acai> lista, Scanner scanner) {
		System.out.println("Lista das opções personalizadas:");
		for (int i = 0; i<lista.size(); i++) {
			System.out.println("Nome: "+lista.get(i).nome);
			System.out.println("Preço: R$"+lista.get(i).preco);
			System.out.println("Tamanho: "+lista.get(i).tamanho+"ml");
			System.out.println("Acompanhamento(s): "+lista.get(i).listaDeAcomps);
			System.out.println();
		}
	}
	
	static void adicionar(ArrayList<Acai> lista, Scanner scanner) {
		while (true) {
			System.out.println("Insira o nome do açaí para ser listado ao menu");
			String nome = scanner.nextLine();
			System.out.println("Insira o preço do açaí para ser listado ao menu");
			double preco = scanner.nextDouble();scanner.nextLine();
			System.out.println("Insira o tamanho em ml do açaí para ser listado ao menu");
			int tamanho = scanner.nextInt();scanner.nextLine();
			System.out.println("Insira a quantidade de acompanhamentos do açaí para ser listado ao menu");
			int qtdAcomp = scanner.nextInt();scanner.nextLine();
			ArrayList<String> arrayDeAcomp = new ArrayList<String>();
			for (int i = 0; i < qtdAcomp; i++) {
				System.out.println("Insira o acompanhamento do açaí a ser listado ao menu");
				String acompanhamento = scanner.nextLine();
				arrayDeAcomp.add(acompanhamento);
			}
			lista.add(new Acai(nome, preco, tamanho, arrayDeAcomp));
			
			System.out.println("Digite 1 se deseja adicionar mais um tipo de açaí ou 2 se deseja voltar para o menu principal: ");
			int continuar = scanner.nextInt();scanner.nextLine();
			if (continuar == 1) {
				continue;
			} else if (continuar == 2) {
				break;
			}
		}
	}
	
	

}
