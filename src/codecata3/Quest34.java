package codecata3;

import java.util.Arrays;

public class Quest34 {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        Solution34 solution34 = new Solution34();
        System.out.println(solution34.solution(s));
    }
}

class Solution34 {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
                arr = s.toCharArray();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            answer += arr[arr.length-1-i];
        }
        return answer;
    }
}