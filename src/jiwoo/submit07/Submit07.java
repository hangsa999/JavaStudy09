package jiwoo.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Submit07 {

    public static void main(String[] args) {

        System.out.println("\n================ Q. 01_1 ================\n");

        ArrayList<Integer> intList0 = new ArrayList<>();

        int randint = 0;

        for (int i = 0; i < 10; i++) {

            randint = (int)(Math.random() * 10 + 11);

            intList0.add(randint);

        }

        System.out.println(intList0);

        System.out.println("\n================ Q. 01_2 ================\n");

        // 새 리스트 만들기
        ArrayList<Integer> intList1 = new ArrayList<>();

        for (int i = 0; i < intList0.size(); i++) {

            intList0.set(i, intList0.get(i));

            if (!intList1.contains(intList0.get(i))) {

                intList1.add(intList0.get(i));

            }

        }

        System.out.println(intList1);





        // for문 종료





    } // main 종료

}


