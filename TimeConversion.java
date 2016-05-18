package practice;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] timeArr = time.split(":");
		String hh = timeArr[0];
		String mm = timeArr[1];
		String ss = timeArr[2];
		if( !hh.equals("12") && ss.charAt(2) == 'A'){
			System.out.println(hh+":"+mm+":"+ss.substring(0,2));
		}
		else if(hh.equals("12") && ss.charAt(2) == 'P'){
			System.out.println(hh+":"+mm+":"+ss.substring(0,2));
		}
		else{
			if(hh.equals("12")){
				hh = "00";
				System.out.println(hh+":"+mm+":"+ss.substring(0,2));
			}
			else{
				int hhi = Integer.parseInt(timeArr[0]);
				hhi = 12+hhi;
				System.out.println(hhi+":"+mm+":"+ss.substring(0,2));
			}
		}
	}
}
