package codecata8;

import java.util.HashSet;
import java.util.Set;

public class Quest85 {
    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        Solution85 solution85 = new Solution85();
        System.out.println(solution85.solution(elements));
    }
}

class Solution85 {
    public int solution(int[] elements) {
        // 중복을 허용하지 않는 집합 set을 생성합니다.
        Set<Integer> set = new HashSet<>();

        // 연속 부분합의 길이를 나타내는 변수 start를 1로 초기화합니다.
        int start = 1;

        // start 값이 elements 배열의 길이보다 작거나 같은 동안 반복합니다.
        while (start <= elements.length) {
            // 배열의 각 요소를 시작점으로 하는 연속 부분합을 생성합니다.
            for (int i = 0; i < elements.length; i++) {
                // 현재 연속 부분합의 값을 나타내는 변수 value를 초기화합니다.
                int value = 0;
                // 현재 위치부터 start 길이만큼의 연속된 부분합을 계산합니다.
                for (int j = i; j < i + start; j++) {
                    // 배열을 순환하여 처리하기 위해 % 연산자를 사용합니다.
                    value += elements[j % elements.length];
                }
                // 계산된 연속 부분합을 set에 추가합니다.
                set.add(value);
            }
            // 다음 연속 부분합의 길이를 검사하기 위해 start 값을 증가시킵니다.
            start++;
        }

        // 중복을 제거한 서로 다른 연속 부분합의 개수를 반환합니다.
        return set.size();
    }
}
