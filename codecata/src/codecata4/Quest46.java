package codecata4;

public class Quest46 {
    public static void main(String[] args) {
        Solution46 solution46 = new Solution46();
        String s ="23four5six7";
        System.out.println(solution46.solution(s));
    }
}

class Solution46 {
    public int solution(String s) {
        int answer = 0;
        //0부터 9까지 문자열 s와 비교할 수 있는 문자열 num선언
        String[] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        //포문을 사용해서 i가 10보다 작을 때가지 .replace를 사용하여 영어단어를 숫자로 바꿔준다!!
        for (int i = 0; i < 10; i++) {
            //.replcae를 사용하여 현재 문자열 s에서 제일 처음 만나는 num[i]를 숫자로 바꿔준다.
            s = s.replace(num[i],Integer.toString(i));
        }
        //answer 가 int 라서 Integer.parseInt(문자열)을 이용해서 정수로 바꿔줌
        return Integer.parseInt(s);
    }
}
