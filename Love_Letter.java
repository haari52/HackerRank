package practice;

import java.util.Scanner;

public class Love_Letter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int t=0;t<tc;t++){
			String input = sc.next();
			int size = input.length();
		    int count = 0;
		    for(int i = 0, j = size-1; i < j; ++i, --j) {
		        if(input.charAt(i) != input.charAt(j) ){
		            count += Math.abs(input.charAt(i) - input.charAt(j));
		        }
		    }
		     System.out.println(count);
		}
	}
}
