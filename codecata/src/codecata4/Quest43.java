package codecata4;

public class Quest43 {
    public static void main(String[] args) {
        String s = "3141592";
        String p = "271";
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.solution(s,p));
    }
}
class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        // String 타입에 t와 p를 Long타입으로 변환시켜 크기를 비교하기 위해
        // Long.parseLong(String)을 이용하여 Long타입으로 변환
        Long num = Long.parseLong(p);
        //p의 길이만큼 짤라서 비교하기 위해 int타입의 length를 선언하고
        // p의 길이를 구하기 위해 .length()를 이용하여 가져옴
        int length = p.length();
        // for문을 사용하여 t의 길이에서 p의 길이를 뺀만큼 반복
        for (int i = 0; i < t.length()-length; i++) {
            //.substring을 이용하여 i부터 i+length를 짤라서 num과 같거나 작으면 answr에 1을 더함
            if(Long.parseLong(t.substring(i,i+length))<=num){
                answer++;
            }
        }
        return answer;
    }
}
