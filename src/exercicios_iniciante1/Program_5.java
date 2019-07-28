package exercicios_iniciante1;

import java.util.Locale;
import java.util.Scanner;

public class Program_5 {

	public static void main(String[] args) {
		
		 Locale.setDefault(Locale.US);
		 Scanner sc = new Scanner (System.in);
		 
		 int code = sc.nextInt();
		 int n1 = sc.nextInt();
		 double value = sc.nextDouble();
		 int code2 = sc.nextInt();
		 int n2 = sc.nextInt();
		 double value2 = sc.nextDouble();
		 
		 double total = n1 * value + n2 * value2;
		 
		 System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		 
		 sc.close();
		 
	}

}
