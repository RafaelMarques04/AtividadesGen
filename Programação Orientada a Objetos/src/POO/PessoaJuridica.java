package POO;

public class PessoaJuridica extends Cliente {
	private String razaoSocial;

	public PessoaJuridica(String nome, int idade, String cnpj, String endereco, String telefone, String razaoSocial) {
		super(nome, idade, cnpj, endereco, telefone);
		this.razaoSocial = razaoSocial;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Razão Social: " + razaoSocial);
	}
}