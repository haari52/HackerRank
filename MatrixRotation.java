package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixRotation {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int R = Integer.parseInt(input[0]);
		int C = Integer.parseInt(input[1]);
		int nr = Integer.parseInt(input[2]);
		int[][] output = new int[R][C];
		for (int row = 0; row < R; row++) {
			String[] cols = br.readLine().split(" ");
			for (int col = 0; col < C; col++) {
				output[row][col] = Integer.parseInt(cols[col]);
			}
		}
		int[][] results = rotate(output, nr, R, C);
		printMatrix(results);
	}

	private static int[][] rotate(int[][] output, int nr, int R, int C) {
		int layers = (Math.min(R, C)) / 2;
		//Calculating for optimization;
		long divNum = 2*((R-1)+(C-1));
		
		for (int i = 0; i < layers; i++) {
			long rotation = nr%(divNum - 8*i);
			while(rotation > 0){
			int j = i;
			long tempNum = output[i][j];
			// top layer rotation
			int colTrack = j;

			while (j < C - 1 - colTrack) {
				output[i][j] = output[i][j + 1];
				j++;
			}
			// side layer (right) rotation
			int rowTrack = i;
			while (i < R - 1 - rowTrack) {
				output[i][j] = output[i + 1][j];
				i++;
			}
			// bottom layer rotation
			while (j > 0 + colTrack) {
				output[i][j] = output[i][j - 1];
				j--;
			}
			while (i > 0 + rowTrack) {
				output[i][j] = output[i - 1][j];
				i--;
			}
			output[i + 1][j] = (int) tempNum;
			rotation--;
		}
		
		}
		 
		return output;
	}

	private static void printMatrix(int[][] output) {
		for (int row = 0; row < output.length; row++) {
			for (int col = 0; col < output[row].length; col++) {
				System.out.print( output[row][col] +" ");
			}
			System.out.println();
		}
	}

}
