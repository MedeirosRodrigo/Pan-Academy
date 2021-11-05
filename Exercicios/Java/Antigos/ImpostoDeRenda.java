
public class ImpostoDeRenda {
	
	public static void main(String[] args) {
		double salario = 3400.0;
		if (salario < 2500.0) {
			System.out.println("A sua aliquota e de 15%");
			System.out.println("Voce pode deduzir ate 350,00");
				} else if (salario >= 2500 && salario <= 3800) {
					System.out.println("A sua aliquota e 18%");
					System.out.println("voce pode deduzir 500,00");
				} else {
			System.out.println("Sua aliquota e de 28%");
			System.out.println("Voce pode deduzir ate 630,00");
		}	
	}
}