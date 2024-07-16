package codecata3;

public class Quest40 {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        System.out.println(solution40.solution(125));
    }
}
class Solution40 {
    public int solution(int n) {
        int answer = 0;
        //3진법으로 표시할 문자열
        String str = "";
        String str1 = "";

        //3진법으로 표시하기 위해 n을 3으로 나눈 나머지 값을 문자열에 추가
        // 예전 자바 강의 때 2진법으료 구하는 방법이 생각나서 해봄
        while (n != 0){
            str += n % 3;
            n /= 3;
        }
        //10진법으로 표현할 수 있는 방법이 없나 구글링하여 pasrseInt를 찾았고
        // parseInt( 숫자로 반환할 문자열, 진법 )이렇게 사용하면 된다고 나와있어서
        // 가져와 사용함
        return answer  = Integer.parseInt(str,3);
    }
}