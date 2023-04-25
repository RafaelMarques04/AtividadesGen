package POO;

public class Exercício1_1 {
	public static void main(String[] args) {

		Exercício1 cliente1 = new Exercício1(1, "Patrick", "Patrickson011@gmail.com", "98217817",
				"Rua Augustinho Carrara da Cunha, 667");
		Exercício1 cliente2 = new Exercício1(2, "Carla", "Carlinha710@gmail.com", "98221036",
				"Rua Chitãozinho e Xororó de Castro Brothers, 496");

		cliente1.imprimirInfo();
		System.out.println("--------------------------------------");
		cliente2.imprimirInfo();
	}
}