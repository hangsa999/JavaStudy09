package jiwoo.submit09.q02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) {
        // Fish 클래스에 객체 담기
        Fish go = new Fish("고등어", 5000);






        // 물고기 목록
        ArrayList<Fish> fishList = new ArrayList<>();

        fishList.add(new Fish("고등어", 5000));
        fishList.add(new Fish("광어", 25000));
        fishList.add(new Fish("우럭", 27000));
        fishList.add(new Fish("참돔", 30000));
        fishList.add(new Fish("돌돔", 35000));
        fishList.add(new Fish("능성어", 70000));
        fishList.add(new Fish("다금바리", 120000));

        Scanner scan = new Scanner(System.in);

        // 물고기 담을 가방
        ArrayList<Fish> fishBag = new ArrayList<>();

        while (true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());

        }

    } // main 종료

}
