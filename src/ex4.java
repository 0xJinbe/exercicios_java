import java.util.Locale;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qnt1, qnt2;
		double preco1, preco2, total;
		
		cod1 = sc.nextInt();
		qnt1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qnt2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1 * qnt1 + preco2 * qnt2;
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", total);
		
		
		
	}
}