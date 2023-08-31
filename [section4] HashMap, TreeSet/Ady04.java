import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypesOfSales {
  public static void main(String[] args) {
    TypesOfSales T = new TypesOfSales();
    Scanner kb = new Scanner(System.in);
    int n = kb.nextInt();
    int k = kb.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = kb.nextInt();
    }
    for (int x : T.solution(n, k, arr)) {
      System.out.print(x + " ");
    }
  }

  public ArrayList<Integer> solution(int n, int k, int[] arr) {
    ArrayList<Integer> answer = new ArrayList<>();
    int tmp = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = tmp; i < k; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }

    answer.add(map.size());

    while (k < n) {

      map.put(arr[k], map.getOrDefault(arr[k], 0) + 1);
      map.put(arr[tmp], map.get(arr[tmp]) - 1);

      if (map.get(arr[tmp]) == 0) map.remove(arr[tmp]);

      answer.add(map.size());
      tmp++;
      k++;
    }
    return answer;
  }

}
