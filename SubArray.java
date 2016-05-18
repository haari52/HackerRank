package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
			int N, NC=0;
			N = sc.nextInt();
			
			int arr[] = new int[N];
			boolean positive = false;
			int max_so_far = 0;
			int max_ending_here = 0;
			
			for(int i=0;i<N;i++){
		         arr[i]=sc.nextInt();
		            if(arr[i]>0){
		                NC+=arr[i];
		                positive = true;
		            }
		            max_ending_here = max_ending_here + arr[i];

		            if(max_ending_here < 0)
		            	max_ending_here = 0;
		            
		            if(max_so_far < max_ending_here)
		            	max_so_far = max_ending_here;
		        }
			  if(!positive){
				  Arrays.sort(arr);
				  System.out.println(arr[arr.length-1] +" "+arr[arr.length-1]);
			  }
			  else{
				  System.out.println(max_so_far + " "+NC );
			  }
		}
	}
}
