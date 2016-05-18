package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalDifference {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int fsumFwd = 0;
		int fsumBkd = 0;
		for(int i=0;i<N;i++){
			String[] str = br.readLine().split(" ");
			fsumFwd = fsumFwd+Integer.parseInt(str[i]);
			fsumBkd = fsumBkd+Integer.parseInt(str[N-i-1]);
		}
		System.out.println(Math.abs(fsumFwd-fsumBkd));
	}

}
