package Codecata;

public class Quest11 {
    public static void main(String[] args) {
        Solution11 solution = new Solution11();
        System.out.println(solution.solution(3));
    }
}
class Solution11 {
    public String solution(int num) {
        String answer = "";
        answer = (num % 2 == 0)? "Even":"Odd";
        return answer;
    }
}