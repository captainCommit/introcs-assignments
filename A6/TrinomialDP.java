public class TrinomialDP {
    public static long trinomial(int n, int k) { 
        k = Math.abs(k);
        long[][] dp = new long[n+2][k+n+1];
        dp[0][0] = 1;
        dp[1][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k + (n - i); j++) {
                if (j > i) {
                    dp[i][j] = 0;
                    continue;
                }

                dp[i][j] = dp[i - 1][Math.abs(j - 1)] + dp[i - 1][j] + dp[i - 1][j + 1];
            }
        }
        return dp[n][k];        
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}