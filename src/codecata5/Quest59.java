package codecata5;

public class Quest59 {
    public static void main(String[] args) {
        int n = 5;
        int m = 4;
        int[] section = {1,3};
        Solution59 solution59 = new Solution59();
        System.out.println(solution59.solution(n,m,section));
    }
}
class Solution59 {
    public int solution(int n, int m, int[] section) {
        int start = section[0];
        int answer = 1;
        // for문을 이용하여 section의 길이만큼 순회한다.
        for(int i = 1; i < section.length; i++) {
            // 만약 롤러를 칠한 만큼의 길이 (start+m-1)가 section[i] 보다 작으면 answer에 1을 더해준다.
            //  start가 있어서 -1을 해준다.
            if(start + m - 1 < section[i]) {
                answer++;
                // 다음 시작점은 section[i]로 설정해준다.
                start = section[i];
            }
        }
        return answer;
    }
}
