import java.util.Scanner;

public class validacao {

	public static void main(String[] args) {
		
		int senha = 1234;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a senha");
		
		senha = entrada.nextInt();
		
		if (senha.equals(entrada)) {
			System.out.println("Acesso permitido");
		}else {
			System.out.println("Acesso Negado, senha incorreta");
		}
	}
}
