package codecata7;

import java.util.ArrayList;
import java.util.HashMap;

public class Quest71 {
    public static void main(String[] args) {

    }
}
class Solution71 {
    // 주어진 날짜와 기간 정보를 처리하는 클래스

    // 결과를 저장할 동적 배열
    ArrayList<Integer> answer = new ArrayList<>();
    // 기간 정보를 저장할 해시 맵
    HashMap<String, Integer> map = new HashMap<>();

    // 메인 메서드: 주어진 날짜와 기간 정보를 기반으로 개인 정보를 처리하고 결과를 반환
    public int[] solution(String today, String[] terms, String[] privacies) {
        // 주어진 날짜를 총 일 수로 변환
        int date = getDate(today);
        // 기간 정보를 해시 맵에 저장
        for (String s : terms) {
            String[] term = s.split(" ");
            // 기간의 시작 날짜를 키로, 해당 기간 동안의 일 수를 값으로 저장
            map.put(term[0], Integer.parseInt(term[1]));
        }
        // 개인 정보를 처리하면서 현재 날짜 이전인 경우 해당 인덱스를 결과 배열에 추가
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            // 현재 날짜 이전인 경우
            if (getDate(privacy[0]) + (map.get(privacy[1]) * 28) <= date) {
                // 결과 배열에 현재 인덱스 + 1 추가 (1-based 인덱스)
                answer.add(i + 1);
            }
        }
        // 결과 배열을 기본 자료형 배열로 변환하여 반환
        return answer.stream().mapToInt(integer -> integer).toArray();
    }

    // 날짜 문자열을 받아서 총 일 수로 변환하는 메서드
    private int getDate(String today) {
        // 날짜를 연, 월, 일로 분리
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        // 연도는 12개월, 한 달은 28일로 가정하여 총 일 수로 계산
        return (year * 12 * 28) + (month * 28) + day;
    }
}
