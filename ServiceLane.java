package practice;

import java.util.Scanner;

public class ServiceLane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] width = new int[N];
		for(int i=0;i<N;i++){
			width[i] = sc.nextInt();
		}
		
		for(int t=0;t<T;t++){
			int i = sc.nextInt();
			int j = sc.nextInt();
			int output =width[i];
			for(int k = i;k<=j;k++){
				if(width[k]<output){
					output = width[k];
				}
			}
			System.out.println(output);
		}
	}
}
