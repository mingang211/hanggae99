package codecata3;

public class Quest24 {
    public static void main(String[] args) {
        String[] seoul = {"Jane","Kim"};
        Solution24 solution24 = new Solution24();
        System.out.println(solution24.solution(seoul));
    }
}
class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for (int i = 0; i < seoul.length; i++, x++) {
            if (seoul[i].equals("Kim")) {
                break;
            }
        }
        answer = "김서방은 "+ x +"에 있다";
        return answer;
    }
}