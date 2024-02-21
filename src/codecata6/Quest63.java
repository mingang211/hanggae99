package codecata6;

public class Quest63 {
    public static void main(String[] args) {
        String X = "100";
        String Y = "2345";
        Solution63 solution63 = new Solution63();
        System.out.println(solution63.solution(X,Y));
    }
}

class Solution63 {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        // 인덱스에 해당하는 숫자의 개수를 담을 배열 선언
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        // X와 Y에 등장하는 숫자의 개수를 arrX, arrY 배열에 저장
        countNumInArr(X, arrX);
        countNumInArr(Y, arrY);
        // 역순으로 순회하여 공통으로 존재하는 숫자를 answer에 추가
        for (int i = arrX.length - 1; i >= 0; i--) {
            while (arrX[i] >= 1 && arrY[i] >= 1) {
                arrX[i]--;
                arrY[i]--;
                answer.append(i);
            }
        }
        // 짝궁이 없으면 -1을 리턴
        if (answer.toString().equals("")) {
            return "-1";
        // 짝궁이 0으로만 이루어져있으면 0을 리턴
        } else if (answer.toString().startsWith("0")) {
            return "0";
        // 그 외 다른 경우
        } else {
            return answer.toString();
        }
    }
    // 문자열에 있는 숫자 개수를 배열에 저장하는 메서드
    private void countNumInArr(String str, int[] arr) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - '0';
            arr[idx]++;
        }
    }
}