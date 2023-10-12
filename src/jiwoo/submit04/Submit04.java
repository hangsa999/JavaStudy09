package jiwoo.submit04;

import java.util.Scanner;

public class Submit04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = 10;
        int B = 4;

        outer: while (true) {
            System.out.println("\n========== 희영빌딩 엘리베이터 ==========\n");
            System.out.println("승강기 A의 현재 위치: " + A + "층");
            System.out.println("승강기 B의 현재 위치: " + B + "층");
            System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");

            String user = scan.nextLine();

            if (user.equals("q")) {
                System.out.println("프로그램이 종료되었습니다.");
                break outer;
            } else if (user.equals("exit")) {
                System.out.println("프로그램이 종료되었습니다.");
                break outer;
            } else {
                int userNum = Integer.parseInt(user);
                if (userNum > 10 || userNum < 1) {
                    System.out.println("잘못 입력하셨습니다.");
                } else {
                    int aGab = Math.abs(userNum - A);
                    int bGab = Math.abs(userNum - B);

                    System.out.println(user + "층에서 엘리베이터를 호출합니다.");

                    if (aGab < bGab) {
                        A = userNum;
                    } else if (aGab == bGab && A > B) {
                        A = userNum;
                    } else if (aGab > bGab) {
                        B = userNum;
                    } else if (A < B) {
                        B = userNum;
                    }
                }
            }

        } // while문 종료

    }

}
