import java.util.*;

 

public class Main {

    public static void main(String[] args) {

        Main ma = new Main();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ns = new int[n];

        for (int i = 0; i < n; i++) {

            ns[i] = sc.nextInt();

        }

       

        int m = sc.nextInt();

        int[] ms = new int[m];

        for (int i = 0; i < m; i++) {

            ms[i] = sc.nextInt();

        }

 

        for(int x: ma.solution(n, ns, m, ms)) {

            System.out.print(x + " ");    

        }

        // System.out.println(m.solution(n, nums));

    }

 

    public int[] solution(int n, int[] ns, int m, int[] ms) {

        int[] answer = new int[n+m];

        int xi = 0;

        int x = ns[xi];

        int yi = 0;

        int y = ms[yi];

 

        for(int i = 0; i < n+m; i++) {

            if(x < y) {

                answer[i] = x;

                xi++;

                if(xi < n) {

                    x = ns[xi];

                } else {

                    x = 999999999;

                }

            } else {

                answer[i] = y;

                yi++;

                if(yi < m) {

                    y = ms[yi];

                } else {

                    y = 999999999;

                }

            }

        }

       

        return answer;

    }

}