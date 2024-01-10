package codecata2;

import java.util.Arrays;

public class Quest20 {
    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        System.out.println(solution.solution(118372));
    }
}

class Solution20 {
    public long solution(long n) {
        long answer = 0;
        String s = Long.toString(n);
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] =""+ s.charAt(i);
        }
        Arrays.sort(arr);
        String a = "";
        for (int i = 0; i < arr.length ; i++) {
            a += arr[arr.length-1-i];
        }
        answer = Long.parseLong(a);
        return answer;
    }
}
