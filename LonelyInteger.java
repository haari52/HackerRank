package practice;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LonelyInteger {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N%2 == 1){
			Set<Integer> set = new TreeSet<Integer>();
			for(int i=0;i<N;i++){
				int num = sc.nextInt();
				if(!set.add(num)){
					set.remove(num);
				}
			}
			for(Integer i : set){
				System.out.println(i);
			}
		}
	}

}
