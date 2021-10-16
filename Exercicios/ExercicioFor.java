import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//double media = 0.0;
		double totalSalario = 0.0;
		double maiorSalario = 0.0;
		double salario = 0.0;
		double filhos = 0;
		double menorSalario = 0;
		
		System.out.println("Digite a quantidade de pessoas pesquisadas: ");
		int pessoas = entrada.nextInt();
		
		for(int i = 1;i <= pessoas; i++  ) {
			
			System.out.printf("Informe o salario da pessoa %d : ", i);
			salario = entrada.nextDouble();
			System.out.printf("\nInforme o numero de filho da pessoa %d : ", i);
			filhos += entrada.nextDouble();
;			totalSalario += salario;
			
			if(salario <= 100) menorSalario ++;

			if(salario > maiorSalario || i == 1) maiorSalario = salario;
		}
		
		System.out.printf("Media do salario da populacao: %.2f \n", (totalSalario / pessoas));
		System.out.printf("Maior salario: %.2f \n", maiorSalario);
		System.out.printf("Media de filhos: %.2f \n", (filhos / pessoas));
		System.out.printf("porcentagem de pessoas com salario menor que 100,00: %.2f %% \n", menorSalario * 100 / pessoas );
		
		entrada.close();
	}

}
