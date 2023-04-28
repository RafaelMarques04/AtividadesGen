package POO;

public class PessoaFisica extends Cliente {

	private String cpf;

	public PessoaFisica(String name, int idade, String endereco, String cpf) {
		super(name, idade, endereco, cpf, cpf);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void vizualizar() {
		System.out.println("Cliente{" + "name='" + getNome() + '\'' + ", idade=" + getIdade() + '\'' + ", endereco='"
				+ getEndereco() + '\'' + ", cpf= '" + cpf + '}');
	}

}