package jiwoo.submit09.q02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) {
        // Fish 클래스에 객체 담기
        Fish go = new Fish("고등어", 5000);
        Fish gwang = new Fish("광어", 25000);
        Fish woo = new Fish("우럭", 27000);
        Fish cham = new Fish("참돔", 30000);
        Fish dol = new Fish("돌돔", 35000);
        Fish sung = new Fish("능성어", 70000);
        Fish da = new Fish("다금바리", 120000);

        // 물고기 목록
        ArrayList<Fish> fishList = new ArrayList<>();

        fishList.add(go);
        fishList.add(gwang);
        fishList.add(woo);
        fishList.add(cham);
        fishList.add(dol);
        fishList.add(sung);
        fishList.add(da);

        Scanner scan = new Scanner(System.in);

        // 물고기 담을 가방
        ArrayList<Fish> fishBag = new ArrayList<>();

        int random = 0;

        while (true) {

            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());
            int sum = 0;

            if (select == 1) {

                // 낚시하기
                random = (int)(Math.random() * 7);

                fishBag.add(fishList.get(random));

                System.out.println(fishList.get(random).getName() + "을 잡았다!!");

            } else if (select == 2) {

                System.out.println("내 가방 ====================");

                // 잡은 물고기 목록 보기
                for (int i = 0; i < fishBag.size(); i++) {

                    System.out.println(fishBag.get(i));

                    // 잡은 물고기 가치 총액 구하기
                    sum += fishBag.get(i).getPrice();

                }

                System.out.println("총 " + sum + "원");


            } else if (select == 3) {

                // 종료
                System.out.println("낚시를 멈췄습니다.");

                break;

            }

        }

    } // main 종료

}
