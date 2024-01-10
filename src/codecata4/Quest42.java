package codecata4;

public class Quest42 {
    public static void main(String[] args) {
        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        Solution42 solution42 = new Solution42();
        System.out.println(solution42.solution(number));
    }
}
class Solution42 {
    public int solution(int[] number) {
        int answer = 0;
        // 각 수의 합을 알기 위해 int타입의 sum변수 선언
        int sum = 0;
        // number 배열에 모든 수의 합을 알기 위해 for문 3개를 이용해서 모든 수를 더해줌
        for (int i = 0; i < number.length ; i++) {
            //i번 째 다음 수를 가져오기 위해 j는 i + 1번째 부터
            for (int j = i+1; j < number.length; j++) {
                // j 번째 다음 수를 가져오기 위해 j+1번째 부터
                for (int k = j+1; k < number.length; k++) {
                    sum = number[i] + number[j] + number[k];
                    // 연속된 3자리의 수의 합이 0이면 answer에 1을 더해 줌
                    if(sum == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
