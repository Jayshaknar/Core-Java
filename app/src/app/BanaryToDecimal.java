package app;

import java.util.Scanner;

public class BanaryToDecimal {

	public static void main(String[] args) {

		int decimal = 0, p = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int binary = sc.nextInt();

		while (binary != 0) {
			int temp = binary % 10;
			decimal =  (int) (decimal + temp * Math.pow(2, p));
			binary = binary / 10;
			p++;
		}
		System.out.println(decimal);

	}

}
