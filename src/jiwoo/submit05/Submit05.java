package jiwoo.submit05;

import java.util.SortedMap;

public class Submit05 {

    public static void main(String[] args) {

        System.out.println("\n============Q.01============\n");

        makeTree(5);
        makeTree(6);

        System.out.println("\n============Q.02============\n");

        String example = "로꾸꺼 로꾸꺼";
        reverseStr(example);

        System.out.println("\n============Q.03============\n");

        String myBinaryStr = makeBinary(23);
        System.out.println(myBinaryStr);

        System.out.println("\n============Q.04============\n");

        makeTriangle(5);
        makeTriangle(6);

    }

    public static void makeTree(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {

                System.out.print(" ");

            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    public static void reverseStr(String str) {

        for (int i = 0; i < str.length(); i++) {

            System.out.print((str.substring((str.length() - 1) - i, str.length() - i)));

        }

        System.out.println();

    }

    public static String makeBinary(int tenNum) {

        String binary = Integer.toBinaryString(tenNum);

        return binary;

    }

    public static void makeTriangle(int triNum) {

        for (int i = 1; i <= triNum; i++) {

            for (int j = triNum; j >= i; j--) {

                System.out.print(" ");

            }

            for (int j = 1; j <= 2 * i - 1; j++) {

                if (j == 1 || j == 2 * i - 1 || i == triNum) {

                    System.out.print("*");

                } else {

                    System.out.print(" ");

                }

            }

            System.out.println();

        }

    }

}