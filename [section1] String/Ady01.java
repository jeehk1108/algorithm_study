import java.util.Scanner;

public class Ex0107 {
    public String solution(String str) {
        String answer = "YES";
        int len = str.length();
        String tmp = str.toUpperCase();

        for(int i=0; i<len/2; i++) {
            if(tmp.charAt(i) != tmp.charAt(len-i-1)) {
                answer="NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Ex0107 T = new Ex0107();
        Scanner in=new Scanner(System.in);
        String s = in.next();
        System.out.println(T.solution(s));
        return ;
    }
}
