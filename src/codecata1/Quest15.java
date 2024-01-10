package codecata1;

public class Quest15 {
    public static void main(String[] args) {
        Solution15 solution = new Solution15();
        System.out.println(solution.solution(10));
    }
}
class Solution15 {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n ; i++) {
            if(n%i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }
}