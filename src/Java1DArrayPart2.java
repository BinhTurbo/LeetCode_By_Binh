import java.util.Scanner;

public class Java1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        boolean[] visited = new boolean[game.length];
        return dfs(0, leap, game, visited);
    }

    private static boolean dfs(int i, int leap, int[] game, boolean[] visited) {
        int n = game.length;
        if (i >= n) return true;
        if (i < 0) return false;
        if (game[i] == 1) return false;
        if (visited[i]) return false;
        visited[i] = true;
        return dfs(i + leap, leap, game, visited)
                || dfs(i + 1, leap, game, visited)
                || dfs(i - 1, leap, game, visited);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
