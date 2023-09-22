package jiwoo.submit02;

import java.util.Scanner;

public class Submit02 {

    public static void main(String[] args) {

        System.out.println("\n====================Q. 01=================\n");

        Scanner scan = new Scanner(System.in);

        System.out.println("이름을 입력해주세요.");
        System.out.print(">>> ");
        String name = scan.nextLine();

        System.out.println("국어 점수를 입력해주세요.");
        System.out.print(">>> ");
        double kr = Integer.parseInt(scan.nextLine());

        System.out.println("영어 점수를 입력해주세요.");
        System.out.print(">>> ");
        double en = Integer.parseInt(scan.nextLine());

        System.out.println("수학 점수를 입력해주세요.");
        System.out.print(">>> ");
        double math = Integer.parseInt(scan.nextLine());

        double avg = ((kr + en + math) / 3);

        System.out.println("이름: " + name);
        System.out.printf("국어: " + "%.0f \n", kr);
        System.out.printf("영어: " + "%.0f \n", en);
        System.out.printf("수학: " + "%.0f \n", math);
        System.out.printf("평균: " + "%.2f \n", avg);

        System.out.println("\n====================Q. 02=================\n");

        int example = 278;
        String ex = "0" + example;

        System.out.println(ex.substring(1,2));
        System.out.println(ex.substring(2,3));
        System.out.println(ex.substring(3,4));

        int ex1= Integer.parseInt(ex.substring(1,2));
        int ex2= Integer.parseInt(ex.substring(2,3));
        int ex3= Integer.parseInt(ex.substring(3,4));

        System.out.println(ex1 + ex2 + ex3);
    }
}