package ch05_control;

import javax.swing.*;
import javax.swing.text.Style;

public class LoopFor {

    public static void main(String[] args) {
        // 반복문
        // for문

        // 콘솔창에 1부터 10까지 출력

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6);
        System.out.println(7);
        System.out.println(8);
        System.out.println(9);
        System.out.println(10);

        int one = 1;
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);
        System.out.println(one++);


        // 반복문 사용
        // ; 를 기준으로
        // for(초기화식 ; 조건식 ; 증감식)
        // 초기화식에는 for문의 반복횟수를 결정해주는 변수 선언
        // 조건식에는 for문이 반복되는 기준을 정한다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // for문 내부 변수 i는 for문 내에서 선언되고, for문 종료시 제거된다.
        // = 변수의 스코프
        // System.out.println(i);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // for문 내부 변수 i는 for문의 반복횟수를 조정이 주목적
        // 꼭 i를 for문 내에서 쓸 필요는 없다.
        // i는 단순 변수명일 뿐이므로 i가 아닌 다른 단어를 사용해도 된다.

        one = 1;
        // 10번 반복하는 for문
        for (int number = 0; number < 10; number += 1) {
            System.out.println(one++);
        }

        // 정말 많이 쓰게될 for문 형식
        // 20번 반복하는 for문
        for (int i = 0; i < 20; i++) {

        }

        System.out.println("\n================================\n");

        // 1부터 20까지 더한 값?
        // 변수의 스코프를 이용한 for문
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1부터 40까지 중에 짝수끼리만 더한 값

        int j = 0;
        for (int i = 1; i <= 40; i++) {
            // 짝수일 때만(조건) sum에 i를 더한다.
            if (i % 2 == 0) {
                j += i;
            }
        }
        System.out.println(j);

        // 자동 줄맞춤 [Ctrl + Alt + l] / 윈도우는 [Win + l]


//        sum = 0;
//        // 실행 결과는 같은데 for문의 실행 횟수는 더 적다.
//        // (프로그램 실행 속도 증가 = 성능 증가)
//        for (int i = 0; i <= 40; i += 2){
//            // i = 0, i = 2, i = 4
//            sum += i;
//        }
//        System.out.println(sum);

        // 0부터 2까지 0.2마다 출력
        for (float i = 0; i <= 2.1; i += 0.2f) {
            System.out.printf("%.1f\n", i);
        }


        // int 사용
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i / (double) 10);
        }

        System.out.println("\n================================\n");

        // 구구단 2단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // ...
        // 2 x 9 = 18
        // for문 사용
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }


//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
        // 위의 코드를 for문을 이용하여 같은 결과가 나오도록 만들기
        String star = "";
        for (int i = 0; i < 5; i++) {
            star += "*";
            System.out.println(star);
        }


        // 국수공장에서 면을 20cm 뽑고 있다.
        for (int i = 0; i < 20; i++) {
            System.out.println("||||||||");

            // i가 4, 9, 14, ... 일 때 절단시키기
//            if(i == 4 || i == 9 || i == 14){
//                System.out.println("--------");
//            }

            // 4, 9, 14, 19, 24, ... 는 전부 5로 나누었을 때 나머지가 4인 숫자
            if (i % 5 == 4) {
                System.out.println("--------");
            }
        }

        System.out.println("\n================================\n");

        // 라면 공장에서 면을 30cm 뽑고 있는데
        // 6cm 마다 잘라주어야 한다.
        // ////////
        // \\\\\\\\
        // ////////
        // \\\\\\\\
        for (int i = 0; i <= 30; i++) {
            if (i % 6 == 5) {
                System.out.println("--------");
            } else if (i % 2 == 0) {
                System.out.println("////////");
            } else {
                System.out.println("\\\\\\\\\\\\\\\\");
            }
        }

        System.out.println("\n================================\n");

        // 10부터 1까지 출력
        // 10
        // 9
        // 8
        // ...
        // 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(10 - i);
        }

        System.out.println("\n================================\n");


        // for문으로 String을 가지고 놀기

        // 숫자형 문자열의 각 자리수를 더한 결과 얻기
        // submit02에서 했던것을 for문을 이용해서 해결 Integer.parseInt
        String example = "1997";
        int result = 0;
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.substring(i, i + 1));
            result += Integer.parseInt(example.substring(i, i + 1));
        }
        System.out.println(result);


        System.out.println("\n================================\n");
        // 슈의 개수는?
        String syusyu = "슈슛슈슈ㅠ슈슈슈슛ㅅ슈슛슈ㅠ슈슈슛";

        // syusyu 에서 "슈" 가 몇 글자 들어가 있는지 세어보기
        // 눈으로 세어본 결과 10개

        // syusyu 에서 한글자씩 잘라서
        // "슈" 와 일치하는지 체크
        // 개수 체크

        System.out.println(syusyu.length());
        int count = 0;
        for (int i = 0; i < 17; i++) {
            System.out.println(syusyu.substring(i, i + 1));
            if (syusyu.substring(i, i + 1).equals("슈")) {
                count += 1;
            }
        }
        System.out.println("슈의 개수 : " + count);

        System.out.println("\n================================\n");

        // break 문
        // 반복문을 종료시키는데 사용
        // 반복횟수를 줄여서 실행속도를 향상시키는데 사용

        // 내 이름을 유니코드로 표현한다면?
        // 유니코드 0 ~ 70000 중에서 찾기
        char word = 1;
        for (int i = 0; i < 70000; i++) {
            if (word == '우') {  // 51059 51647 50863
                System.out.println(i);
                System.out.println(word);
                // break문이 실행되면 가까운 반복문(for, while)
                // 하나를 즉시 종료한다.
                break;
            }
            word++;
        }

        System.out.println("\n================================\n");

        // continue 문

        // 구구단을 출력하는 중에, 너무 쉬운 1, 2, 3은 출력 안한다.
        for (int i = 1; i <= 9; i++) {
            if (i < 4) {
                // 반복문 내에서 continue가 실행되면
                //바로 다음 반복문으로 넘어간다.
                // (continue 아래 코드는 실행되지 않음)
                continue;
            }
            System.out.println("8 x " + i + " = " + (8 * i));
        }

        System.out.println("\n================================\n");

        // 찐 구구단(2단~9단) 출력
        // 2 x 2 = 4
        // 2 x 3 = 6
        // ...
        // 2 x 9 = 18
        // 3 x 2 = 6
        // 3 x 3 = 9
        // ...
        // 9 x 3 = 27
        // 9 x 9 = 81

        // 이중 for문 사용

        for (int left = 2; left <= 9; left++) {
            for (int right = 1; right <= 9; right++) {
                System.out.println(left + " x " + right + " = " + (left * right));
            }
            System.out.println("----------");
        }

        /*
            디버깅 모드

            코드라인 좌측 (라인 숫자 적혀있는 부분)을 마우스 좌클릭하면
            breakpoint가 생성된다.

            생성된 breakpoint는 다시 클릭하면 제거된다.

            breakpoint를 생성한 후 디버깅모드 실행 시
            (상단 벌레모양 버튼 클릭 또는 [Shift + F9])
            코드들이 위쪽부터 실행하고 breakpoint가 있는 라인에
            멈춰서 대기한다.

            이후 하단 Debug 탭의 Step Over [F8] 를 실행하면
            한단계씩 실행된다.

            코드를 한 줄 한 줄 실행해보면서 컴퓨터가 정확히 어디를 실행하고 그때마다 변수에 어떤 값이 담기고 있는지 확인할 때 사용

            디버깅 모드를 종료하려면 중지 버튼 (Terminate) [Ctrl + F2]

         */

        System.out.println("\n================================\n");


        // 트리
        //     *
        //    **
        //   ***
        //  ****
        // *****

        // i = 0 일 때, 공백 4칸 + "*"
        // i = 1 일 때, 공백 3칸 + "**"
        // i = 2 일 때, 공백 2칸 + "***"

        for (int i = 0; i < 5; i++) {
            // i = 0 일 때, 공백 4칸 + "*"
            // i = 1 일 때, 공백 3칸 + "**"
            // i = 2 일 때, 공백 2칸 + "***"
            String blank = "";
            for (int k = 0; k < 4 - i; k++) {
                blank += " ";
            }

            String stars = "";
            for (int k = 0; k < i + 1; k++) {
                stars += "*";
            }

            System.out.println(blank + stars);

        }

        System.out.println("\n================================\n");

        // 트리
        //     *
        //    ***
        //   *****
        //  *******
        // *********

        for (int i = 0; i < 5; i++) {
            String blank = " ";
            for (int k = 0; k < 5 - i; k++) {
                blank += " ";
            }
            String stars = "*";
            for (int k = 0; k < i; k++) {
                stars += "*";
                if (k == 0) {
                    stars += "*";
                } else {
                    stars = stars + "*";
                }
            }
            System.out.println(blank + stars);
        }

        System.out.println("\n================================\n");

        //      *       // 5 / 1
        //     * *      // 4 / * / 공백 1 / *
        //    *   *     // 3 / * / 공백 3 / *
        //   *     *    // 2 / * / 공백 5 / *
        //  *********   // 1 / (i=4)x2 +1
        // 언젠가는 출력해보기




    }
}
