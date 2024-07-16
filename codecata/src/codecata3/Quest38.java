package codecata3;

import java.util.Scanner;
public class Quest38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        //for문을 사용하여 "*"을 a번 찍고  그걸 b번 반복하기 위해 이중 for문을 사용하여 작성
        //가로로 반복할 때 prinrln을 사용하면 줄이 넘어가 print를 사용
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
