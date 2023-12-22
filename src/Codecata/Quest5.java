package Codecata;

public class Quest5 {
    public static void main(String[] args) {
        Solution5 solution = new Solution5();
        System.out.println(solution.solution(1,1));
    }
}
class Solution5 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1 == num2){
            answer = 1;
        }else{
            answer = -1;
        }
        return answer;
    }
}
