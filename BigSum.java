package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigSum {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		String[] str = br.readLine().split(" ");
		long count = 0;
		for(int i=0;i<tc;i++){
			count += Long.parseLong(str[i]);
		}
		System.out.println(count);
	}

}
