import java.util.Locale;
import java.util.Scanner;

public class DataNasc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		int anoNasc;
		int anoAtual;
		
		System.out.print("Digite o seu ano de nascimento: ");
		anoNasc = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		sc.close();
		
		int dataNasc = anoAtual - anoNasc;
		System.out.print("Sua idade é: " + dataNasc);
		

	}

}
