package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GridSearch {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());
		assert tc>= 1 && tc <=5;
		int[][] grid;
		int[][] pattern;
		
		for(int t=0;t<tc;t++){
			grid =  buildArray(br);
			pattern = buildArray(br);
			System.out.println(findPattern(grid,pattern));
		}
	}
 
	private static String findPattern(int[][] grid, int[][] pattern) {
		for(int R=0;R<grid.length - pattern.length+1;R++){
			for(int C=0;C<grid[0].length - pattern[0].length+1;C++){
				outerLoop:
					for(int r=0;r<pattern.length;r++){
						for(int c=0;c<pattern[0].length;c++){
							if(grid[R+r][C+c] != pattern[r][c]){
								break outerLoop;
							}
						}
						if(r == pattern.length -1){
							return "YES";
						}
					}
		}
		
	}
		return "NO";
}
	private static int[][] buildArray(BufferedReader br) throws IOException {
		 String[] size = br.readLine().split(" ");
		 int rows = Integer.parseInt(size[0]);
		 int columns = Integer.parseInt(size[1]);
		 int[][] array = new int[rows][columns];
		 
		 for(int i=0;i<rows;i++){
			 String rowOfNumbers = br.readLine();
			 for(int j=0;j<columns;j++){
				 array[i][j] = Character.getNumericValue(rowOfNumbers.charAt(j));
			 }
		 }
		return array;
	}
}