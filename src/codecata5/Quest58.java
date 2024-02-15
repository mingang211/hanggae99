package codecata5;

public class Quest58 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};
        Solution58 solution58 = new Solution58();
        System.out.println(solution58.solution(nums));
    }
}
class Solution58 {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        //for문을 이용하여 num에서 3개를 가져와 더해준다.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sum = nums[i]+nums[j]+nums[k];
                    // sum을 2로 나눈나머지값이 0이면 div에 1을 더해준다.
                    int div = 0;
                    for (int l = 2; l < sum; l++) {
                        if(sum%l == 0){
                            div++;
                        }
                    }
                    // sum을 나눈 나머지 값이 0이 없으면 소수이므로 answer에 1을 더해준다.
                    if(div == 0){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}
