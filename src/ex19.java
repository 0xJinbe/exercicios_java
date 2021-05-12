import java.util.Locale;
import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
					
		for (int i=0; i<n; i++) {
			double val1 = sc.nextDouble();
			double val2 = sc.nextDouble();
			double val3 = sc.nextDouble();
			
			double media = (val1 * 2.0 + val2 * 3.0 + val3 * 5.0) / 10.0; // divide pelos pesos ponderados
			
			System.out.println("MEDIA PONDERADA: " + media);
		}
		
		
		
		sc.close();
	}
}
