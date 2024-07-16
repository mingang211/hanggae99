package codecata6;

public class Quest60 {
    public static void main(String[] args) {
        int number = 5;
        int limit =3;
        int power = 2;
        Solution60 solution60 = new Solution60();
        System.out.println(solution60.solution(number,limit,power));
    }
}
class Solution60 {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        // fot문을 이용하여 number보다 같거나 작을 때 까지 반복
        for(int i=1;i<=number;i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                // i가 완전 제곱수이면 cnt에 1을 더함
                if(j*j==i){
                    cnt++;
                } else if(i%j==0){ // 완전제곱수가 아니라면 i를 j로 나눈 값이 0이면 cnt에 2를 더해줌.
                    cnt+=2;
                }
            }
            //cnt가 limit보다 크다면 cnt에 power를 대입
            if(cnt>limit) {
                cnt = power;
            }
            answer += cnt;
        }
        return answer;
    }
}