package practice;

import java.io.InputStreamReader;
import java.util.Scanner;

public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int tc = sc.nextInt();
		int[] resultArray = new int[tc];
		
		for(int i=0;i<tc;i++){
			int n = sc.nextInt();
			int count = 1;
			if(n == 0)
				count = 1;
			else{
				for(int j=1;j<=n;j++){
					if(j%2==0){
						count +=1;
					}
					else
						count = count*2;
				}
			}
			resultArray[i]=count;
		}
		for(int i =0;i<resultArray.length;i++){
			System.out.println(resultArray[i]);
		}
	}

}
