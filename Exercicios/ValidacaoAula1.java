import java.util.Scanner;

public class ValidacaoAula1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = in.nextInt();
		int senha1 = 1234;
		
		if (senha1 == senha) {
			System.out.printf("Acesso permitido");
		} else {
			System.out.println("Acesso negado!");
		}
	}
}
