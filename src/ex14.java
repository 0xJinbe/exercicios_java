import java.util.Locale;
import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha = 0;
		
		while (senha != 2002) {
			senha = sc.nextInt();
			System.out.println("SENHA INVALIDA");
		}
		
		System.out.println("ACESSO PERMITIDO");
		
		sc.close();
	}
}
		