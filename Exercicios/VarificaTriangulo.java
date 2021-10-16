import java.util.Scanner;

public class VarificaTriangulo {

	public static void main(String[] args) {
		Scanner tri = new Scanner(System.in);
		
		System.out.println("Digite angulo 1 do triangulo: ");
		int angulo1 = tri.nextInt();
		
		System.out.println("Digite angulo 2 do triangulo: ");
		int angulo2 = tri.nextInt();

		System.out.println("Digite angulo 3 do triangulo: ");
		int angulo3 = tri.nextInt();
		
		
		if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
			System.out.println("Triângulo Retângulo");
		} else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
			System.out.println("Triângulo Obtusângulo");
		} else if (angulo1 < 90 && angulo2 < 90 && angulo3 < 90) {
			System.out.println("Triângulo Acutângulo");
		} else {
			System.out.println("Nao correponde a um tringulo");
		}
		tri.close();
	}
}
