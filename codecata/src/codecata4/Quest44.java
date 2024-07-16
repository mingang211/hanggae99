package codecata4;

import java.util.Arrays;

public class Quest44 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        Solution44 solution44 = new Solution44();
        System.out.println(solution44.solution(sizes));
    }
}
class Solution44 {
    //가로와 세로를 비교해서 큰 수와 작은 수를 분류해야한다!!
    // 그런 다음에 큰 수에서 가장 큰 수와 작은 수에서 가장 큰 수를 찾아서 곱해줘야한다!
    public int solution(int[][] sizes) {
        //일단 큰 수를 담을 maxVal 배열과 작은 수를 담을 minVal를 선언해준다
        //가로와 세로가 똑같이 존재하니 배열의 길이는 size.length로 선언해준다.
        int[] maxVal = new int[sizes.length];
        int[] minVal = new int[sizes.length];
        //포문을 이용하여 sizes배열의 길이만큼 반복하여 배열안에 있는 배열들을 가져와서 큰수와 작은 수를  분류한다.
        for (int i = 0; i < sizes.length; i++) {
            // 큰 수를 저장하기 위해 Arrays.stream을 이용하여 sizes배열에 i번째에 있는 배열을 가져와 그 중에 큰 값을
            //max()를 이용하여 찾고 getAsInt를 이용하여 int형태의 수로 받아온다.
            maxVal[i] = Arrays.stream(sizes[i]).max().getAsInt();
            // 작은 수도 똑깥이 하되 min()을 이용하여 작은 수를 찾고 int형태의 수를 가져온다!
            minVal[i]= Arrays.stream(sizes[i]).min().getAsInt();
        }
        int maxValmax = Arrays.stream(maxVal).max().getAsInt();
        int minValmin = Arrays.stream(minVal).max().getAsInt();
        return maxValmax * minValmin;
    }
}