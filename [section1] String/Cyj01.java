// 최윤정 작성
import java.util.*;

public class Cyj01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }

    static String solution(String str) {
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        // 투포인터 느낌
        // 시작 포인트는 한칸씩 뒤로, 끝 포인트는 한칸씩 앞으로 오며 모든 지점을 검사한다.
        while (start < end) {
            // 앞점이 알파벳이 아니라면 패스
            if (!Character.isAlphabetic(arr[start])) {
                start++;
            }
            // 끝점이 알파벳이 아니라면 패스
            else if (!Character.isAlphabetic(arr[end])) {
                end--;
            }
            // 앞점과 끝점이 모두 알파벳일 경우 서로 교환 후 이동한다.
            else {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }

        // char 배열을 string으로 합치는 함수.
        return String.valueOf(arr);
    }
}