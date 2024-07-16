package codecata4;

import java.util.Arrays;

public class Quest48 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        Solution48 solution48 = new Solution48();
        System.out.println(Arrays.toString(solution48.solution(array,commands)));
    }
}
class Solution48 {
    public int[] solution(int[] array, int[][] commands) {
        //command의 길이 만큼 k번 째 있는 수가 나오니깐 command의 길이를 answer에 크기로
        //선언해준다.
        int[] answer = new int[commands.length];
        // 포문을 이용하여 cammand의 각 인덱스를 가져온다.
        for (int i = 0; i < commands.length; i++) {
            // 시작과 끝을 선언해준다.
            int start = commands[i][0];
            int end = commands[i][1];
            // k번째 수를 구하기 위해 temp를 선언하고 end에서 start를 빼 준후 +1을 하여 크기를 정해준다.
            int[] temp = new int[end-start+1];
            //포문을 이용하여 end-start 만큼 순회한다.
            for (int j = 0; j <= end-start ; j++) {
                // 시작하는 인덱스가 0부터 시작해서 -1을 해준다.
                temp[j] = array[j+start-1];
            }
            // 배열을 정리해 준다.
            Arrays.sort(temp);
            // k번째 있는 수를 answer 배열에 answer 배열에 대입해준다.
            answer[i] = temp[commands[i][2]-1];
        }
        return answer;
    }
}
