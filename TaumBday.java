package practice;

import java.util.Scanner;

public class TaumBday {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- >0){
			long B = Long.valueOf(sc.nextInt());
			long W = Long.valueOf(sc.nextInt());
			long X = Long.valueOf(sc.nextInt());
			long Y = Long.valueOf(sc.nextInt());
			long Z = Long.valueOf(sc.nextInt());
		 
				if(X>Y){
					if(X>Z){
						if(X>Y+Z){
						X = Y+Z;
						}
					}
				}
				else{
					if(Y>Z){
						if(Y>X+Z){
							Y = X+Z;
							}
					}
				}
			System.out.println(B*X+W*Y);
		}
	}
}
