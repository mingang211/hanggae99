package codecata8;

public class Quest82 {
    public static void main(String[] args) {
        int n = 8;
        Solution82 solution82 = new Solution82();
        System.out.println(solution82.solution(n));
    }
}
class Solution82 {
    public long solution(int n) {
        long[] dp = new long[n+1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n ; i++) {
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n];
    }
}