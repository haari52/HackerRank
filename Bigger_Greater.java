package practice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bigger_Greater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		assert tc>=1 && tc <= 100000:"Not valid";
		for(int k=0;k<tc;k++){
			String input = sc.next();
			assert input.length() <=100 :"Not Valid";
			Pattern p = Pattern.compile("[a-z]");
			Matcher m = p.matcher(input);
			assert m.find();
			int start = -1;
			for(int i=0;i<input.length()-1;i++){
				if(input.charAt(i) < input.charAt(i+1)){
					start = i;
				}
			}
			if(start == -1){
				System.out.println("no answer");
				continue;
				
			}
			int end = -1;
			for(int j = start+1;j<input.length();j++){
				if(input.charAt(start) < input.charAt(j)){
					end = j;
				}
			}
			char[] carr = input.toCharArray();
			char temp = carr[start];
			carr[start] = carr[end];
			carr[end] = temp;
			
			input = new String(carr);
			String a = input.substring(start+1);
			carr = a.toCharArray();
			Arrays.sort(carr);
			a = new String(carr);
			
			char[] ip = input.toCharArray();
			for(int j = start+1;j<input.length();j++){
				ip[j] = carr[j-start-1];
			}
			System.out.println(ip);
			 
		}
}
}
