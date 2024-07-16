package codecata8;

import java.util.Arrays;

public class Quest81 {
    public static void main(String[] args) {
        int[] arr = {2,6,8,14};
        Solution81 solution81 = new Solution81();
        System.out.println(solution81.solution(arr));
    }
}

class Solution81 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        for (int i = 0; i < arr.length-1; i++) {
            int gcdNum = gcd(arr[i+1], arr[i]);
            arr[i+1]= (arr[i+1] * arr[i])/gcdNum;
        }
        return arr[arr.length-1];
    }
    // 유클리드 호제법을 사용하여 최대공약수를 계산하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}