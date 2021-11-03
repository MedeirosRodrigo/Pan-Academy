import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {


	public static void main(String[] args) {
		
		int numero = 0;
		int i = 0;
		int resultado = 0;
		int opcao;

		Scanner numero1 = new Scanner(System.in);
		
		try {
			System.out.println("Qual tabuada voce deseja de 1 a 10 : ");
			numero = numero1.nextInt();
		}catch (InputMismatchException e) {
			System.out.println("Nao e um numero");
		}
		
		try {
			System.out.println("Deseja imprimir? 1 ");
			opcao = numero1.nextInt();
			if (opcao == 1) {
				do {  
					resultado = i * numero;
					 System.out.println("Tabuada " + opcao + " * " + i + " = " + resultado);
					 i++;
					} while(i<=10); 
			}
		}catch (InputMismatchException e) {
			System.out.println("Nao e um numero");
		}
		
		
	}

}
