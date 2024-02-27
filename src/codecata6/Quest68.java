package codecata6;

import java.util.ArrayList;

public class Quest68 {
    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        Solution68 solution68 = new Solution68();
        System.out.println(solution68.solution(ingredient));
    }
}
class Solution68 {
    public int solution(int[] ingredient) {
        int answer = 0;
        // 햄버거 재료들을 넣을 list를 선언
        ArrayList<Integer> list = new ArrayList<>();
        //for문을 이용하여 ingredient의 길이 만큼 순회
        for(int i=0;i<ingredient.length;i++){
            // 재료들을 추가
            list.add(ingredient[i]);
            // 햄버거 포장은 1231순서이고 4보다 크거나 같아야하고 이 순서와 같다면
            // answer에 1을 더함.
            if(list.size() >=4 &&
                    list.get(list.size()-4) == 1 &&
                    list.get(list.size()-3) == 2 &&
                    list.get(list.size()-2) == 3 &&
                    list.get(list.size()-1) == 1){
                answer++;
                // 포장한 재료들을 삭제
                for(int j=0;j<4;j++){
                    list.remove(list.size()-1);
                }
            }
        }
        return answer;
    }
}
