package practice;

import java.util.Scanner;

public class TimeInWords {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        
        if((h>=1 && h<=12) && (m>=0 && m<= 60)){
        	String words[]={"", "one", "two", "three", "four", "five", "six","seven", "eight", "nine","ten",
        	        "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
        	        "twenty","twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
        	        "twenty six","twenty seven","twenty eight", "twenty nine"};
        	String min, a;
        	if(m == 1 || m == 59){
        		min = "minute";
        	}
        	else
        		min = "minutes";
        	
        	if(h == 12){
        		a = words[1];
        	}
        	else{
        		a = words[h+1];
        	}
        	
        	if(m == 0){
        		System.out.println(words[h]+" o' clock");
        	}
        	else if(m == 15){
        		System.out.println("quarter past " +words[h]);
        	}
        	else if(m == 45){
        		System.out.println("quarter to "+a);
        	}
        	else if(m ==30){
        		System.out.println("half past "+words[h]);
        	}
        	else if(m < 30){
        		System.out.println(words[m] +" "+ min +" past "+words[h]);
        	}
        	else {
        		System.out.println(words[60-m]+" "+min+ " to"+" "+a);
        	}
        }
	}

}
