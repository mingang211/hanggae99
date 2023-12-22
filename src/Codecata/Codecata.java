package Codecata;

public class Codecata {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3,4));

    }
}
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }
}