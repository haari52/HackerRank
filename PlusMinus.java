package practice;

import java.util.Scanner;

public class PlusMinus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		int positiveNum = 0;
		int zeroes = 0;
		int negativeNum = 0;
		
		for(int i=0;i<nums;i++){
			int num = sc.nextInt();
			if(num >0)
				positiveNum++;
			else if(num <0)
				negativeNum++;
			else
				zeroes++;
		}
		float posNum = (float) positiveNum/nums;
		float negNum = (float) negativeNum/nums;
		float zero = (float) zeroes/nums;
		 
		System.out.printf("%.6f",posNum);
		System.out.println();
		System.out.printf("%.6f",negNum);
		System.out.println();
		System.out.printf("%.6f",zero);
	}
}
