package practice;

import java.util.Scanner;

public class AlternatingCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++){
			String input = sc.next();
			int count=0;
			for(int j=0;j<input.length()-1;j++){
				if(input.charAt(j) == input.charAt(j+1)){
					count++;
				}
			}
			System.out.println(count);
		}
	}



}
