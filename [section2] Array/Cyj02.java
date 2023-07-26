import java.util.*;

public class Cyj02 {
  public static void main(String[] args) {
    Main m = new Main();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println(m.solution(n));
  }

  public int solution(int n) {
    int answer = 0;
    int[] nums = new int[n + 1];
    for (int i = 2; i <= n; i++) {
      if (nums[i] != 1) {
        answer++;
        for (int j = i * 2; j <= n; j += i) {
          nums[j] = 1;
        }
      }
    }

    return answer;
  };
}