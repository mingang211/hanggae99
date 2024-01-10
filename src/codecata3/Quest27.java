package codecata3;

public class Quest27 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        Solution27 solution27 = new Solution27();
        System.out.println(solution27.solution(phone_number));

    }
}
class Solution27 {
    public String solution(String phone_number) {
        String answer = "";
        String subString = "";
        String star = "*";
        subString = phone_number.substring(phone_number.length()-4, phone_number.length());
        for (int i = 0; i<phone_number.length()-4; i++){
            answer += star;
        }
        answer = answer + subString;
        return answer;
    }
}
