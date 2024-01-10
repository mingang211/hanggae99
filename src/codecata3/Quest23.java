package codecata3;

public class Quest23 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        System.out.println(solution23.solution(6));

    }
}
class Solution23 {
    public int solution(int num) {
        int answer = 0;

        long num2 = num;

        if (num2 == 1) {answer = 0;}
        while (num2 != 1) {
            if (num2 % 2 == 0) {
                num2 = num2 / 2;
            } else {
                num2 = num2 * 3 + 1;
            }
            answer++;

            if (answer > 500) {
                answer = -1;
                break;
            }
        }

        return answer;
    }
}