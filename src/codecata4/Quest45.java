package codecata4;

public class Quest45 {
    public static void main(String[] args) {
        int n = 4;
        String s = "a B z";
        Solution45 solution45 = new Solution45();
        System.out.println(solution45.solution(s,n));
    }
}
class Solution45 {
    public String solution(String s, int n) {
        String answer = "";
        //  문자열 s에서 글자를 하나씩 char타입으로 들고와서 대문자인지 소문자인지 검사 후
        // a와 n을 더한 값이 'z'보다 크다면 -26을 해주고 answer값에 더 해주면서 대입해주고
        // 아니라면 a+n을 더 해주면서 대입해 주어야 함!!
        for (int i = 0; i < s.length(); i++) {
            //char타입으로 변환하면 아스키코드의 숫자로 비교할 수 있어서 좋음!!
            char a = s.charAt(i);
            // a 가 공백이라면 공백인 " " 을 더 해 주어야 함!!
            if(a == ' ' ){
                answer += " ";
            }
            // a 가 소문자인지 판단하기 위해 isLowerCase() 명령어를 사용하여 판단
            if (Character.isLowerCase(a)) {
                // a+n이 z보다 크면 다른 글자로 봔한하기 때문에 알파벳 갯수인 26을 빼줌
                if (a + n > 'z') {
                    answer += (char) (a - 26 + n);
                } else {
                    answer += (char) (a + n);
                }
                //여기도 대문자를 판단하기 위해 .isUpperCase를 사용
            } else if (Character.isUpperCase(a)) {
                // 이 부분도 소문자와 같은 이유로 26을 빼주어야함
                if (a + n > 'Z') {
                    answer += (char) (a - 26 + n);
                } else {
                    answer += (char) (a + n);
                }
            }
        }return answer;
    }
}