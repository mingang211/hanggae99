package codecata7;

import java.util.Arrays;

public class Quest73 {
    public static void main(String[] args) {
        String[] park = {"SOO","OOO","OOO"};
        String[] routes = {"E 2","S 2","W 1"};
        Solution73 solution73 = new Solution73();
        System.out.println(Arrays.toString(solution73.solution(park, routes)));
    }
}
class Solution73 {
    public int[] solution(String[] park, String[] routes) {
        // 초기 x, y 좌표를 저장할 변수
        int sx = 0;
        int sy = 0;

        // 공원을 2차원 char 배열로 변환
        char[][] arr = new char[park.length][park[0].length()];

        // 공원을 순회하면서 시작 위치 (S)를 찾고 공원을 char 배열로 변환
        for(int i = 0; i < park.length; i++){
            arr[i] = park[i].toCharArray();

            if(park[i].contains("S")){
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        // 주어진 이동 경로를 순회하며 이동
        for(String st : routes){
            // 이동 방향과 거리를 파싱
            String way = st.split(" ")[0];
            int len = Integer.parseInt(st.split(" ")[1]);

            // 현재 위치 저장을 위한 변수
            int nx = sx;
            int ny = sy;

            // 주어진 거리만큼 이동
            for(int i = 0; i < len; i++){
                // 이동 방향에 따라 새로운 위치 계산
                if(way.equals("E")){
                    nx++;
                }
                if(way.equals("W")){
                    nx--;
                }
                if(way.equals("S")){
                    ny++;
                }
                if(way.equals("N")){
                    ny--;
                }

                // 새로운 위치가 공원의 범위 내에 있고, 장애물이 없을 때
                if(nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length){
                    if(arr[ny][nx] == 'X'){
                        // 장애물이 있으면 이동 중단
                        break;
                    }
                    // 범위 내에 있고 장애물이 없으면 최종 위치 갱신
                    if(i == len - 1){
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }

        // 최종 위치를 배열에 담아 반환
        int[] answer = {sy, sx};
        return answer;
    }
}