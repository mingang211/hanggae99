package codecata3;

public class Quest33 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.solution(13,17));
    }
}
class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;
        int count = 0;
        for(int i=left; i <= right; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }
        return answer;
    }
}
