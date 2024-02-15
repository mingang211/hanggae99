package codecata6;

public class Quest62 {
    public static void main(String[] args) {
      String[] babbling = {"aya", "yee", "u","maa"};
      Solution62 solution62 = new Solution62();
        System.out.println(solution62.solution(babbling));
    }
}
class Solution62 {
    public int solution(String[] babbling) {
        int answer = 0;
        // for문을 이용하여 babbling의 길이만큼 순회한다.
        for(int i=0; i<babbling.length; i++){
            // 연속으로 발음이 될 경우 넘어간다.
            if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye") || babbling[i].contains("woowoo") || babbling[i].contains("mama")){
                continue;
            }
            // aya, ye, woo, ma가 포함되어 있다면 공백처리
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");
            // 각인덱스 단어의 길이가 answer에 1을 더함.
            if(babbling[i].length()  == 0) answer++;
        }

        return answer;
    }
}
