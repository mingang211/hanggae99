package codecata6;

import java.util.Arrays;

public class Quest64 {
    public static void main(String[] args) {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};
        Solution64 solution64 = new Solution64();
        System.out.println(solution64.solution(n,lost,reserve));
    }
}
class Solution64 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(reserve);
        Arrays.sort(lost);
        // 도난 당하지 않은 학생 수
        answer = n - lost.length;
        // 이중 for문을 이용하여 여벌 체육복을 가져왔지만 도난당한 학생의 수를 구한다.
        // 첫번째 for문은 잃어버린 학생의 수 만큼 순회하고
        for (int i = 0; i < lost.length; i++) {
            // 두번째 for문에서는 가져온 학생의 수 만큼 순회한다.
            for (int j = 0; j < reserve.length; j++) {
                //잃어버린 학생과 제공하는 학생이 같으면 answer에 1을 더하고
                // 잃어버린학생과 제공하는 학생에 -1을 해주어 제외해준다.
                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        // 이중 for문을 이용하여 참여할 수 있는 학생의 수를 구한다.
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
