package codecata7;

public class Quest75 {
    public static void main(String[] args) {
        String s = "1 2 3 4";
        Solution75 solution75 = new Solution75();
        System.out.println(solution75.solution(s));
    }
}
class Solution75 {
    public String solution(String s) {
        String answer = "";
        //문자열 s를 ""를 기준으로 나눈 후 tmp에 저장;
        String[] tmp = s.split(" ");
        //첫번째 자릿 수 부터 비교함으로 첫째자리 수로 통일;
        int min = Integer.parseInt(tmp[0]);
        int max = Integer.parseInt(tmp[0]);
        int n = Integer.parseInt(tmp[0]);
        for(int i = 0; i < tmp.length; i++){
            n = Integer.parseInt(tmp[i]);
            if(min>n){//최소값 구하기
                min = n;
            }else if(max<n){//최대값 구하기
                max = n;
            }
        }
        return answer = min + " " + max;
    }
}