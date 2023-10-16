package jiwoo.submit09.q02;

import ch09_class.common.UtilClass;

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

        // 낚싯대의 상태
        boolean isBroken = false;

        // 미끼의 개수
        int count = 10; // 낚시를 할 때마다 미끼가 1개씩 줄고 미끼가 0개면 낚시 불가능

        int random = 0;

        while (true) {

            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());
            int sum = 0;
            int idx = 0;
            if (select == 1) {

                int randNum = UtilClass.makeRandom(1, 100);

                if (randNum <= 5) {

                    // 낚시대가 부러짐
                    System.out.println("낚싯대가 부러졌다....");

                    isBroken = true;

                    continue;

                }

                if (isBroken) {

                    System.out.println("낚싯대가 부러져 낚시를 할 수 없다...");

                    continue;

                }

                if (count == 0) {

                    System.out.println("미끼가 없습니다..");

                    continue;

                }

                // 낚시하기`
                // 다금바리 5%
                // 능성어 10% 확률

                // 돌돔 12% 확률
                // 참돔 13% 확률
                // 우럭 15%
                // 광어 15%
                // 고등어 30%
                random = (int)(Math.random() * 100);

                if (random < 5 ) {

                    idx = 6;

                } else if (random < 15) {

                    idx = 5;

                } else if (random < 27) {

                    idx = 4;

                } else if (random < 40) {

                    idx = 3;

                } else if (random < 55) {

                    idx = 2;

                } else if (random < 70) {

                    idx = 1;

                }

                fishBag.add(fishList.get(idx));

                count--;

                System.out.println(fishList.get(idx).getName() + "을 잡았다!!");

                System.out.println("남은 미끼: " + count);

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

            } else {

                System.out.println("잘못 입력하셨습니다.");

            }

        }

    } // main 종료

}
