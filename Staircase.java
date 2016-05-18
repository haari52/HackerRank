package practice;

import java.util.Scanner;

public class Staircase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		for(int i=0;i<=height-1;i++){
			for(int j=i;j<height-1;j++){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("#");
			}
			System.out.println(" ");
		}

	}

}
