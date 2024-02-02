package codecata4;

public class Quest51 {
    public static void main(String[] args) {
        int[] food = {1,3,4,6};
        Solution51 solution51 = new Solution51();
        System.out.println(solution51.solution(food));
    }
}

class Solution51 {
    public String solution(int[] food) {
        String answer = "";
        //편하게 이 문제를 풀기위해 StringBuilder를 선언한다
        StringBuilder sb = new StringBuilder();
        //포문을 이용하여 food 배열에 길이 만큼 각 인덱스를 가져온다. i가 1부터 시작하는 이유는
        //중간에 들어가는 물이기 때문에 1부터 시작한다.
        for(int i=1; i<food.length; i++) {
            // 각 음식의 갯수를 2로 나눈다.
            int share = food[i] / 2;
            // 포문을 이용하여 음식의 갯수를 2로 나눈 만큼 선언해준 sb객체에 더해준다.
            for(int j=0; j<share; j++) {
                sb.append(i);
            }
        }
        // .reverse()를 이용하여 String을 뒤집은 후 0 다음에 더해준다.
        answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}
