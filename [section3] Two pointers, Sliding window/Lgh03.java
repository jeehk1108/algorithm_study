import java.util.*;

 

public class Main {

    public static void main(String[] args) {

        Main ma = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

 

       

        System.out.println(ma.solution(n));

    }

 

    public int solution(int n) {

        int answer = 0;

        int start = 1;

        int end = 2;

        int sum = start + end;

 

        while(end <= n/2 + 1) {

            if(sum < n) {

                end++;

                sum += end;

            } else if(sum == n) {

                answer++;

                end++;

                sum += end - start;

                start++;

            } else {

                sum -= start;

                start++;

            }

 

        }

 

        return answer;

    }

}