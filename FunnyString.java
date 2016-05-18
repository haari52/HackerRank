package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunnyString {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		for(int i =0;i<tc;i++){
			String input = br.readLine();
			byte[] bytes = input.getBytes("US-ASCII");
			boolean flag = false;
			int[] diffArray = new int[input.length()-1];
			 
			for(int j=0;j<bytes.length;j++){
				if(j+1 < bytes.length){
				diffArray[j]=Math.abs(bytes[j+1]-bytes[j]);
				}
				 
			}
			int k = diffArray.length-1;
			for(int j=0;j<diffArray.length/2;j++){
				if(diffArray[j] == diffArray[k]){
					flag = true;
				}
				else{
					flag = false;
					break;
				}
				k--;
			}
			if(flag)
				System.out.println("Funny");
			else
				System.out.println("Not Funny");
		} 
	}

}
