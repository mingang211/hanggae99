package codecata8;

import java.util.Arrays;

public class Quest86 {
    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        Solution86 solution86 = new Solution86();
        System.out.println(solution86.solution(citations));
    }
}
class Solution86 {
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for (int i = 0; i < citations.length ; i++) {
            int cnt = citations.length - i;
            if(citations[i] >= cnt){
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}
