import java.util.*;

public class Solution {
     public static boolean rec(int leap, int[]  game, int i, boolean[] visited)
    {
        //System.out.println(i);
        if(i>=game.length)
        {
            return true;
        }
        
        if(visited[i] == true || game[i]!=0)
        {
            return false;
        }
        visited[i] = true;
        
        if(rec(leap, game, i+leap, visited))
        {
            return true;
        }
        
        if(rec(leap, game, i+1, visited))
        {
            return true;
        }
        
        if(i-1>=0)
        {
            if(rec(leap, game, i-1, visited))
            {
                return true;
            }
        }
        
        return false;
        
    }
    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        boolean[] visited = new boolean[game.length];
        int i = 0;
        
        return rec(leap, game, i, visited);
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
