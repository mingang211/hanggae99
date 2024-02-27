package codecata6;

import java.util.Arrays;

public class Quest70 {
    public static void main(String[] args) {
        String[] wallpaper = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        Solution70 solution70 = new Solution70();
        System.out.println(Arrays.toString(solution70.solution(wallpaper)));
    }
}

class Solution70 {
    public int[] solution(String[] wallpaper) {
        // 행과 열의 최소 및 최대 인덱스를 저장할 배열을 초기화합니다.
        int[] answer = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};

        // wallpaper 배열의 각 행을 반복합니다.
        for (int i = 0; i < wallpaper.length; i++) {
            // 현재 행의 각 문자를 반복합니다.
            for (int j = 0; j < wallpaper[i].length(); j++) {
                // 현재 문자가 '#'인지 확인합니다.
                if (wallpaper[i].charAt(j) == '#') {
                    // 최소 행 인덱스를 업데이트합니다.
                    answer[0] = Math.min(i, answer[0]);
                    // 최소 열 인덱스를 업데이트합니다.
                    answer[1] = Math.min(j, answer[1]);
                    // 최대 행 인덱스 + 1을 업데이트합니다 (행은 0부터 시작하므로).
                    answer[2] = Math.max(i + 1, answer[2]);
                    // 최대 열 인덱스 + 1을 업데이트합니다 (열은 0부터 시작하므로).
                    answer[3] = Math.max(j + 1, answer[3]);
                }
            }
        }

        // 최종적으로 업데이트된 배열을 반환합니다.
        return answer;
    }
}