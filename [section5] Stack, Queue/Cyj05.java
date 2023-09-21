import java.util.*;
  
class Cyj05 {
  public static void main(String[] args){
    Scanner in =new Scanner(System.in);
    
    	String str = in.next();
        Stack<Character> stack = new Stack<>();
        String answer = "";

        for(char ch : str.toCharArray()){
            if(ch == ')'){
                while(stack.pop() != '(');
            }else{
                stack.push(ch);
            }
        }

        for(char ch : stack){
            answer += ch;
        }
    System.out.println(answer);
  }
}