import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {


	public static void main(String[] args) {
		
		int numero = 0;
//		int i = 0;
		int resultado = 0;
		int opcao;

		Scanner numero1 = new Scanner(System.in);
		
		try {
			System.out.println("Qual tabuada voce deseja de 1 a 10 : ");
			numero = numero1.nextInt();
			System.out.println("Deseja imprimir se sim digite 1? ");
			opcao = numero1.nextInt();
			if (opcao == 1) {
				for (int i = 0; i <= 10; i++) {
					resultado = i * numero;
					 System.out.println("Tabuada " + opcao + " * " + i + " = " + resultado);
				} 
			}
		}catch (InputMismatchException e) {
			System.out.println("Nao e um numero");
		}		numero1.close();
	}

}
