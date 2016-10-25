package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n = scn.nextInt();
		int i = 1;
		while (n > 0) {
			if ((int) Math.pow(n, i) > 10000) {
				System.out.println(i);
				break;
			}
			i++;
		}

	}

}
