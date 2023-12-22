package Codecata;

public class Quest6 {
    public static void main(String[] args) {
        Solution6 solution = new Solution6();
        System.out.println(solution.solution(3,2));
    }
}
class Solution6 {
    public int solution(int num1, int num2) {
        int answer = num1+num2;
        return answer;
    }
}