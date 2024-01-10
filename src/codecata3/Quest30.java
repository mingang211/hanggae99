package codecata3;

public class Quest30 {
    public static void main(String[] args) {
        String s = "abced";
        Solution30 solution30 = new Solution30();
        System.out.println(solution30.solution(s));
    }
}


class Solution30 {
    public String solution(String s) {
        String answer = "";
        if (s.length()%2 == 0){
            answer = ""+ s.charAt(s.length()/2) + s.charAt(s.length()/2+1);
        } else {
            answer = s.charAt(s.length()/2)+"";
        }

        return answer;
    }
}
