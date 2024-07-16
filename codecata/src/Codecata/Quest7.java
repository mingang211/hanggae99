package Codecata;

public class Quest7 {
    public static void main(String[] args) {
        Solution7 solution = new Solution7();
        System.out.println(solution.solution(7,3));
    }
}
class Solution7 {
    public int solution(double num1, double num2) {
        int answer = (int) (num1/num2 * 1000) ;
        return answer;
    }
}