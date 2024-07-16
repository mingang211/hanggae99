package Codecata;

public class Quest10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution10 solution = new Solution10();
        System.out.println(solution.solution(numbers));
    }
}
class Solution10 {
    public double solution(int[] numbers) {
        double answer = 0;
        double result = 0;

        for ( int i : numbers ) {
            result = result + i;
        }

        return answer = result / numbers.length;
    }
}