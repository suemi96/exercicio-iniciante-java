package exercicios_iniciante1;

import java.util.Locale;
import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
				
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double value = sc.nextDouble();
		
		double salary = hours * value;
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$" + salary);
		
		sc.close();
		

	}

}
