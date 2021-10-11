
public class Elecoes {

	public static void main(String[] args) {
		int anoNascimento = 2005;
		int ano = 2021;
		int idade;
		
		
		idade = ano - anoNascimento;
		
		if (idade >= 18) {
			System.out.println("Pode votar");
		}else {
			System.out.println("Nao pode votar");
		}
	}
}
