package codecata5;

import java.util.ArrayList;
import java.util.List;

public class Quest57 {
    public static void main(String[] args) {
        int[] answer = {1,2,3,4,5};
        Solution57 solution57 = new Solution57();
        System.out.println(solution57.solution(answer));
    }
}
class Solution57 {
    public List<Integer> solution(int[] answers) {
        //1번 수포자가 찍는 방식
        int[] one = {1, 2, 3, 4, 5};
        //2번 수포자가 찍는 방식
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        //3번 수포자가 찍는 방식
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        // 맞춘 개수를 담을 배열 선언 수포자가 3명이기에 크기를 3으로 설정
        int[] score = new int[3];
        // for문을 이용하여 정답과 수포자들이 찍는 방식을 비교하여 맞으면 1씩 더해주기
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) score[0]++;
            if (answers[i] == two[i % 8]) score[1]++;
            if (answers[i] == three[i % 10]) score[2]++;
        }
        // Math,max를 이용하여 가장 많이 맞춘 개수를 구함
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        //가장 많이 맞춘 사람을 넣을 배열 선언
        List<Integer> list = new ArrayList<>();
        // 포문을 이용하여 maxScore와 정답맞춘 갯수를 비교하여 같으면
        //list에 해당 수포자 추가
        for (int i = 0; i < 3; i++) {
            if (maxScore == score[i]) list.add(i + 1);
        }
        return list;
    }
}
