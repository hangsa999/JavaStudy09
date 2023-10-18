package jiwoo.submit11;

import ch09_class.common.UtilClass;
import jiwoo.submit09.q02.Fish;

import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) {

        // 생선 길이는 나중에 랜덤값으로 넣어보기
        // 민물고기 객체
        Fish fOne = new Fish("붕어", 10000);
        Fish fTwo = new Fish("잉어", 20000);
        Fish fThree = new Fish("가물치", 30000);
        // 바다물고기 객체
        Fish sOne = new Fish("바다원", 12000);
        Fish sTwo = new Fish("바다투", 22000);
        Fish sThree = new Fish("바다쓰리", 32000);

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
        ArrayList<Fish> bagMoney = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // 가방 내 물고기 합계액

        // 떡밥
        int count = 10;
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
                            if (count > 0) {
                                int randNum = UtilClass.makeRandom(1, 100);
                                if (randNum < 50) {
                                    idx = 0;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 80) {
                                    idx = 1;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 90) {
                                    idx = 2;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 100) {
                                    System.out.println("물고기가 도망갔습니다...");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                }
                            } else if (count == 0) {
                                System.out.println("미끼가 없습니다..");
                                System.out.println("[1] 가방 확인 | [2] 나가기");
                                select = Integer.parseInt(scan.nextLine());
                                if (select == 1) {
                                    System.out.println("내 가방");
                                    // 잡은 물고기 목록 보기
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                        // 잡은 물고기 가치 총액 구하기
                                        sum += fishBag.get(i).getPrice();
                                    }
                                    System.out.println("가방 합계: " + sum + "원");
                                    System.out.println("[1] 나가기");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
                                        break;
                                    }
                                } else if (select == 2) {
                                    break;
                                }
                            }
                        } else if (select == 2) {
                            System.out.println("내 가방");
                            // 잡은 물고기 목록 보기
                            for (int i = 0; i < fishBag.size(); i++) {
                                 System.out.println(fishBag.get(i));
                             }
                             System.out.println("가방 합계: " + sum + "원");
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
                            if (count > 0) {
                                int randNum = UtilClass.makeRandom(1, 100);
                                if (randNum < 50) {
                                    idx = 3;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 80) {
                                    idx = 4;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 90) {
                                    idx = 5;
                                    fishBag.add(fishList.get(idx));
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                } else if (randNum < 100) {
                                    System.out.println("물고기가 도망갔습니다...");
                                    count--;
                                    System.out.println("남은 미끼: " + count);
                                }
                            } else if (count == 0) {
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
                                        bagMoney.add(fishBag.get(i));
                                    }
                                    System.out.println("가방 합계: " + bagMoney + "원");
                                    System.out.println("[1] 나가기");
                                    System.out.print(">>> ");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
                                        break;
                                    }
                                } else if (select == 2) {
                                    break;
                                }

                            }
                        } else if (select == 2) {
                            System.out.println("내 가방");
                            // 잡은 물고기 목록 보기
                            for (int i = 0; i < fishBag.size(); i++) {
                                System.out.println(fishBag.get(i));
                                bagMoney.add(fishBag.get(i));
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
                System.out.println("장비 강화");
                System.out.println("[1] 낚싯대 강화 | [2] 찌 강화 | [3] 나가기");
                System.out.print(">>> ");
                select = Integer.parseInt(scan.nextLine());

            } else if (select == 3) {   // 상점 (구매: 떡밥 / 판매: 가방 내 물고기(일괄))
                System.out.println("상점");
                System.out.println("[1] 떡밥 구매 | [2] 물고기 판매 | [3] 나가기");
                System.out.print(">>> ");
                select = Integer.parseInt(scan.nextLine());
                // 구매 기능
                if (select == 1) {

                } else if (select == 2) {   // 판매 기능
                    for (int i = 0; i < bagMoney.size(); i++) {
                        System.out.println(bagMoney.get(i).getPrice());
                        sum += bagMoney.get(i).getPrice();
                    }
                    fishBag.clear();
                    bagMoney.clear();
                    System.out.println("판매 완료");
                    System.out.println("소지 금액: " + sum + "원");
                }



            } else if (select == 4) {   // 가방
                System.out.println("내 가방");
                // 잡은 물고기 목록 보기
                for (int i = 0; i < fishBag.size(); i++) {
                    System.out.println(fishBag.get(i));
                    sum += fishBag.get(i).getPrice();
                    // 잡은 물고기 가치 총액 구하기
                }
                System.out.println("가방 합계: " + sum + "원");
            } else if (select == 5) {   // 종료
                System.out.println("낚시를 그만두었습니다..");
                break;
            } else {
                System.out.println("다시 입력해주세요.");
            }






        } // while 종료

    } // main 종료

} // class 종료
