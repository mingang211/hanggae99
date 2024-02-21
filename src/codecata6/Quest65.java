package codecata6;

public class Quest65 {
    public static void main(String[] args) {
        String s = "aaabbaccccabba";
        Solution65 solution65 = new Solution65();
        System.out.println(solution65.solution(s));
    }
}
class Solution65 {
    public int solution(String s) {
        // 첫번째 문자를 저장
        char first = s.charAt(0);
        // 현재까지 탐색한 문자 중 first와 같은 문자의 개수를 저장하는 sameNum 선언
        int sameNum = 0;
        // 현재까지 탐색한 문자 중에서 first와 다른 문자의 개수를 저장하는 diffNum 선언
        int diffNum = 0;
        int answer = 0;
        // for문을 이용하여 s의 길이만큼 순회
        for (int i = 0; i < s.length(); i++) {
            // 만약 첫번째글자와 다른 숫자가 같다면 answer에 1을 더함
            if (sameNum == diffNum) {
                answer++;
                first = s.charAt(i);
            }
            // s의 i번째 단어와 first 단어가 같으면 firstNum에 1을 더함
            if (s.charAt(i) == first){
                sameNum++;
                // 아니면 diff에 1을 더함
            } else {
                diffNum++;
            }
        }
        return answer;
    }
}
