package Codecata;

public class Quest9 {
    public static void main(String[] args) {
        Solution9 solution = new Solution9();
        System.out.println(solution.solution(4));
    }
}
class Solution9 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            if(i%2==0){
                answer+=i;
            }
        }
        return answer;
    }
}