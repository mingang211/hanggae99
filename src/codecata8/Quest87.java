package codecata8;

import java.util.ArrayList;
import java.util.List;

public class Quest87 {
    public static void main(String[] args) {
        int n = 3;
        long left = 2;
        long right = 5;

        Solution87 solution87 = new Solution87();

        System.out.println(solution87.solution(n,left,right));
    }
}
class Solution87 {
    public List<Long> solution(int n, long left, long right) {
        List<Long> list = new ArrayList<>();
        for(long i = left; i< right+1; i++){
            list.add(Math.max(i/n,i%n));
        }
        return list;
    }
}
