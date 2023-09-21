
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3_3 {

    public static int solution(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n - k; i++) {
            int sum = 0;

            //i~(i+k) 날까지의 매출액
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }

            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; st.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(n, k, arr));
    }
}
