package Codecata;

public class Quest8 {
    public static void main(String[] args) {
        Solution8 solution = new Solution8();
        System.out.println(solution.solution(91));
    }
}
class Solution8 {
    public int solution(int angle) {
        int answer = 0;
        if(0<angle && angle<90){
            return 1;
        }else if (angle == 90){
            return 2;
        }else if (90 < angle && angle < 180){
            return 3;
        }else if (angle == 180){
            return 4;
        }
        return answer;
    }
}
