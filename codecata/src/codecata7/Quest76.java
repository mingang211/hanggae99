package codecata7;

public class Quest76 {
    public static void main(String[] args) {
        String s = "3people unFollowed me";
        Solution76  solution76 = new Solution76();
        System.out.println(solution76.solution(s));
    }
}
class Solution76 {
    public String solution(String s) {
        String answer = "";
        int index = 0;
        //전부다 소문자로 바꿔버린다.
        String[] arr = s.toLowerCase().split("");
        for (int i = 0; i < arr.length; i++) {
            // arr[i]이 공백이면 index를 0으로 대입한 다음 더 하고 다음 인덱스로 넘어감
            if(arr[i].equals(" ")){
                index = 0;
                answer += arr[i];
                continue;
            }
            // index가 0이라면 대문자로 변경 후 인덱스에 1을 더해 줌
            if(index == 0){
                answer += arr[i].toUpperCase();
                index++;
            }else{
                answer += arr[i];
            }
        }
        return answer;
    }
}
