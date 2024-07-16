package codecata6;

import java.util.HashMap;
import java.util.Map;

public class Quest69 {
    public static void main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        Solution69 solution69 = new Solution69();
        System.out.println(solution69.solution(survey, choices));
    }
}
class Solution69 {
    public String solution(String[] survey, int[] choices) {
        // 최종 결과를 저장할 문자열 변수
        String answer = "";
        // 각 성격 지표에 대한 선택지 배열
        String[][] indicators = {
                {"R", "T"},
                {"C", "F"},
                {"J", "M"},
                {"A", "N"}
        };
        // 선택지에 따른 점수 배열
        int[] score = {3, 2, 1, 0, 1, 2, 3};
        // 각 성격 지표에 대한 누적 점수를 저장할 맵
        Map<String, Integer> map = new HashMap<>();
        // 설문과 선택지에 따른 점수 계산
        for (int i = 0; i < survey.length; i++) {
            String s = survey[i];
            if (choices[i] < 4) {
                // 선택지가 4 미만인 경우, 문자열 s의 첫 번째 문자를 가져와 맵에 누적 점수 추가
                String temp = String.valueOf(s.charAt(0));
                map.put(temp, map.getOrDefault(temp, 0) + score[choices[i] - 1]);
            } else if (choices[i] > 4) {
                // 선택지가 4 초과인 경우, 문자열 s의 두 번째 문자를 가져와 맵에 누적 점수 추가
                String temp = String.valueOf(s.charAt(1));
                map.put(temp, map.getOrDefault(temp, 0) + score[choices[i] - 1]);
            }
        }
        // 각 성격 지표에 대한 테스트 결과 구성
        for (int i = 0; i < 4; i++) {
            // 각 지표의 첫 번째 선택지 점수와 두 번째 선택지 점수를 비교하여 더 높은 쪽을 결과 문자열에 추가
            if (map.getOrDefault(indicators[i][0], 0) >= map.getOrDefault(indicators[i][1], 0)) {
                answer += indicators[i][0];
            } else {
                answer += indicators[i][1];
            }
        }
        // 최종 결과 반환
        return answer;
    }
}