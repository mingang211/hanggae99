package codecata7;

import java.util.Arrays;

public class Quest79 {
    public static void main(String[] args) {
        int brown = 10;
        int yellow = 2;
        Solution79 solution79 = new Solution79();
        System.out.println(Arrays.toString(solution79.solution(brown, yellow)));
    }
}
class Solution79 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 3; i < brown+yellow ; i++) {
            int width = (brown+yellow)/i;
            if(width>= i){
                if((i - 2)* (width - 2) == yellow){
                    answer[0] = width;
                    answer[1] = i;
                    break;
                }
            }
        }
        return answer;
    }
}