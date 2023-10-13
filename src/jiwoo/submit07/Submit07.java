package jiwoo.submit07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Submit07 {

    public static void main(String[] args) {

        System.out.println("\n================ Q. 01_1 ================\n");

        ArrayList<Integer> intList0 = new ArrayList<>();

        int randint = 0;
        // 10~ 20 랜덤 숫자 생성
        // Math.random() : 0 ~ 1 사이의 소수(1은 안나옴)
        // Math.random() * 10 : 10 ~ 11 사이의 정수(10은 안나옴)
        // int(Math.random() * 10 + 10) : 10 ~ 19 사이의 정수(10은 안나옴)
        // int(Math.random() * 10 + 11) : 11 ~ 20 사이의 정수(10은 안나옴)

        for (int i = 0; i < 10; i++) {

            randint = (int)(Math.random() * 11 + 10);

            intList0.add(randint);

        } // for 종료

        System.out.println(intList0);

        System.out.println("\n================ Q. 01_2 ================\n");

        // 새 리스트 만들기
        ArrayList<Integer> intList1 = new ArrayList<>();

        for (int i = 0; i < intList0.size(); i++) {

            if (!intList1.contains(intList0.get(i))) {

                intList1.add(intList0.get(i));

            }

        } // for 종료

        // 새 리스트 생성 없이 remove로 중복 제거
        for (int i = 0; i < intList0.size(); i++) {

            // i 가 0일 때, intList.get(0) 과 index 1, 2, 3, 4, 5, 6, 7, 8, 9 와 비교
            // i 가 1일 때, intList.get(1) 과 index 2, 3, 4, 5, 6, 7, 8, 9 와 비교
            // i 가 2일 때, intList.get(2) 와 index 3, 4, 5, 6, 7, 8, 9 와 비교

            // 앞에서부터 순회시 중복을 제거하면 해당 열이 날라가니까 뒤에서부터 순회시킴
            for (int k = intList0.size() - 1; k > i; k--) {

                if (intList0.get(i).equals(intList0.get(k))) {

                    intList0.remove(k);

                }

            }

        }

        System.out.println(intList0);


        System.out.println(intList1);

        System.out.println("\n================ Q. 01_3 ================\n");

        Collections.sort(intList1);

        System.out.println(intList1);

        System.out.println("\n================ Q. 01_4 ================\n");

        intList1.sort(Collections.reverseOrder());

        System.out.println(intList1);

        System.out.println("\n================ Q. 02_1 ================\n");

        ArrayList<String> wifeList = new ArrayList<>(Arrays.asList("냉장고", "로봇청소기", "세탁기", "에어컨", "식기세척기"));

        ArrayList<String> husbandList = new ArrayList<>(Arrays.asList("노트북", "TV", "에어컨", "플레이스테이션", "로봇청소기"));

        ArrayList<String> isList = new ArrayList<>();

        // 나중에 클래스로 만든 객체들을 담게 되면 잘 동작 안한다.
        for (int i = 0; i < wifeList.size(); i++) {

            if (husbandList.contains(wifeList.get(i))) {

                isList.add(wifeList.get(i));

            }

        } // for 종료

        System.out.println(isList);

        System.out.println("\n================ Q. 02_2 ================\n");

        ArrayList<String> uniList = new ArrayList<>(wifeList);

        for (int i = 0; i < husbandList.size(); i++) {

            if (!uniList.contains(husbandList.get(i))) {
            // if (uniList.get(i).equals(husbandList.get(i)) == false)
                uniList.add(husbandList.get(i));
                // uniList.addAll(wifeList); 와 같다.

            }

        } // for 종료

//        for (int i = 0; i < husbandList.size(); i++) {
//            // husbandList.get(i) 의 값이 wantAll 안에 없어야 추가
//            boolean isContain = false;
//            for (int k = 0; k < uniList.size(); k++) {
//
//                if (uniList.get(k).equals(husbandList.get(i)) == true) {
//                    isContain = true;
//                }
//            }
//            // isContain  값이 ~~~
//
//        }




        System.out.println(uniList);





    } // main 종료

}


