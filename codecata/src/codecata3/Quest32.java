package codecata3;

public class Quest32 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,};
        int[] b = {-3,-1,0,2};
        Solution32 solution32 = new Solution32();
        System.out.println(solution32.solution(a,b));

    }
}
class Solution32 {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer = answer + (a[i]*b[i]);
        }
        return answer;
    }
}
