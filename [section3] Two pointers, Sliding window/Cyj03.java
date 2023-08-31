import java.util.*;

public class Cyj03 {
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

    public ArrayList<Integer> solution(int n, int[] ns, int m, int[] ms) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(ns);
        Arrays.sort(ms);
        
        int xi = 0;
        int x = ns[xi];
        int yi = 0;
        int y = ms[yi];

        while(xi < n && yi < m) {
            if(x == y) {
                answer.add(x);
                xi++;
                yi++;
            } else if(x < y) {
                xi++;
            } else {
                yi++;
            }

            if(xi >= n || yi >= m) break;
            
            x = ns[xi];
            y = ms[yi];
        }
        
        return answer;
    }
}