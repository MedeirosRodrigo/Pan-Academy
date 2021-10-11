import java.util.Scanner;

public class validacao {

	public static void main(String[] args) {



		Scanner in = new Scanner(System.in);
	
		System.out.println("Usuario: ");
		String login = in.nextLine();
		
		System.out.println("Senha: ");
		String senha = in.nextLine();
		
		if (login.equals("rodrigo") && senha.equals("1234")) {
			System.out.printf("Usuário %s logado com sucesso.", login);
		} else {
			System.out.println("Login ou senha inválidos!");
		}

	}
}
