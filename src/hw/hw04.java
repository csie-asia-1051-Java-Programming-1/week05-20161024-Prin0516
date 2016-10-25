package hw;

import java.util.Scanner;

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤J");
		int n = scn.nextInt();
		float sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (float)1 / ((2 * i - 1) * (2 * i));

		}
		System.out.println(sum);

	}

}
