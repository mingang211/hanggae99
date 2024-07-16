package codecata8;

import java.util.HashMap;
import java.util.Map;

public class Quest89 {
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3,2,2,2,1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice",
                "pot", "banana", "apple", "banana"};
        Solution89 solution89 = new Solution89();
        System.out.println(solution89.solution(want, number, discount));
    }
}

class Solution89 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int day = 10;

        Map<String, Integer> wantMap = createMap(want, number);

        for (int i = 0; i <= discount.length - day; i++) {
            Map<String, Integer> discountMap = createMap(discount, i, day);

            if (wantMap.equals(discountMap)) {
                answer++;
            }
        }

        return answer;
    }
    //
    private Map<String, Integer> createMap(String[] items, int[] numbers) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < items.length; i++) {
            map.put(items[i], numbers[i]);
        }
        return map;
    }

    private Map<String, Integer> createMap(String[] items, int startIndex, int length) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = startIndex; i < startIndex + length; i++) {
            map.put(items[i], map.getOrDefault(items[i], 0) + 1);
        }
        return map;
    }
}