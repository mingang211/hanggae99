package codecata5;

import java.util.Arrays;

public class Quest56 {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        Solution56 solution56 = new Solution56();
        System.out.println(solution56.solution(k,m,score));
    }
}
class Solution56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        // 최대 이익을 남기기 위해 높은 값의 사과만 상자에 담을려고 오름차순으로 정렬
        Arrays.sort(score);
        // 포문을 이용하여 상자에 담긴 것 중에 가장 작은 값을
        // m으로 곱한 값을 answer에 더하면서 대입해준다.
        for(int i = score.length-m ; i >= 0 ; i-=m){
            answer += score[i] * m;
        }
        return answer;
    }
}
