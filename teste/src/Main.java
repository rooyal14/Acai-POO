import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Acai[] lista = new Acai[999];
		lista[0] = new Acai("royal", 15.90, 700,"leite","granola");
		lista[1] = new Acai("homearanh", 15.90, 700,"leite","granola","leite2");
		lista[2] = new Acai("royal2", 15.90, 700,"leite","granola");
		lista[3] = new Acai("royal3", 15.90, 700,"leite","granola");
		
		
		
		
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

		System.out.println(lista[3].nome);
		
		
		scanner.close();
		
	}

}
