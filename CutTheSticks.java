package practice;

import java.util.Arrays;
import java.util.Scanner;
 

public class CutTheSticks { 
	
	public static void main(String s[])  {
	
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int arr[] = new int[N];
   for(int i=0;i<arr.length;i++){
	   arr[i] = sc.nextInt();
   }
    Arrays.sort(arr);
    StringBuffer sb = new StringBuffer();
    System.out.println(N);
    for (int i = 1; i < N; i++) {
        if (arr[i - 1] != arr[i]) {
            sb.append((N - i) + "\n");
        }
    }
    System.out.print(sb);
}
}
