package practice;

import java.util.Scanner;

public class InsertionSort2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
	       int s = in.nextInt();
	       int[] ar = new int[s];
	       for(int i=0;i<s;i++){
	            ar[i]=in.nextInt(); 
	       }
	      insertionSortPart2(ar);
	}

	private static int[] insertionSortPart2(int[] input) {
		int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
            printArray(input);
        }
        return input;
    }
 

	private static void printArray(int[] ar) {
	      for(int n: ar){
	         System.out.print(n+" ");
	      }
	        System.out.println("");
	   }
}
