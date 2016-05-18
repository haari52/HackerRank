package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PanGram {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		
		Set<Character> letters = new HashSet<Character>();
		for(char ch = 'a';ch<='z';ch++){
			letters.add(ch);
		}
		s = s.toLowerCase();
		for(int i=0;i<s.length();i++){
			letters.remove(s.charAt(i));
		}
		
		if(letters.isEmpty()){
			System.out.println("pangram");
		}
		else{
			System.out.println("not pangram");
		}

	}

}
