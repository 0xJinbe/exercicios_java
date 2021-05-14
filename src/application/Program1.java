package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rectangle rect = new Rectangle();

		System.out.println("Entre com altura e largura do triangulo: ");
		rect.altura = sc.nextDouble();
		rect.largura = sc.nextDouble();

		System.out.printf("Area =  %.2f%n", rect.area());
		System.out.printf("Perimetro =  %.2f%n", rect.perimetro());
		System.out.printf("Diagonal = %.2f%n", rect.diagonal());

		sc.close();
	}

}
