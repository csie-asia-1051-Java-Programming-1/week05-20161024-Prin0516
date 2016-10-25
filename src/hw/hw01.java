package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入邊長");
		int n = scn.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
