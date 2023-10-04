package jiwoo.submit04;

import java.util.Scanner;

public class Submit04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int A = 10;
        int B = 4;
        System.out.println("\n========== 희영빌딩 엘리베이터 ==========\n");
        System.out.println("승강기 A의 현재 위치: " + A + "층");
        System.out.println("승강기 B의 현재 위치: " + B + "층");
        System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");

        outer: while (true) {

            String user = scan.nextLine();

            if (user.equals("q")) {
                System.out.println("프로그램이 종료되었습니다.");
                break outer;
            } else if (user.equals("exit")) {
                System.out.println("프로그램이 종료되었습니다.");
                break outer;
            } else {
                int userNum = Integer.parseInt(user);
                int aGab = Math.abs(userNum - A);
                int bGab = Math.abs(userNum - B);
                System.out.println(user + "층에서 엘리베이터를 호출합니다.");

                if (aGab < bGab) {
                    A = userNum;
                    moveA(userNum);
                    System.out.println("승강기 A의 현재 위치: " + A + "층");
                    System.out.println("승강기 B의 현재 위치: " + B + "층");
                    System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
                } else if (aGab == bGab && A > B) {
                    A = userNum;
                    moveA(userNum);
                    System.out.println("승강기 A의 현재 위치: " + A + "층");
                    System.out.println("승강기 B의 현재 위치: " + B + "층");
                    System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
                }
                if (aGab > bGab) {
                    B = userNum;
                    moveB(userNum);
                    System.out.println("승강기 A의 현재 위치: " + A + "층");
                    System.out.println("승강기 B의 현재 위치: " + B + "층");
                    System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
                } else if (A < B) {
                    B = userNum;
                    moveB(userNum);
                    System.out.println("승강기 A의 현재 위치: " + A + "층");
                    System.out.println("승강기 B의 현재 위치: " + B + "층");
                    System.out.print("몇층에 계시나요?[종료하시려면 q 또는 exit 입력]: ");
                }

            }

        } // while문 종료


    }
    public static void moveA(int userNum) {
        System.out.println("승강기 " + "A" + "가 " + userNum + "층으로 이동하였습니다.");
        System.out.println("\n========== 희영빌딩 엘리베이터 ==========\n");
    }
    public static void moveB(int userNum) {
        System.out.println("승강기 " + "B" + "가 " + userNum + "층으로 이동하였습니다.");
        System.out.println("\n========== 희영빌딩 엘리베이터 ==========\n");
    }

}
