package codecata5;

public class Quest54 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        Solution54 solution54 = new Solution54();
        System.out.println(solution54.solution(a, b));
    }
}

class Solution54 {
        public String solution(int a, int b) {
        String answer = "";
        // 날짜의 요일을 담은 배열을 선언하고 2016년 1월 1일은 금요일부터 시작이기 때문에
        // 금요일을 제일 먼저 담는다.
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        // 각 월의 일수를 담은 배열을 선언해 준다.
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 30};
        // 총 일 수를 담을 변수 선언해 준다.
        int daySum = 0;
        // for문을 이용하여 a월 이전의 총 일 수 더해준다.
        for (int i = 0; i < a - 1; i++) {
            daySum += month[i];
        }
        // 남은 일수 더하기
        daySum += b -1;

        // 7로 나눈 나머지의 인덱스를 가진 요일 반환
        return answer = day[daySum % 7];
    }
//    public String solution(int a, int b) {
//        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
//    }
}