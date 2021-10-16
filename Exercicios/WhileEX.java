import java.util.Scanner;

public class WhileEX {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeNotas = 0;
		double nota = 0.0;
		double total = 0.0;
		
		while (nota != -1) {

			System.out.println("Digite sua nota: ( ou digitar -1 para finalizar)");
			nota = entrada.nextDouble();

			if (nota >= 0 && nota <= 10) {
				quantidadeNotas++;
				total += nota;
			} else if (nota == -1) {

			} else {
				System.out.println("Digite um valor valido");
			}
		}
		double media = (total / quantidadeNotas);
		System.out.println("Quantidades de notas digitadas " + quantidadeNotas);
		System.out.printf("Sua media %.2f ", media );
		
		entrada.close();
		
		//for
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
		
		//for com string
		
		String [] cidades = {"Diadema", "SBC", "SCS","Osasco"};
		
		for( String j : cidades) {
			System.out.println(j);
		}
		
		int x = 0;
		for(;x <= 10;) {
			System.out.println("Sim");
			x++;
		}
		
	}

}
