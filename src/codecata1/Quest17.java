package codecata1;

import java.util.Arrays;

public class Quest17 {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        int[] arr = solution.solution(12345);
        System.out.println(Arrays.toString(arr));
    }
}
class Solution17 {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length()-i-1)-'0';
        }
        return answer;
    }
}
