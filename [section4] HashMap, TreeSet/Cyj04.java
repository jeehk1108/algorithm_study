// package [section4] HashMap, TreeSet;
import java.util.*;

class Cyj04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String str = sc.next();

    char result = solution(num, str);
    System.out.println(result);
  }

  static char solution(int num, String str) {
    char result = ' ';
    Map<Character, Integer> map = new HashMap<>();
    
    for(char c: str.toCharArray()) {
      map.put(c, map.getOrDefault(c, 1)+1);
    }

    int max = Integer.MIN_VALUE;
    for(char c: map.keySet()) {
      if(map.get(c) > max) {
        max = map.get(c);
        result = c;
      }
    }
    
    return result;
  }
}