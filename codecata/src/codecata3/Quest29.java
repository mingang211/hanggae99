package codecata3;

import java.util.Arrays;

public class Quest29 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        Solution29 solution29 = new Solution29();
        System.out.println(Arrays.toString(solution29.solution(arr)));
    }
}

class Solution29 {
    public int[] solution(int[] arr) {
        int[] answer;
        int min = arr[0];

        if (arr.length <= 1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            int index = 0;
            answer = new int[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != min) {
                    answer[index] = arr[i];
                    index++;
                }
            }
        } return answer;
    }
}
