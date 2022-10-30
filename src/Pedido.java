public class Pedido {
	String nome;
	String numeroDeTelefone;
	String cpf;
	String bairro;
	String rua;
	String numeroDaCasa;
	
	public Pedido(String nome, String numeroDeTelefone, String cpf) {
		this.nome = nome;
		this.numeroDeTelefone = numeroDeTelefone;
		this.cpf = cpf;
	}
	public void definirEndereço(String bairro, String rua, String numeroDaCasa) {
		this.bairro = bairro;
		this.rua = rua;
		this.numeroDaCasa = numeroDaCasa;
	}
	
}
