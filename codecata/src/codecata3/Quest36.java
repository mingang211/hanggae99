package codecata3;

public class Quest36 {
    public static void main(String[] args) {
        String s = "a234";
        Solution36 solution36 = new Solution36();
        System.out.println(solution36.solution(s));
    }
}
class Solution36 {
    public boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        if(s.length() == 4 || s.length() == 6 ){
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= 48 && s.charAt(i) <= 57){
                    cnt++;
                }
            }
        }
        if(cnt == s.length()){
            answer = true;
        }else {
            answer = false;
        }
        return answer;
    }
}

