package jiwoo.submit05;

import java.util.SortedMap;

public class Submit05 {

    public static void main(String[] args) {

        System.out.println("\n============Q.01============\n");

        makeTree(5);
        makeTree(6);

        System.out.println("\n============Q.02============\n");

        String example = "로꾸꺼 로꾸꺼";
        String result = reverseStr(example);
        System.out.println(result);

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

    public static String reverseStr(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            result += (str.substring((str.length() - 1) - i, str.length() - i));

        }

        System.out.println();

        return result;

    }

    public static String makeBinary(int tenNum) {

//        String binary = Integer.toBinaryString(tenNum);
//        return binary;

        String result = "";

        while (true) {

            result += tenNum % 2;

            if (tenNum == 1) {

                break;

            } else {

                tenNum /= 2;

            }

        }

        result = reverseStr(result);

        return result;

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