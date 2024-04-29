package codecata8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Quest83 {
    public static void main(String[] args) {
        int k = 6;
        int[] tangerine = {1,3,2,5,4,5,2,3};
        Solution83 solution83 = new Solution83();
        System.out.println(solution83.solution(k,tangerine));
    }
}
class Solution83 {
    public int solution(int k, int[] tangerine) {
        // 선택된 귤의 개수를 저장하는 변수
        int sum = 0;
        // 최종적으로 선택된 귤 그룹의 개수를 저장하는 변수
        int answer = 0;

        // 각 귤의 종류와 개수를 저장하는 HashMap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        // 각 귤의 개수를 카운트하여 map에 저장
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 귤의 개수를 내림차순으로 정렬한 리스트
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());

        // 정렬된 리스트를 반복하며 최소 귤 그룹 선택
        for (int v : valueList) {
            // 총 귤의 개수가 주어진 값 k 이상이 되면 반복 종료
            if (sum + v >= k) {
                answer++; // 선택된 귤 그룹의 개수 증가
                break; // 반복 종료
            } else {
                // 아직 총 귤의 개수가 주어진 값 k 미만이면 다음 귤 그룹을 선택
                sum += v; // 귤 그룹에 해당하는 개수를 더함
                answer++; // 선택된 귤 그룹의 개수 증가
            }
        }

        // 최소 귤 그룹의 개수 반환
        return answer;
    }
}