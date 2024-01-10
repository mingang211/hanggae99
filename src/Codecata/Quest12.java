package Codecata;

public class Quest12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Solution12 solution = new Solution12();
        System.out.println(solution.solution(arr));
    }
}
class Solution12{
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        int i= 0;
        // 향상된 for문을 사용해서 각 인수를 받은 후 배열의 크기 만큼 나눈후 return해준다.
        while ( i < arr.length){
            sum += arr[i];
            i++;
        }
        return answer = sum / arr.length;
    }
}

