package codecata7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Quest72 {
    public static void main(String[] args) {
        String[] players ={"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        Solution72 solution72 = new Solution72();
        System.out.println(Arrays.toString(solution72.solution(players, callings)));
    }
}
class Solution72 {
    public String[] solution(String[] players, String[] callings) {
        // 선수의 수를 가져옴
        int numOfPlayers = players.length;

        // 선수 이름과 그에 해당하는 순위를 저장할 맵 생성
        Map<String, Integer> ranking = new HashMap<>();

        // 초기 순위를 맵에 저장
        for (int i = 0; i < numOfPlayers; i++) {
            ranking.put(players[i], i);
        }

        // 경주 진행
        for (String player : callings) {
            // 현재 호출된 선수의 순위를 가져옴
            int playerRanking = ranking.get(player);

            // 현재 호출된 선수의 바로 앞 순위에 있는 선수를 가져옴
            String frontPlayer = players[playerRanking - 1];

            // 앞선 선수의 순위를 현재 호출된 선수의 순위로 업데이트
            ranking.replace(frontPlayer, playerRanking);

            // 선수 배열에서 위치 교환
            players[playerRanking] = frontPlayer;

            // 호출된 선수의 순위를 한 단계 감소시켜 업데이트
            ranking.replace(player, playerRanking - 1);

            // 앞선 선수의 위치에 호출된 선수를 배치
            players[playerRanking - 1] = player;
        }

        // 최종 경주 결과 반환
        return players;
    }
}
