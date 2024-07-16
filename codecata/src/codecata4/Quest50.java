package codecata4;

import java.util.Arrays;

public class Quest50 {
    public static void main(String[] args) {
        String s = "banana";
        Solution50 solution50 = new Solution50();
        System.out.println(Arrays.toString(solution50.solution(s)));
    }
}

class Solution50 {
    public int[] solution(String s) {
        int [] answer = new int[s.length()];
        // 이중 for문을 이용해 answer i번째 글자와 j번째 글자를 비교후
        // 같으면 i-j를 answer에 대입해 준다.
        for(int i=0;i<s.length();i++){
            for(int j=0;j<i;j++){
                if(s.charAt(j)==s.charAt(i)){
                    answer[i]=i-j;
                }
            }
            // 만약 같은 글자 찾지 못하면 -1로 대입
            if(answer[i]==0){
                answer[i]= -1;
            }
        }
        return answer;
    }
}
