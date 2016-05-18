package practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(solveMeFirst(a,b));
	}

	private static int solveMeFirst(int a, int b) {
		return a+b;
	}

}
