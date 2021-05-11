import java.util.Locale;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num, horas;
		double valor, sal;
		num = sc.nextInt();
		horas = sc.nextInt();
		valor = sc.nextDouble();

		sal = horas * valor;
		System.out.println("NUMER = " + num);
		System.out.printf("SALARY = %.2f%n", sal);
		
		sc.close();

	}
}