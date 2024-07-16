package Codecata;

public class Qeust4 {
    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        System.out.println(solution.solution(40));
    }
}
class Solution4 {
    public int solution(int age) {
        int answer = 2022-age+1;
        return answer;
    }
}
