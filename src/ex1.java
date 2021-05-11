import java.util.Locale;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double r, area;

		r = sc.nextDouble();
		area = 3.14159 * (r * r);

		System.out.printf("AREA = %.4f%n", area);

		sc.close();
	}
}
