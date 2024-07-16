package codecata4;

import java.util.Arrays;

public class Quest47 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        String[] answer = {};
        Solution47 solution47 = new Solution47();
        System.out.println(
                Arrays.toString(solution47.solution(strings, n))
        );
    }
}
class Solution47 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        int cnt = 0;
        //사전순으로 정의하기 위해 미리 정렬해준다.
        Arrays.sort(strings);

        // 이중 for문을 이용하여 문자열배열과 아스키코드를 이용하여 비교한다
        //아스키 코드 97번 부터 122번까지 알파벳 소문자이므로 123보다 작을 때까지 순회한다.
        for(int i = 97; i < 123; i++) {
            for(int j = 0; j < strings.length; j++) {
                // 문자열배열 j번째 문자열이 아스키코드 i와 같으면 cnt에 1을 더해주고 해당 인덱스에
                //string[i]를 대입해준다.
                if(strings[j].charAt(n) == (char)i) {
                    answer[cnt++] = strings[j];
                }
            }
        }
        return answer;
    }
}