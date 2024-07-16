package codecata6;

import java.util.Arrays;

public class Quest61 {
    public static void main(String[] args) {
        int[] lottos = {44,1,0,0,31,25};
        int[] win_nums = {31,10,45,1,6,19};
        Solution61 solution61 = new Solution61();
        System.out.println(Arrays.toString(solution61.solution(lottos,win_nums)));
    }
}
class Solution61 {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 순위에 따른 당첨 개수를 담은 배열을 선언한다.
        int[] rank = {6, 6, 5, 4, 3, 2, 1};
        // 결과를 담을 배열을 크기가 2인 배열로 선언한다 (answer[0]: 최고 순위, answer[1]: 최저 순위)
        int[] answer = new int[2];
        //for문을 이용하여 lottos의 길이만 큼 순회한다.
        for (int i = 0; i < lottos.length; i ++) {
            // 0인 경우, 알 수 없는 번호로 간주하여 최고 순위
            if (lottos[i] == 0) {
                answer[0]++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    // 일치하는 번호가 있으면 최고 순위와 최저 순위 모두 증가
                    answer[0]++;
                    answer[1]++;
                }
            }
        }
        // 순위에 따른 등수로 변환
        answer[0] = rank[answer[0]];
        answer[1] = rank[answer[1]];

        return answer;
    }
}
