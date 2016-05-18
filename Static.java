package practice;


import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Static {
	static boolean flag = false;
	static int B=0;
	static int H=0;
	static{
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		B = sc.nextInt();
		H = sc.nextInt();
		
		if(B>0 && H>0){
			flag = true;
		}
		else{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
		
	}
		 
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 if(flag){
			int area = B * H;
			System.out.println(area);
		} 
	}

}
