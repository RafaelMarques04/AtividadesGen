package POO;

public class Cliente {

	private String nome;
	private int idade;
	private String cpf_cnpj;
	private String endereco;
	private String telefone;

	public Cliente(String nome, int idade, String cpf_cnpj, String endereco, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.cpf_cnpj = cpf_cnpj;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf_cnpj() {
		return cpf_cnpj;
	}

	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void visualizar() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF/CNPJ: " + cpf_cnpj);
		System.out.println("Endereço: " + endereco);
		System.out.println("Telefone: " + telefone);
	}
}