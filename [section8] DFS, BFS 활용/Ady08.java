import java.util.Scanner;

public class Main {
	static int maxScore = 0;
	static int Num = 0;
	static int Limit = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    Num = sc.nextInt(); 
	    Limit = sc.nextInt();
	    int sum = 0;
	    
	    int[][] question = new int[Num][2];
	    
	    for(int i = 0 ; i < Num ; i++) {
	    	question[i][0] = sc.nextInt();
	    	question[i][1] = sc.nextInt();
	    }
	    
	    DFS(0, 0, 0, question);
	    
    	System.out.println(maxScore);
	}

	private static void DFS(int depth, int totalScore, int totalTime, int[][] question) {
		if(totalTime > Limit) {
			return;
		}
		
		if(depth == Num) {
			if(totalTime <= Limit && totalScore > maxScore) {
				maxScore = totalScore;
			}
		} else {
			DFS(depth+1, totalScore+question[depth][0], totalTime + question[depth][1], question);
			DFS(depth+1, totalScore, totalTime, question);
		}
	}
}
