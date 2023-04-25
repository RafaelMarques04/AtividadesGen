package POO;

public class Exercício1 {
	private int codigoId;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;

	public Exercício1(int codigoId, String nome, String email, String telefone, String endereco) {
		this.codigoId = codigoId;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public int getId() {
		return codigoId;
	}

	public void setId(int codigoId) {
		this.codigoId = codigoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void imprimirInfo() {
		System.out.println("ID: " + codigoId);
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		System.out.println("Endereço: " + endereco);

	}
}