package codecata1;

public class Quest13 {
    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        System.out.println(solution.solution(123));
    }
}

class Solution13 {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);
        for (int i = 0; i < str.length(); i++) {
            answer += str.charAt(i) - '0';
        }
        return answer;
    }
}
