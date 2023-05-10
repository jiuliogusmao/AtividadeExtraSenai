import java.util.Locale;
import java.util.Scanner;

public class CalculoSalarioLiquido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		double salarioBruto;
		double inss = 0.05;
		double IR = 0.11;
		
		System.out.println("Digite seu salário base: ");
		salarioBruto = sc.nextDouble();
		
		sc.close();
		
		double descontoInss = salarioBruto * inss;
		double descontoIr = salarioBruto * IR;
		double salarioLiquido = salarioBruto - (descontoInss + descontoIr);
		
		System.out.println("Desconto INSS: " + descontoInss);
		System.out.println("Desconto IR: " + descontoIr);
		
		System.out.println("Salário Líquido: " + salarioLiquido);
	}

}
