package POO;

public class ClienteTeste {
	public ClienteTeste(String nome, String email, String telefone, String endereco) {
	}

	private void visualizar() {
	}

	public static void main(String[] args) {

		ClienteTeste cliente1 = new ClienteTeste("Patrick", "Patrickson011@gmail.com", "98217817",
				"Rua Augustinho Carrara da Cunha, 667");
		ClienteTeste cliente2 = new ClienteTeste("Carla", "Carlinha710@gmail.com", "98221036",
				"Rua Chitãozinho e Xororó de Castro Brothers, 496");

		PessoaJuridica pessoa1 = new PessoaJuridica("BIZORDEM RIBEIRINHOS", 5, "13.065.608/0011-82",
				"Rua Pablito Armandito Xande, 709", "(19) 98606-9681", "BIZORDEM RIBEIRINHOS LTDA");
		PessoaJuridica pessoa2 = new PessoaJuridica("EXBOM MOUSES", 3, "91.705.412/0111-09",
				"Rua Ultra Mega Power Blaster, 1", "(19) 98606-9681", "EXBOM MOUSES LTDA");

		System.out.println("--------------------------------------");
		cliente1.visualizar();
		cliente2.visualizar();
		System.out.println("--------------------------------------");
		pessoa1.visualizar();
		pessoa2.visualizar();
		System.out.println("--------------------------------------");
	}
}