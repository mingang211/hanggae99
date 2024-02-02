package codecata5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Quest53 {
    public static void main(String[] args) {
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        int k = 3;
        Solution53 solution53 = new Solution53();
        System.out.println(Arrays.toString(solution53.solution(k, score)));
    }
}
class Solution53 {
    public int[] solution(int k, int[] score) {
        // 정답을 넣을 배열 answer를 선언해 준다
        int[] answer = new int[score.length];
        //순위를 담을 rank를 선언해준다.
        List<Integer> rank = new ArrayList<>();
        //for문을 이용하여 score의 길이만큼 반복하면서 스코어를 rank에 등록한다.
        for (int i = 0; i < score.length; i++) {
            rank.add(score[i]);
            // rank의 크기가 k보다 크다면
            if(rank.size() > k ){
                // rank의 가장 작은 숫자를 제거한다.
                rank.remove(Collections.min(rank));
            }
            // 순위중 가장 작은 수를 정답 배열 answer에 대입해 준다.
            answer[i] = Collections.min(rank);
        }
        return answer;
    }
}
