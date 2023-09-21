import java.util.Scanner;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String s = in.next(); 
		int answer = 0; 
		
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == ')') {
				if(s.charAt(i-1)== '(') { 
					stack.pop();
					answer += stack.size();
				}
				else { 
					stack.pop();
					answer += 1;
				}
			}
			else {
				stack.push('(');
			}
		}
		
		System.out.print(answer);

	}
}
