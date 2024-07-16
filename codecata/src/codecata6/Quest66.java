package codecata6;

import java.util.Arrays;
import java.util.HashMap;

public class Quest66 {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        Solution66 solution66 = new Solution66();
        System.out.println(Arrays.toString(solution66.solution(keymap,targets)));
    }
}
class Solution66 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        // 키보드의 각 키에 대한 위치 정보를 저장할 HashMap을 만듭니다.
        HashMap<Character, Integer> map = new HashMap<>();

        // keymap 배열을 순회하면서 각 키에 대한 위치 정보를 map에 저장합니다.
        for (int i = 0; i < keymap.length; i++) {
            String s = keymap[i];

            // 각 문자를 한 번에 하나씩 처리합니다.
            for (int j = 0; j < s.length(); j++) {
                char currentChar = s.charAt(j);
                int location = map.getOrDefault(currentChar, -1);

                // 만약 해당 문자의 위치 정보가 없거나 현재 위치보다 작을 경우에만 갱신합니다.
                if (location == -1 || location > j) {
                    // 위치 정보를 1 더해서 저장합니다. (누른 횟수로 계산하기 위함)
                    map.put(currentChar, j + 1);
                }
            }
        }

        // targets 배열을 순회하면서 각 문자열에 대한 누른 횟수를 계산합니다.
        for (int i = 0; i < targets.length; i++) {
            String targetStr = targets[i];
            int result = 0;

            // 문자열을 한 번에 하나씩 처리합니다.
            for (int j = 0; j < targetStr.length(); j++) {
                char miniTarget = targetStr.charAt(j);
                int resultChunk = map.getOrDefault(miniTarget, -1);

                // 만약 해당 문자의 위치 정보가 없으면 결과를 -1로 설정하고 반복을 중단합니다.
                if (resultChunk == -1) {
                    result = -1;
                    break;
                } else {
                    // 누른 횟수를 더합니다.
                    result += resultChunk;
                }
            }

            // 최종 결과를 배열에 저장합니다.
            answer[i] = result;
        }

        return answer;
    }
}
