package codecata3;

public class Quest28 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.solution(numbers));
    }
}

class Solution28 {
    public int solution(int[] numbers) {
        int answer = 45;
        for(int i : numbers){
            answer -= i;
        }
        return answer;
    }
}
