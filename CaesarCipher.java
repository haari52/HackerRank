package practice;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String input = sc.nextLine();
		int K = sc.nextInt();
		String cipherText = "";
		for(int i=0;i<N;i++){
			int c = input.charAt(i);
			
			if(Character.isUpperCase(c)){
				c = c + (K%26);
				
				if(c>'Z'){
					c = c-26;
				}
			}
			
			else if(Character.isLowerCase(c)){
				c = c+(K%26);
				if(c>'z'){
					c =c - 26;
				}
			}
			
			cipherText += (char)c;
		}
				
System.out.println(cipherText);
	}

 
}
