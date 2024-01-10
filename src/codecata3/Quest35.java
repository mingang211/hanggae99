package codecata3;

public class Quest35 {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.solution(price,money,count));
    }
}
class Solution35 {
    public long solution(int price, int money, int count) {
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += (price*i);
        }
        if(money >= sum){
            return  0;
        }else{
           return sum - money;
        }
    }
}
