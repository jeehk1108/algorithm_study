import java.util.Scanner;

public class I0810 {
  static int[] dx = {0, 0, -1, 1};
  static int[] dy = {-1, 1, 0, 0};
  static int cnt = 0;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[][] board = new int[7][7];
    boolean[][] visited = new boolean[7][7];

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 7; j++) {
        board[i][j] = sc.nextInt();
      }
    }

    dfs(board, visited, 0, 0);

    System.out.println(cnt);
  }

  static void dfs(int[][] board, boolean[][] visited, int x, int y) {

    boolean[][] tmp = visited.clone();
    if (x == 6 && y == 6) {
      cnt++;
      return;
    }
    visited[x][y] = true;
    for (int i = 0; i < 4; i++) {
      int nx = x + dx[i];
      int ny = y + dy[i];
      if (nx >= 0 && ny >= 0 && nx < board.length && ny < board.length) {
        if (!visited[nx][ny] && board[nx][ny] == 0) {
          dfs(board, visited, nx, ny);
          visited[nx][ny] = false;
        }
      }
    }
  }
}