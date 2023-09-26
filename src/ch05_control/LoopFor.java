package ch05_control;

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
            System.out.println(i / (double)10);
        }

        System.out.println("\n================================\n");

        // 구구단 2단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // ...
        // 2 x 9 = 18
        // for문 사용
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (2*i));
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
        for (int i = 10; i >= 1 ; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 10 ; i++) {
            System.out.println(10 - i);
        }

        System.out.println("\n================================\n");


        // for문으로 String을 가지고 놀기

        // 숫자형 문자열의 각 자리수를 더한 결과 얻기
        // submit02에서 했던것을 for문을 이용해서 해결 Integer.parseInt
        String example = "1997";
        int result = 0;
        for (int i = 0; i < example.length(); i++) {
            System.out.println(example.substring(i,i+1));
            result += Integer.parseInt(example.substring(i,i+1));
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
            System.out.println(syusyu.substring(i,i+1));
            if (syusyu.substring(i, i + 1).equals("슈")) {
                count += 1;
            }
        }
        System.out.println("슈의 개수 : " + count);









    }

}
