import java.util.Scanner;
import java.util.Stack;

public class Main39 {
    public int solution(String str){
        int answer = 0;

        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            int number = (int) x;
            if(number>=48 && number<=57)
                stack.push(number - 48);
            else{
                int rt = stack.pop();
                int lt = stack.pop();
                if(x == '+')
                    stack.push(lt+rt);
                else if(x=='/')
                    stack.push(lt/rt);
                else if (x == '*')
                    stack.push(lt*rt);
                else if(x == '-')
                    stack.push(lt-rt);
            }
        }

        answer = stack.get(0);


        return answer;
    }

    public static void main(String[] args) {
        Main39 T = new Main39();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}