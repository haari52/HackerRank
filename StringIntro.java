package practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class StringIntro {

	public static void main(String[] args){
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String A = sc.nextLine();
		String B = sc.nextLine();
		
		System.out.println(A.length()+B.length());
		if(A.compareTo(B)<=0){
			System.out.println("No");
		}
		else
			System.out.println("Yes");
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "
				+ B.substring(0,1).toUpperCase()+B.substring(1));
	}
}
