package practice;

import java.util.Scanner;

public class EOF {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int index = 1;
		while(sc.hasNextLine()){
			System.out.println(index +" " +sc.nextLine());
			index++;
		}
	}

}
