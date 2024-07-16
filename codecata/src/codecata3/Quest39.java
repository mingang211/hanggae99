package codecata3;

import java.util.Arrays;

public class Quest39 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        System.out.println(Arrays.toString(solution39.solution(3,12)));
    }
}
class Solution39 {
    public int[] solution(int n, int m) {
        int maxDiv = 0;
        // 최대 공약수를 구하기 위해 for문으로 돌려서 n과m이 i로 나눈 값이 0이면
        //최대 공약수이고 가장 큰 수 까지 나눠야 확인 할 수 있을 것 같아서 if문 사용하여
        //i가 큰 수까지 진행 할 수 있도록 함
        if(m>n) {
            for (int i = 1; i < m; i++) {
                if (n % i == 0 && m % i == 0) {
                    maxDiv = i;
                }
            }
        }else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0 && m % i == 0) {
                    maxDiv = i;
                }
            }
        }
        //최소공배수 구하기
        //최소공배수 구하는 방법을 인터넷에 검색해보니
        // 두 수를 곱해서 최대 공약수로 나누면 된다고 해서
        int minMulti = n * m / maxDiv;
        int[] answer = new int[] {maxDiv,minMulti};
        return answer;
    }
}
