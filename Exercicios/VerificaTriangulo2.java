import java.util.Scanner;

public class VerificaTriangulo2 {

	public static void main(String[] args) {
		
			Scanner tri = new Scanner(System.in);
			
			System.out.println("Digite angulo 1 do triangulo: ");
			int angulo1 = tri.nextInt();
			
			System.out.println("Digite angulo 2 do triangulo: ");
			int angulo2 = tri.nextInt();

			System.out.println("Digite angulo 3 do triangulo: ");
			int angulo3 = tri.nextInt();

			if (angulo1 ==  angulo2 && angulo1 == angulo3) {
				System.out.println("Triângulo Equilatero");
			} else if (angulo1 != angulo2 && angulo1 != angulo3) {
				System.out.println("Triângulo Escaleno");
			} else if (angulo1 == angulo2 || angulo1 == angulo3 || angulo2 == angulo3 ) {
				System.out.println("Triângulo Isosceles");
			} else {
				System.out.println("nao e um triangulo");
			}
			tri.close();
	}

}
