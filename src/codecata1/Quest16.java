package codecata1;

import java.util.Arrays;

public class Quest16 {
    public static void main(String[] args) {
        Solution16 solution = new Solution16();
        System.out.println(Arrays.toString(solution.solution(2,5)));
    }
}
class Solution16 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer [0] = x;
        for (int i = 1; i< n ; i++){
            answer[i] = answer[i-1] + x;
        }
        return answer;
    }
}