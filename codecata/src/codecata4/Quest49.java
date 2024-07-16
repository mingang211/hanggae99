package codecata4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quest49 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        Solution49 solution49 = new Solution49();
        System.out.println(Arrays.toString(solution49.solution(numbers)));
    }
}
class Solution49 {
    public int[] solution(int[] numbers) {
        int[] answer;
        // 두 수의 합을 담을 Integer타입의 list 선언
        List<Integer> list = new ArrayList<Integer>();
        // 2중 포문을 이용하여 두 숫자의 합을 더함
        for(int i = 0 ; i < numbers.length; i++){
            // i 번째 다음 수를 더하기 위해 i+1로 선언
            for(int j = i+1 ; j < numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                // 두 수의 합이 list에 포함 되어 있지 않으면 list에 더해줌
                if(!list.contains(sum)){
                    list.add(sum);
                }
            }
        }
        int cnt = 0;
        // answer의 크기를 list의 사이즈 만큼 초기화
        answer = new int[list.size()];
        // int 배열로 바꾸기 위해 list에서 하나씩 가져와 대입해줌
        for(int num : list){
            answer[cnt++] = num;
        }
        //배열을 오름차순으로 정렬
        Arrays.sort(answer);
        return answer;
    }
}