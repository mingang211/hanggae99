package codecata7;

public class Quest78 {
    public static void main(String[] args) {
        int n = 10;
        Solution78 solution78 = new Solution78();
        System.out.println(solution78.solution(n));
    }
}

class Solution78 {
    public int solution(int n) {
        int answer = 0;
        //n이 0이거나 1일 때 리턴 값은 1로 한다
        if(n == 1 || n == 0){
            return 1;
        }
        int a = 0;
        int b = 1;
        for(int i = 2; i <= n; i++){
            answer = (a+b) % 1234567;
            a = b; // a에 b를 대입
            b = answer; // answer를 b에 대입
        }
        return   answer;
    }
}
