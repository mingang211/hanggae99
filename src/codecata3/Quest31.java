package codecata3;

public class Quest31 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        System.out.println(solution31.solution(3));
    }
}
class Solution31 {
    public String solution(int n) {
        String answer = "";

        for (int i = 0; i < n ; i++) {
            if(i%2!=0){
                answer +="박";
            }else{
                answer +="수";
            }
        }
        return answer;
    }
}

