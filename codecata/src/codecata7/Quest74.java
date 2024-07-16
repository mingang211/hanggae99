package codecata7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Quest74 {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        Solution74 solution74 = new Solution74();
        System.out.println(Arrays.toString(solution74.solution(id_list, report, k)));
    }
}
class Solution74 {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 답을 저장할 배열 초기화
        int[] answer = new int[id_list.length];

        // User 객체를 저장할 리스트 생성
        ArrayList<User> users = new ArrayList<>();

        // 각 유저의 정지 횟수를 저장할 HashMap 생성
        HashMap<String, Integer> suspendedList = new HashMap<>();

        // 각 유저의 인덱스를 저장할 HashMap 생성
        HashMap<String, Integer> idIdx = new HashMap<String, Integer>();

        // 인덱스 변수 초기화
        int idx = 0;

        // idIdx HashMap을 채우고 각 유저에 대한 User 객체를 생성
        for (String name : id_list) {
            idIdx.put(name, idx++);
            users.add(new User(name));
        }

        // 신고 내역을 처리하고 User 객체를 업데이트
        for (String re : report) {
            String[] str = re.split(" ");
            users.get(idIdx.get(str[0])).reportList.add(str[1]);
            users.get(idIdx.get(str[1])).reportedList.add(str[0]);
        }

        // k번 이상 신고된 유저를 식별
        for (User user : users) {
            if (user.reportedList.size() >= k)
                suspendedList.put(user.name, 1);
        }

        // suspendedList를 기반으로 답 배열 업데이트
        for (User user : users) {
            for (String nameReport : user.reportList) {
                if (suspendedList.get(nameReport) != null) {
                    answer[idIdx.get(user.name)]++;
                }
            }
        }

        // 최종 답 배열 반환
        return answer;
    }
}

// 필요한 속성을 가진 User 클래스 정의
class User {
    String name;                        // 유저명
    HashSet<String> reportList;        // 해당 유저가 신고한 유저 리스트
    HashSet<String> reportedList;      // 해당 유저를 신고한 유저 리스트

    // User 객체를 초기화하는 생성자
    public User(String name) {
        this.name = name;
        reportList = new HashSet<>();
        reportedList = new HashSet<>();
    }
}
