package jiwoo.submit11;

import ch09_class.common.UtilClass;
import jiwoo.submit09.q02.Fish;

import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) {

        // 생선 길이는 나중에 랜덤값으로 넣어보기
        // 민물고기 객체
        Fish fOne = new Fish("붕어", 1200);
        Fish fTwo = new Fish("잉어", 2400);
        Fish fThree = new Fish("가물치", 3200);
        // 바다물고기 객체
        Fish sOne = new Fish("바다원", 1200);
        Fish sTwo = new Fish("바다투", 2300);
        Fish sThree = new Fish("바다쓰리", 3100);

        // 빈 리스트 만들기
        ArrayList<Fish> fishList = new ArrayList<>();

        // 리스트에 민물고기 객체 추가
        fishList.add(fOne);
        fishList.add(fTwo);
        fishList.add(fThree);

        // 리스트에 민물고기 객체 추가
        fishList.add(sOne);
        fishList.add(sTwo);
        fishList.add(sThree);

        // 물고기 가방 (비어있는 새 목록 만들어서 도감이랑 통일, 상점 판매시 금액만큼 지갑에 추가하고 리스트에서 삭제)

        ArrayList<Fish> fishBag = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // 떡밥
        int bait = 10;
        // 구매하고싶은 떡밥 개수
        int baitBuyNum = 0;
        // 떡밥 가격
        int baitPrice = 1000;


        // 낚싯대 강화
        int rod = 0;
        // 찌 강화
        int fishFloat = 0;
        // 소지 금액
        long myMoney = 0;

        while (true) {

            System.out.println("무엇을 할까?");
            System.out.println("[1] 지역 선택 | [2] 장비 강화 | [3] 상점 | [4] 가방 | [5] 나가기");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());
            int sum = 0;
            int idx = 0;
            int bagMoney = 0;

            if (select == 1) {
                System.out.println("[1] 민물 낚시터 | [2] 바다 낚시터");
                System.out.print(">>> ");
                select = Integer.parseInt(scan.nextLine());

                // 1번 : 민물 낚시터 낚시
                if (select == 1)  {
                    System.out.println("민물 낚시터에 입장하셨습니다.");
                    while (true) {
                        System.out.println("[1] 낚시하기 | [2] 가방 확인 | [3] 나가기");
                        System.out.print(">>> ");


                        select = Integer.parseInt(scan.nextLine());
                        if (select == 1) {
                            if (bait > 0) {
                                int randNum = UtilClass.makeRandom(1, 100);
                                if (randNum < 50 - fishFloat) {
                                    idx = 0;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 70- fishFloat) {
                                    idx = 1;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 90) {
                                    idx = 2;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 100) {     // 민물 낚시 실패
                                    System.out.println("물고기가 도망갔습니다...");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                }
                            } else if (bait == 0) {    // 떡밥 없을 때 민물 가방 확인
                                System.out.println("미끼가 없습니다..");
                                System.out.println("[1] 가방 확인 | [2] 나가기");
                                select = Integer.parseInt(scan.nextLine());
                                if (select == 1) {
                                    System.out.println("내 가방");
                                    // 잡은 물고기 목록 보기
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                    }
                                    System.out.println("가방 합계: " + bagMoney + "원");
                                    System.out.println("아무 키나 입력해주세요.");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
//                                    break;
                                    }
                                } else if (select == 2) {
//                                    break;
                                }
                            }
                        } else if (select == 2) {   // 민물 가방 확인
                            System.out.println("내 가방");
                            // 잡은 물고기 목록 보기
                            for (int i = 0; i < fishBag.size(); i++) {
                                 System.out.println(fishBag.get(i));
                             }
                             System.out.println("가방 합계: " + bagMoney + "원");
                        } else if (select == 3) {
                            break;
                        }
                    }
                } // 민물 낚시터 종료

                // 2 : 바다 낚시터 입장
                else if (select == 2) {
                    System.out.println("바다 낚시터에 입장하셨습니다.");
                    while (true) {
                        System.out.println("[1] 낚시하기 | [2] 가방 확인 | [3] 나가기");
                        System.out.print(">>> ");
                        select = Integer.parseInt(scan.nextLine());
                        if (select == 1) {
                            if (bait > 0) {
                                int randNum = UtilClass.makeRandom(1, 100);
                                if (randNum < 50 - fishFloat) {
                                    idx = 3;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 80) {
                                    idx = 4;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 90) {
                                    idx = 5;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 100) {
                                    System.out.println("물고기가 도망갔습니다...");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                }
                            } else if (bait == 0) { // 바다낚시 미끼 없을 때
                                System.out.println("미끼가 없습니다..");
                                System.out.println("[1] 가방 확인 | [2] 나가기");
                                System.out.print(">>> ");
                                select = Integer.parseInt(scan.nextLine());
                                if (select == 1) {
                                    System.out.println("내 가방");
                                    // 잡은 물고기 목록 보기
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                        // 잡은 물고기 가치 총액 구하기
                                    }
                                    System.out.println("가방 합계: " + bagMoney + "원");
                                    System.out.println("아무 키나 입력해주세요.");
                                    System.out.print(">>> ");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
//                                        break;
                                    }
                                } else if (select == 2) {
//                                    break;
                                }

                            }
                        } else if (select == 2) { // 바다 가방 확인
                            System.out.println("내 가방");
                            // 잡은 물고기 목록 보기
                            for (int i = 0; i < fishBag.size(); i++) {
                                System.out.println(fishBag.get(i));
                            }
                            System.out.println("가방 합계: " + bagMoney + "원");
                        } else if (select == 3) {
                            break;
                        }
                    }
                } // 바다 낚시터 종료
                else {
                    System.out.println("다시 입력해주세요.");
                }

            } else if (select == 2) {   // 장비 강화

                while (true) {
                    System.out.println("장비 강화");
                    System.out.println("[1] 낚싯대 강화 | [2] 찌 강화 | [3] 나가기");
                    System.out.print(">>> ");
                    select = Integer.parseInt(scan.nextLine());
                    if (select == 1) {
                        System.out.println("낚싯대 강화 " + "현재 +" + rod + "강");
                        System.out.println("낚싯대를 강화하시겠습니까? (Y/N)");
                        System.out.println("강화비: " + (10000 + 10000 * rod));
                        System.out.print(">>> ");

                        String yn;
                        yn = String.valueOf(scan.nextLine());
                        if (yn.equals("Y")) {   // 지갑에서 강화비를 빼고 rod = rod + 1
                            myMoney = myMoney - 10000 - (10000 * rod);
                            rod = rod + 1;
                            System.out.println("강화 성공!");
                            System.out.println("현재 낚싯대 강화 수치 " + rod + "강");
                            System.out.println("지갑 잔액: " + myMoney);
                        }

                    } else if (select == 2) {
                        System.out.println("찌 강화 " + "현재 +" + fishFloat + "강");
                        System.out.println("찌를 강화하시겠습니까? (Y/N)");
                        System.out.println("강화비: " + (10000 + 10000 * fishFloat));
                        System.out.print(">>> ");

                        String yn;
                        yn = String.valueOf(scan.nextLine());
                        if (yn.equals("Y")) {   // 지갑에서 강화비를 빼고 rod = rod + 1
                            myMoney = myMoney - 10000 - (10000 * fishFloat);
                            fishFloat = fishFloat + 1;
                            System.out.println("강화 성공!");
                            System.out.println("현재 찌 강화 수치 " + fishFloat + "강");
                            System.out.println("지갑 잔액: " + myMoney);
                        }


                    }


                }

            } else if (select == 3) {   // 상점 (구매: 떡밥 / 판매: 가방 내 물고기(일괄))
                System.out.println("상점");
                System.out.println("[1] 떡밥 구매 | [2] 물고기 판매 | [3] 나가기");
                System.out.print(">>> ");
                select = Integer.parseInt(scan.nextLine());
                // 구매 기능
                if (select == 1) {  // 살 떡밥 개수를 입력하면 떡밥 가격 * 개수만큼 내 지갑에서 빠짐
                                    // 구매하고싶은 총액이 내 지갑금액보다 많으면 구매 불가
                    System.out.println("떡밥(개당 1000원)");
                    System.out.println("현재 잔액: " + myMoney + "원");
                    System.out.println("구매할 개수를 입력해주세요.");
                    System.out.print(">>> ");
                    baitBuyNum = Integer.parseInt(scan.nextLine());
                    if ((baitBuyNum * baitPrice) <= myMoney) { // 구매 총액이 내 지갑금액보다 적으면 구매 가능
                    // 대충 지갑에서 돈 빠지고 떡밥 충전하는 내용
                        myMoney = myMoney - (baitBuyNum * baitPrice);
                        bait = bait + baitBuyNum;
                        System.out.println("남은 떡밥 개수:" + bait + "개");
                        System.out.println("현재 잔액: " + myMoney + "원");
                    } else {
                        System.out.println("잔액이 부족합니다.");
                        System.out.println("현재 잔액: " + myMoney + "원");
                    }

                } else if (select == 2) {   // 판매 기능
                    for (int i = 0; i < fishBag.size(); i++) {
                        sum += fishBag.get(i).getPrice();
                    }
                    myMoney = myMoney + sum;
                    fishBag.clear();
                    sum = 0;
                    System.out.println("판매 완료");
                    System.out.println("소지 금액: " + myMoney + "원");
                }

            } else if (select == 4) {   // 가방
                System.out.println("내 가방");
                // 잡은 물고기 목록 보기
                for (int i = 0; i < fishBag.size(); i++) {
                    System.out.println(fishBag.get(i));
                    sum += fishBag.get(i).getPrice();
                }
                System.out.println("가방 합계: " + sum + "원");
            } else if (select == 5) {   // 종료
                System.out.println("낚시를 그만두었습니다..");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }


            // 장비강화, 장비강화에 따른 물고기 확률 조정, 실패확률 조정




        } // while 종료

    } // main 종료

} // class 종료
