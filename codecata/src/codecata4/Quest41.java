package codecata4;

public class Quest41 {
    public static void main(String[] args) {
        String s = "try hello world";
        Solution41 solution41 = new Solution41();
        System.out.println(solution41.solution(s));
    }
}
class Solution41 {
    public String solution(String s) {
        String answer = "";
        //문자열 s를 쪼개서 문자열 배열에 넣기
        String[] str = s.split("");
        // 문자열 순번을 알기 우해 int타입에 cnt 선언
        int cnt = 0;
        //문자열 str에서 하나씩 들고와서 대문자 소문자로 만들기
        for(String arr : str){
            // arr이 빈 문자열이면 0 아니면 1더하기
            cnt = arr.contains(" ") ? 0 : cnt+1;
            // str에서 가져올 때 1씩 더해주니깐 cnt를 2로 나눈 나머지가 0이면(짝수번째면) 소문자로
            // 아니면(홀수번째면) 대문자로 표현하여 answr에 더해주기
            answer += (cnt% 2 == 0) ? arr.toLowerCase(): arr.toUpperCase();
        }

        return answer;
    }
}
