package codecata5;

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
        //while문을 이용하여 가지고 있는 빈병(n)이 필요한 병의수 (a)보다 같거나 클 때까지
        //순회한다.
        while(n >= a){
            // 현재 빈병수(n) / 필요한병의수(a) * 다시 받는 병의수 (b)를 answer에 더 해주고 대입해준다.
            answer += (n/a) * b;
            //현재 빈병의 수(n)는 n/a * b를 해준 다음 현재 빈병수를 필요한 병의 수로 나눈 나머지 값을 더해준다.
            n = (n/a) * b + (n%a);
        }
        return answer;
    }
}