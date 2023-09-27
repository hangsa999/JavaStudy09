package jiwoo.submit03;

import java.util.Scanner;

public class Submit03 {

    public static void main(String[] args) {

        System.out.println("\n====================Q. 01_1=================\n");

        int sum = 1;

        for (int i = 1; i <= 10; i++) {
            sum = sum*i;
            if (i == 10) {
                System.out.println(sum);
            }
        }

        System.out.println("\n====================Q. 01_2=================\n");

        long longSum = 1;

        for (int i = 1; i <= 15; i++) {
            longSum = longSum*i;
            if (i == 15) {
                System.out.println(longSum);
            }
        }

        System.out.println("\n====================Q. 02=================\n");

        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

        int count = 0;

        for (int i = 0; i < findWally.length()-1; i++) {
            if (findWally.substring(i, i + 2).equals("월리")) {
                count += 1;
            }
        }

        System.out.println("월리의 개수 : " + count);

        System.out.println("\n====================Q. 03=================\n");

        String stars = "*****";

        for (int i = 0; i < stars.length(); i++) {
            System.out.println(stars.substring(i,5));
            // 정석) System.out.println(stars.substring(i));
        }

        System.out.println("\n====================Q. 04=================\n");

        // 로꾸꺼 로꾸꺼
        // 사용자에게 문자열을 입력받으시고, 입력받은 문자열의 순서를 뒤집어서 출력해보세요.
        // for문 바깥에 문자열 변수 선언
        // for문 내부가 반복될때마다 입력받은 문자열을 한글자씩 잘라 문자열 변수에 더한다.

        // 실행 결과 예시
        // 거꾸로 뒤집을 문자열 입력 : 로꾸꺼 로꾸꺼
        // 뒤집은 결과 : 꺼꾸로 꺼꾸로

        Scanner scan = new Scanner((System.in));

        System.out.print("거꾸로 뒤집을 문자열 입력: ");

        String word = scan.nextLine();

        for (int i = 0; i < word.length(); i++) {
            if (i == 0) {
                System.out.print("뒤집은 결과: ");
            }
            System.out.print(word.substring((word.length() - 1) - i, word.length() - i));
        }

        System.out.println("\n====================Q. 04_1=================\n");

        String inputText = "내일부터 추석이당~";
        // -> ~당이석추 터부일내
        // ~ -> inputText.substring(9, 10)
        // 당 -> inputText.substring(8, 9)
        // 이 -> inputText.substring(7, 8)
        // 내 -> inputText.substring(0, 1)
        System.out.println(inputText.length());

        String reverse = "";
        for (int i = 0; i < inputText.length(); i++) {

            reverse += inputText.substring((inputText.length() - 1) - i, inputText.length() - i);
            System.out.println(i + ": " + reverse);

        }

        for (int i = 0; i < inputText.length(); i++) {
            System.out.println(i + ": " + inputText.substring(i, i + 1));
            reverse = inputText.substring(i, i + 1);
            System.out.println(i + ": " + reverse);
        }


    }
}