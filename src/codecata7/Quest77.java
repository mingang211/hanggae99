package codecata7;

import java.util.Arrays;

public class Quest77 {
    public static void main(String[] args) {
        String s = "110010101001";
        Solution77 solution77 = new Solution77();
        System.out.println(Arrays.toString(solution77.solution(s)));
    }
}
class Solution77 {
    public int[] solution(String s) {
        // 이진변환의 횟수와 변환과정에서 제거된 모든 0의 수를 담아야 해서 크기를 2로 선언
        int[] answer = new int[2];
        //문자열 s의 길이가 1보다 클 때만 순회
        while (s.length()>1){
            int cnt = 0;
            // 포문을 이용하여 문자열 s의 길이만큼 순회
            for (int i = 0; i < s.length(); i++) {
                //만약에 0이라면 0의 개수추가
                if(s.charAt(i) == '0'){
                    answer[1]++;
                //아니라면 cnt를 추가(이게 s에서 0을 빼고 1만 있을 때 길이)
                }else{
                    cnt++;
                }
            }
            // s의 길이를 이진수로 바꿈
            s = Integer.toBinaryString(cnt);
            //이진변환 횟수의 1을 더함
            answer[0]++;
        }
        return answer;
    }
}