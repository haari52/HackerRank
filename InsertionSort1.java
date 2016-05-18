package practice;

import java.io.IOException;
import java.util.Scanner;

public class InsertionSort1 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */

    public static void insertIntoSorted(int[] ar) {
       	 int temp =  ar[ar.length-1];
		 ar[ar.length-1]=ar[ar.length-2];
		 printArray(ar);
	        // Fill up this function  
		 	for(int i=ar.length-2;i>=0;i--){
		 		if(i-1 >=0){
		 		if(ar[i-1]>temp){
		 			ar[i]=ar[i-1];
		 		}
		 		else {
		 			ar[i]=temp;
		 		}
		 		}
		 		if(i == 0 && ar[i]>temp ){
		 			ar[i] = temp;
		 		}
		 		printArray(ar);
		 		if( i >0 && ar[i-1]<ar[i]){
		 			break;
		 		}
		 	}
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
