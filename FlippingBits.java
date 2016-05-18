package practice;

import java.util.Scanner;

public class FlippingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long maxInt = (long) (Math.pow(2, 32)-1);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			long num = sc.nextLong();
			System.out.println((maxInt^num));
		}
	}
}
