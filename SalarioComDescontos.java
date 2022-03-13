package git;
import java.util.Scanner;
public class SalarioComDescontos {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Ganha por hora: R$ ");
			float ganhoHora = scan.nextFloat();
	
		System.out.println("Horas Trabalhadas: ");
			float horasTrab = scan.nextFloat();
		
			System.out.println("Dias trabalhados na semana: ");
				double diasSemana = scan.nextDouble();
		
				System.out.println("Semanas no mês: ");
					double semanasMes = scan.nextDouble();

					double salarioBruto = ((ganhoHora * horasTrab)* diasSemana) * semanasMes;

					double infoImpostoDeRenda = 0.11;
					double infoInss = 0.08;
					double infoSindicato = 0.05;
			
					double impostoDeRenda = 0.11 * salarioBruto;
					double inss = 0.08 * salarioBruto;
					double sindicato= 0.05 * salarioBruto;
					double totalDescontos = infoImpostoDeRenda + infoInss + infoSindicato;
					double salarioLiqdo = salarioBruto - (salarioBruto * totalDescontos);
					
						System.out.println("Seu Salario Bruto é: R$ " + salarioBruto);
						System.out.println("- IR (11%): R$ " + impostoDeRenda + "\n"
										+ "- INSS (8%): R$ " + inss + "\n"
										+ "- Sindicato ( 5%): R$ " + sindicato);
						System.out.println("Seu Salario Líquido é: R$ " + salarioLiqdo);
	}
}
