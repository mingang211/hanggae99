public class Quest52 {
    public static void main(String[] args) {
        int a = 2;
        int b = 1;
        int n = 20;
        Solution52 solution52 = new Solution52();
        System.out.println(solution52.solution(a,b,n));

    }
}
class Solution52 {
    public int solution(int a, int b, int n) {
        int answer = 0;
        //while문을 이용하여 빈병(n)이 마트에 가져다주어야 할 병의 수 (a)보다 같거나 클 때까지
        //순회한다.
        while(n >= a){
            // 빈병수(n)/가져다 주어야할 병수
            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
        }
        return answer;
    }
}