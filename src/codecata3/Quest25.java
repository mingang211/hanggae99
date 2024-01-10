package codecata3;

import java.util.ArrayList;
import java.util.Arrays;

public class Quest25 {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        Solution25 solution25 = new Solution25();
        int[] answer = solution25.solution(arr,5);
        System.out.println(Arrays.toString(answer));
    }
}

class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int a: arr){
            if (a % divisor == 0){
                array.add(a);
            }
        }
        if (array.isEmpty()){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            answer[i] = array.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}