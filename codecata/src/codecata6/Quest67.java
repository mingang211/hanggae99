package codecata6;

public class Quest67 {
    public static void main(String[] args) {
        String s = "aukks";
        String skip = "wbqd";
        int index = 5;
        Solution67 solution67 = new Solution67();
        System.out.println(s);
    }
}
class Solution67 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        //for문을 이용하여 s의 길이만큼 순회
        for (int i = 0; i < s.length(); i++) {
            // 입력 문자열 s의 i번째 문자를 가져옴
            char c = s.charAt(i);
            //for문을 이용하여 index만큼 이동
            for (int j = 0; j < index; j++) {
                c += 1;
                // 만약 이동 후의 문자가 'z'를 넘어가면 알파벳 순환을 위해 26을 빼줌
                if (c > 'z') {
                    c -= 26;
                }
                // 만약 이동 후의 문자가 skip에 포함되어 있다면 다시 이동을 수행
                if (skip.contains(String.valueOf(c))) {
                    j--;
                }
            }
            // 현재 처리된 문자를 결과 문자열에 추가
            answer += c;
        }

        return answer; // 최종 결과 반환
    }
}
