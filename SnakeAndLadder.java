package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SnakeAndLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] board = new int[100];
		for(int i=0;i<T;i++){
			for(int j=0;j<100;j++){
				board[j] = -1;
			}
			int L = sc.nextInt();
			for(int l=0;l<L;l++){
				board[sc.nextInt()]=sc.nextInt();
			}
			int S = sc.nextInt();
			for(int s=0;s<S;s++){
				board[sc.nextInt()]=sc.nextInt();
			}
			System.out.println(MinimumDiceThrows(board,100));
			
		}
	}

	static int MinimumDiceThrows(int[] board, int N) {
		boolean[] visited = new boolean[N];
		for(int i=0;i<N;i++){
			visited[i] = false;
		}
		Queue<QueueEntry> q = new LinkedList<QueueEntry>();
		visited[0] = true;
		QueueEntry s = new QueueEntry();
		s.distance=0;
		s.vertex=0;
		q.add(s);
		 
		QueueEntry qe = new QueueEntry();
		while(!q.isEmpty() ){
			qe = q.peek();
			int vertex = qe.vertex;
			q.remove();
			for(int i= 1;i<=vertex+6&& i<N;++i){
				
				if(visited[i] == false){
					QueueEntry cell = new QueueEntry();
					cell.distance = (qe.distance + 1);
					visited[i] = true;
					
					if(board[i] != -1){
						cell.vertex = board[i];
					}
					else{
						cell.vertex=i;
					}
					
					q.add(cell);
				}
			}
		}
		if(qe.vertex != N-1){
			return -1;
		}
		else
		return qe.distance;
	}
	
	static class QueueEntry{
		int vertex;
		int distance;
		 
	}

}
