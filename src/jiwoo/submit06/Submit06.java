package jiwoo.submit06;

import java.util.Arrays;

public class Submit06 {

    public static void main(String[] args) {

        System.out.println("\n================ Q. 01 ================\n");

        String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석", "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진", "조정석", "허성태", "이하늬"};

        int count = 0;

        for (int i = 0; i < nameList.length; i++) { // 21번 반복

            String firstName = nameList[i].substring(0,1);  // 성씨만 출력

            if (firstName.equals("이")) { // 성이 "이" 일 때

                count++;

            }

        } // for문 끝

        System.out.println("이씨 성을 가진 배우가 총 " + count + "명 있습니다.");

        System.out.println("\n================ Q. 02 ================\n");

        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};

        for (int i = 0; i < intArr.length; i++) {

            intArr[i] *= -1;

        }

        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {

            intArr[i] *= -1;

        }

//        int max = 0;
//        for (int i = 0; i < intArr.length; i++) {
//            if (max < intArr[i]) {
//                max = intArr[i];
//            }
//        }
//        System.out.println("최댓값: " + max);

        System.out.println("최댓값: " + intArr[0]);

        Arrays.sort(intArr);

        System.out.println("최솟값: " + intArr[0]);

        System.out.println("\n================ Q. 03 ================\n");

        int[] myLotto = makeLotto();

        for (int i = 0; i < myLotto.length; i++) {

           System.out.print(myLotto[i] + " ");

         }

    } // main 끝

    public static void printArray(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {

            if (i == intArray.length - 1) {

                System.out.println(intArray[i]);

            } else {

                System.out.print(intArray[i] + ", ");

            }
            
        }

    } // intArray 메소드 끝
    public static int[] makeLotto() {
//
//        int[] makeLotto = new int[6];                       // 6자리
//
//        for (int i = 0; i < makeLotto.length; i++) {        // 6번 반복문
//
//            makeLotto[i] = (int)(Math.random() * 45) + 1;   // 1 ~ 45
//
//            for (int j = 0; j < i; j++) {
//
//                if (makeLotto[i] == makeLotto[j]) {         // 중복 배제문
//                    i--;
//
//                }
//
//            }
//
//        }
//
//        return makeLotto;

        int [] numArr = new int[6];

        int idx = 0;

        while (true) {

            //랜덤 숫자 생성
            int rand = (int)(Math.random()*45) + 1;

            // 랜덤 숫자가 현재 배열 내 존재하는지 체크
            boolean isDuple = false;

            for (int i = 0; i < numArr.length; i++) {

                if (numArr[i] == rand) { // 랜덤 숫자가 현재 배열에 존재함

                    isDuple = true;

                }

            }
            // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
            // isDuple이 false일 때 rand를 배열에 담기

            if (!isDuple) {

                numArr[idx] = rand;

                idx++;

            }

            if (idx == 6) {

                break;

            }

        }

        Arrays.sort(numArr);

        return numArr;

    }   // makeLotto 메소드 끝

}

