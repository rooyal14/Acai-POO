import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Acai> listaDeAcais = new ArrayList<Acai>();
		listaDeAcais.add(new Acai("royal3", 15.90, 160,"leite","granola"));
		listaDeAcais.add(new Acai("assai2", 22.13, 250,"leitinho","grarola"));
		listaDeAcais.add(new Acai("assai3", 69.24, 300,"leitasso","granbola"));
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira 1 para cadastrar ou insira 2 para fazer "
				+ "pedido");
		int input = scanner.nextInt();
		scanner.nextLine();
		System.out.println(input);
		
		if (input == 1) {
			System.out.println("Bem vindo ao cadastramento");
			while (true) {
				System.out.println("Insira o nome do açaí para ser listado ao menu");
				String nome = scanner.nextLine();
				System.out.println("Insira o preço do açaí para ser listado ao menu");
				double preco = scanner.nextDouble();
				scanner.nextLine();
				System.out.println("Insira o tamanho em ml do açaí para ser listado ao menu");
				int tamanho = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Insira a quantidade de acompanhamentos do açaí "
						+ "para ser listado ao menu");
				int qtdAcomp = scanner.nextInt();
				scanner.nextLine();
				for (int i = 0; i < qtdAcomp; i++) {
					System.out.println("Insira o acompanhamento do açaí a ser "
							+ "listado ao menu");
					String acompanhamento = scanner.nextLine();
				}
			break;
			}
		} else if(input == 2) {
			System.out.println("Bem vindo ao atendimento");
			
		} else {
			System.out.println("DEU ruim");
		}
				
		scanner.close();
		
	}

}
