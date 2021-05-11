import java.util.Locale;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double item, qnt, total;
		
		item = sc.nextDouble();
		qnt = sc.nextDouble();
		
		if (item == 1) {
			total = qnt * 4;
		} else if (item ==2) {
			total = qnt * 4.50;
		} else if (item == 3) {
			total = qnt * 5;
		} else if (item == 4) {
			total = qnt * 2;
		} else {
			total = qnt * 1.50;
		}
			
		System.out.println("Total: R$ " + total);
		
		sc.close();
		
		
	}
}