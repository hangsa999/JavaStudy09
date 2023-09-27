package ch05_control;

import java.util.Scanner;

public class LoopWhile {

    public static void main(String[] args) {


        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while문은 소괄호 내 조건이 true일 때
        // 조건이 false가 될 때까지 중괄호 내부 코드를 반복 실행
        int i = 1;          // 초기화식
        while (i <= 10) {   // 조건식
            System.out.println(i);
            i++;            // 증감식
        }

        System.out.println("\n================================\n");

        int j = 1;
        for ( ; j <= 10 ; ) {
            System.out.println(j);
            j++;
        }

        // while문으로 구구단 2단 출력
        // 2 x 2 = 4
        // 2 x 3 = 6
        // ...
        // 2 x 9 = 18

        int k = 2;
        while (k <= 9) {
            System.out.println("2 x " + k + " = " + (2 * k));
            k++;
        }
        // 둘 다 반복문일 뿐이지만
        // for문은 반복횟수가 정해진, 확실한 경우에 사용하면 좋고
        // while문은 반복횟수가 애매한 경우에 사용하면 좋다.


        System.out.println("\n================================\n");

        Scanner scan = new Scanner(System.in);

        boolean isRun = true;

        // 사용자가 q를 입력하면 종료하게 만들기
//        while (isRun) {
//            System.out.println("채팅 입력: ");
//            String inputText = scan.nextLine();
//
//            if (inputText.equals("q")) {
//                isRun = false;
//            }
//            System.out.println(inputText);
//        }
//
//        while (true) {
//            System.out.println("채팅 입력: ");
//            String inputText = scan.nextLine();
//
//            if (inputText.equals("q")) {
//                // while문 또한 break 실행 시 바로 반복이 종료된다.
//                break;
//            }
//
//            System.out.println(inputText);
//        }


        // do-while문
        // 반복해야할 내용이 최소 한 번은 무조건 실행되게끔 하고 싶을 때 사용
        // (중요하지 않음)
        isRun = false;
        do {
            System.out.println("반복될 내용");
        }while(isRun);

        System.out.println("\n================================\n");

        // while문 또한 다중으로 사용 가능
        // 포켓몬스터
        int hp = 100;
        outer: while (true) {
            System.out.println("야생의 피카츄(이)가 나타났다!");
            System.out.println("무엇을 할까?");
            System.out.println("1. 공격한다 | 2. 도망친다");
            System.out.print(">>> ");

           int command = Integer.parseInt(scan.nextLine());

            if (command == 1) {
                // TODO 공격
                while(true) {
                    System.out.println("공격 방법 선택");
                    System.out.println("1. 몸통박치기 | 2. 하이드로펌프 | 3. 취소");
                    System.out.print(">>> ");

                    int attack = Integer.parseInt(scan.nextLine());

                    if(attack == 1) {
                        System.out.println("몸통박치기 시전");
                        hp -= 20;
                    } else if (attack == 2) {
                        System.out.println("하이드로펌프 시전");
                        hp -= 40;
                    } else if (attack == 3) {
                        System.out.println("돌아간다");
                        // 취소
                        // 가까운 반복문 1개를 즉시 종료
                        // 내부 while문만 종료된다.
                        break;
                    }

                    if (hp <= 0) {
                        System.out.println("피카츄(은)는 쓰려졌다!");
                        // 외부 while문을 종료시키려면??
                        // System.exit(0); // 프로그램 종료
                        // 외부 while문에 네임태그 설정
                         break outer;   //해당 이름을 가진 while문 종료
                    }
                }

            } else if (command == 2) {
                // TODO 도망
                System.out.println("성공적으로 도망쳤다!");
                break;
            } else {
                System.out.println("잘못 입력했습니다");
            }
        }











    }
}
