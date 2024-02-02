package codecata5;

public class Quest55 {
    public static void main(String[] args) {
        String[] card1 = {"i", "drink", "water"};
        String[] card2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        Solution55 solution55 = new Solution55();
        System.out.println(solution55.solution(card1, card2, goal));
    }
}

class Solution55 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //cards1의 배열 각 값을 가져오기 위해 index1 선언
        int index1 = 0;
        //index1과 같은 이유로 index2 선언
        int index2 = 0;
        //포문을 이용하여 goal에 i번째 인덱스와 각 카드의 인덱스를 비교
        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            //index1이 카드1의 길이보다 작고 goal[i]번째 값과 카드1의 index1번째 값이 같다면 index1의 1을 더하고
            if (index1 < cards1.length && target.equals(cards1[index1])) {
                index1++;
                //index2가 카드2의 길이보다 작고 goal[i]번째 값과 카드2dml index2번째 값이 같다면 index2의 1을 더하고
            } else if (index2 < cards2.length && target.equals(cards2[index2])) {
                index2++;
                // 두 개의 경우가 다 아니라면 No를 리턴해준다
            } else {
                return "No";
            }
        }
        return "Yes";
    }
//    public String solution(String[] cards1, String[] cards2, String[] goal) {
//        int cardIdx1 = 0;
//        int cardIdx2 = 0;
//
//        for (int i = 0; i < goal.length; i++) {
//            String target = goal[i];
//
//            if (cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
//                cardIdx1++;
//            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
//                cardIdx2++;
//            else
//                return "No";
//        }
//        return "Yes";
//    }
}
