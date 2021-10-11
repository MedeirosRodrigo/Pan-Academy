
public class Condicionais {

	public static void main(String[] args) {
		int idade = 3;
		int pessoas = 4;

		if (idade >= 18) {
			System.out.println("Voce e maior de idade");
		} else {
			if (pessoas >= 3) {
				System.out.println("Voce pode entrar(esta acompanhado)");
			} else {
				System.out.println("Voce e menor de idade");
			}
		}
	}
}
