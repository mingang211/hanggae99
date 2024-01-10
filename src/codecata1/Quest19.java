package codecata1;

public class Quest19 {
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        System.out.println(solution.solution(121));
    }
}
class Solution19 {
    public long solution(long n) {
        long answer = 0;
        if ( Math.sqrt(n) % 1 == 0){
            answer = (long) ((Math.sqrt(n)+1) * (Math.sqrt(n)+1));
        }else {
            answer = -1;
        }
        return answer;
    }
}