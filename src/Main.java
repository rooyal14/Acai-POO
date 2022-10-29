import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Acai> listaDeAcais = new ArrayList<Acai>();
		
		//listaDeAcais.add(new Acai("assai", 69.24, 300, array));
		//listaDeAcais.add(new Acai("assai3", 69.24, 300, array));
		
		//System.out.println(listaDeAcais.get(1).listaDeAcomps.get(0));
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira 1 para cadastrar ou insira 2 para fazer pedido");
		int input = scanner.nextInt();
		scanner.nextLine();
		System.out.println(input);
		
		if (input == 1) {
			System.out.println("Bem vindo ao cadastramento");
			boolean x = true;
			while (x) {
				x = adicionar(listaDeAcais, scanner);
			}
		} else if(input == 2) {
			System.out.println("Bem vindo ao atendimento");
			
		} else {
			System.out.println("DEU ruim");
		}
				
		scanner.close();
		
	}
	
	
	static boolean adicionar(ArrayList<Acai> lista, Scanner scanner) {
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
			return true;
		} else if (continuar == 2) {
			System.out.println("Voltando para o menu principal");
			return false;
		}
		return true;
	}

}
