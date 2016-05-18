package practice;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		String str = sc.nextLine();
		int len = Integer.parseInt(sc.nextLine());
		Set<String> set = new TreeSet<String>();
		int index = 0;		 
		while(index <=str.length()-len ){
			set.add(str.substring(index,len+index));
			index ++;
		}
		System.out.println(((TreeSet<String>) set).first());
		System.out.println(((TreeSet<String>) set).last()); 
	}

}
