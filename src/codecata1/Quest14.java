package codecata1;

public class Quest14 {
    public static void main(String[] args) {
        Solution14 solution = new Solution14();
        System.out.println(solution.solution(12));
    }
}
class Solution14 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n ; i ++){
            if (n % i == 0){
                answer += i;
            }
        }
        return answer;
    }
}
