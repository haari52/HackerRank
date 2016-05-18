package practice;

import java.util.Scanner;

public class FindDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0;i<T;i++){
			int N = sc.nextInt();
			int num = N;
			int count =0;
			while(num>0){
				int ld = num%10;
				if(ld !=0 && N%ld == 0 ){
					count++;
				}
				num = num/10;
			}
			System.out.println(count);
		}
	}

}
