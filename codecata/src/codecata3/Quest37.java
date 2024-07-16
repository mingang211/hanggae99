package codecata3;

public class Quest37 {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{2,3}};
        int[][] arr2 = {{3,4},{5,6}};
        Solution37 solution37 = new Solution37();
        int[][] answer = solution37.solution(arr1,arr2);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                System.out.println(answer[i][j]);
            }
        }
    }
}
class Solution37 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 문제가 이차원 배열인데 크기 같은 배열이기 때문에 arr1이든 arr2든 상관없이 그 크기로
        // answer배열에 크기를 지정
        int[][] answer = new int[arr1.length][arr1[0].length];
        // for문을 돌려서 각 자리를 더해야 하는데 2차원 배열이라 for문을 한번 더 사용하여
        // 각 자리의 수를 더 해 answer 2차원 배열에 저장 후 리턴
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}

