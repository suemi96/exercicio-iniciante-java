package exercicios_iniciante1;

import java.util.Locale;
import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor:");
		double A = sc.nextDouble();
		System.out.println("Digite o segundo valor:");
		double B = sc.nextDouble();
		System.out.println("Digite o terceiro valor:");
		double C = sc.nextDouble();

		double pi = 3.14159, triangulo = A * C / 2, circulo = pi * C * C, trapezio = (A + B) * C / 2, quadrado = B * B,
				retangulo = A * B;

		System.out.println("TRIANGULO = " + triangulo + "\n" + "CIRCULO = " + circulo + "\n" + "TRAPEZIO = " + trapezio
				+ "\n" + "QUADRADO = " + quadrado + "\n" + "RETANGULO = " + retangulo);

		sc.close();

	}

}
