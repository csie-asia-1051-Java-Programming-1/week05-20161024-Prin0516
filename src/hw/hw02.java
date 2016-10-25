package hw;

import java.util.Scanner;

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("½Ð¿é¤Jn");
		int n = scn.nextInt();
		int sum = 0;
		int i = 1;
		while (sum < n) {
			sum = sum + i;
			i++;
		}
		System.out.println(i - 2);
	}

}
