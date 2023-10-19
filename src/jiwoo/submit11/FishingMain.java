package jiwoo.submit11;

import ch09_class.common.UtilClass;
import jiwoo.submit11.Fish;

import javax.lang.model.util.ElementScanner6;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) throws InterruptedException {

        // 생선 길이는 나중에 랜덤값으로 넣어보기

        // 강 물고기 객체 (26종)
        Fish bitterling = new Fish("납줄개", 900, "강");
        Fish paleChub = new Fish("피라미", 200, "강");
        Fish cruclanCarp = new Fish("붕어", 160, "강");
        Fish dace = new Fish("황어", 240, "강");
        Fish softShelledTurtle = new Fish("자라", 3750, "강");
        Fish freshwaterGoby = new Fish("동사리", 400, "강");
        Fish loach = new Fish("미꾸라지", 400, "강");
        Fish bluegill = new Fish("블루길", 180, "강");
        Fish yellowPerch = new Fish("옐로우퍼치", 180, "강");
        Fish blackBass = new Fish("큰입배스", 300, "강");
        Fish tilapla = new Fish("틸라피아", 400, "강");
        Fish plke = new Fish("강꼬치고기", 1800, "강");
        Fish pondSmelt = new Fish("빙어", 400, "강");
        Fish sweetFish = new Fish("은어", 900, "강");
        Fish mittenCrab = new Fish("참게", 2000, "강");
        Fish guppy = new Fish("구피", 1300, "강");
        Fish nibbleFish = new Fish("닥터피시", 1500, "강");
        Fish angerlFish = new Fish("천사어", 3000, "강");
        Fish betta = new Fish("베타", 2500, "강");
        Fish neonTetra = new Fish("네온테트라", 500, "강");
        Fish rainbowFish = new Fish("레인보우피시", 800, "강");
        Fish piranha = new Fish("피라니아", 2500, "강");

        // 강 희귀어종 객체
        Fish snappingTurtle = new Fish("늑대거북", 5000, "강");
        Fish arowana = new Fish("아로와나", 10000, "강");
        Fish dorado = new Fish("도라도", 15000, "강");
        Fish arapalma = new Fish("피라루쿠", 10000, "강");
        Fish saddledBichir = new Fish("엔드리케리", 4000, "강");

        // 바다 물고기 객체
        Fish seaButterfly = new Fish("클리오네", 1000, "바다");
        Fish seaHorse = new Fish("해마", 1100, "바다");
        Fish clownFish = new Fish("흰동가리", 650, "바다");
        Fish surgeonFish = new Fish("블루탱", 1000, "바다");
        Fish butterflyFish = new Fish("나비고기", 1000, "바다");
        Fish zebraTurkeyFish = new Fish("쏠배감펭", 500, "바다");
        Fish blowFish = new Fish("복어", 5000, "바다");
        Fish pufferFish = new Fish("가시복", 250, "바다");
        Fish anchovy = new Fish("멸치", 200, "바다");
        Fish horseMackerel = new Fish("전갱이", 150, "바다");
        Fish seaBass = new Fish("농어", 400, "바다");
        Fish redSnapper = new Fish("도미", 3000, "바다");
        Fish dab = new Fish("가자미", 300, "바다");
        Fish oliveFlounder = new Fish("넙치", 800, "바다");
        Fish squid = new Fish("오징어", 500, "바다");
        Fish morayEel = new Fish("곰치", 2000, "바다");
        Fish ribbonEel = new Fish("리본장어", 600, "바다");
        Fish ray = new Fish("가오리", 3000, "바다");
        Fish suckerFish = new Fish("빨판상어", 1500, "바다");
        Fish footballFish = new Fish("초롱아귀", 2500, "바다");

        // 바다 희귀어종 객체
        Fish napoleonFish = new Fish("나폴레옹피시", 10000, "바다");
        Fish barredKnifejaw = new Fish("돌돔", 5000, "바다");
        Fish tuna = new Fish("다랑어", 7000, "바다");
        Fish blueMarlin = new Fish("청새치", 10000, "바다");
        Fish giantTrevally = new Fish("무명갈전갱이", 4500, "바다");
        Fish mahiMahi = new Fish("만새기", 6000, "바다");
        Fish oceanSunFish = new Fish("개복치", 4000, "바다");
        Fish sawShark = new Fish("톱상어", 12000, "바다");
        Fish hammerheadShark = new Fish("귀상어", 8000, "바다");
        Fish greatWhiteShark = new Fish("상어", 15000, "바다");
        Fish whaleShark = new Fish("고래상어", 13000, "바다");
        Fish oarFish = new Fish("산갈치", 9000, "바다");
        Fish barreleye = new Fish("데메니기스", 15000, "바다");
        Fish coelacanth = new Fish("실러캔스", 15000, "바다");

        // 빈 리스트 만들기
        ArrayList<Fish> fishList = new ArrayList<>();

        // 리스트에 강 물고기 객체 추가
        fishList.add(bitterling);
        fishList.add(paleChub);
        fishList.add(cruclanCarp);
        fishList.add(dace);
        fishList.add(softShelledTurtle);
        fishList.add(freshwaterGoby);
        fishList.add(loach);
        fishList.add(bluegill);
        fishList.add(yellowPerch);
        fishList.add(blackBass);
        fishList.add(tilapla);
        fishList.add(plke);
        fishList.add(pondSmelt);
        fishList.add(sweetFish);
        fishList.add(mittenCrab);
        fishList.add(guppy);
        fishList.add(nibbleFish);
        fishList.add(angerlFish);
        fishList.add(betta);
        fishList.add(neonTetra);
        fishList.add(rainbowFish);
        fishList.add(piranha);

        // 리스트에 강 희귀어종 객체 추가
        fishList.add(snappingTurtle);
        fishList.add(arowana);
        fishList.add(dorado);
        fishList.add(arapalma);
        fishList.add(saddledBichir);

        // 리스트에 바다 물고기 객체 추가
        fishList.add(seaButterfly);
        fishList.add(seaHorse);
        fishList.add(clownFish);
        fishList.add(surgeonFish);
        fishList.add(butterflyFish);
        fishList.add(zebraTurkeyFish);
        fishList.add(blowFish);
        fishList.add(pufferFish);
        fishList.add(anchovy);
        fishList.add(horseMackerel);
        fishList.add(seaBass);
        fishList.add(redSnapper);
        fishList.add(dab);
        fishList.add(oliveFlounder);
        fishList.add(squid);
        fishList.add(morayEel);
        fishList.add(ribbonEel);
        fishList.add(ray);
        fishList.add(suckerFish);
        fishList.add(footballFish);

        // 리스트에 바다 희귀어종 객체 추가
        fishList.add(napoleonFish);
        fishList.add(barredKnifejaw);
        fishList.add(tuna);
        fishList.add(blueMarlin);
        fishList.add(giantTrevally);
        fishList.add(mahiMahi);
        fishList.add(oceanSunFish);
        fishList.add(sawShark);
        fishList.add(hammerheadShark);
        fishList.add(greatWhiteShark);
        fishList.add(whaleShark);
        fishList.add(oarFish);
        fishList.add(barreleye);
        fishList.add(coelacanth);

        // 물고기 가방 (비어있는 새 목록 만들어서 도감이랑 통일, 상점 판매시 금액만큼 지갑에 추가하고 리스트에서 삭제)

        ArrayList<Fish> fishBag = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // 떡밥
        int bait = 10;
        // 구매하고싶은 떡밥 개수
        int baitBuyNum = 0;
        // 떡밥 가격
        int baitPrice = 500;


        // 낚싯대 강화 수치
        int rod = 0;
        // 찌 강화 수치
        int fishFloat = 0;
        // 지갑 잔액
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
                System.out.println("[1] 강 낚시터 | [2] 바다 낚시터");
                System.out.print(">>> ");
                select = Integer.parseInt(scan.nextLine());

                // 1번 : 강 낚시터 낚시
                if (select == 1)  {

                    System.out.println("강 낚시터에 입장하셨습니다.");

                    while (true) {

                        System.out.println("[1] 낚시하기 | [2] 가방 확인 | [3] 나가기");
                        System.out.print(">>> ");
                        select = Integer.parseInt(scan.nextLine());

                        if (select == 1) {

                            if (bait > 0) {

                                int randNum = UtilClass.makeRandom(1, 170 - rod);

                                if (randNum < 5) {
                                    idx = 0;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 12) {
                                    idx = 1;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 19) {
                                    idx = 2;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 25) {
                                    idx = 3;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 27) {
                                    idx = 4;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 28) {
                                    idx = 5;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 33) {
                                    idx = 6;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 38) {
                                    idx = 7;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 44) {
                                    idx = 8;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 50) {
                                    idx = 9;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 55) {
                                    idx = 10;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 60) {
                                    idx = 11;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 62) {
                                    idx = 12;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 67) {
                                    idx = 13;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 72) {
                                    idx = 14;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 74) {
                                    idx = 15;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 80) {
                                    idx = 16;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 82) {
                                    idx = 17;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 84) {
                                    idx = 18;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 89) {
                                    idx = 19;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 94) {
                                    idx = 20;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 96) {
                                    idx = 21;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 97) {
                                    idx = 22;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 98) {
                                    idx = 23;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 99) {
                                    idx = 24;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 100) {
                                    idx = 25;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum > 110 && randNum < 120) {     // 민물 낚시 실패 (기본 10% ~ 낚싯대 강화 수치마다 1% 감소)
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
                                int randNum = UtilClass.makeRandom(1, 150 - rod);
                                if (randNum < 5) {
                                    idx = 26;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 10) {
                                    idx = 27;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 20) {
                                    idx = 28;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 25) {
                                    idx = 29;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 30) {
                                    idx = 30;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 31) {
                                    idx = 31;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 41) {
                                    idx = 32;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 43) {
                                    idx = 33;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 53) {
                                    idx = 34;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 63) {
                                    idx = 35;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 73) {
                                    idx = 36;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 74) {
                                    idx = 37;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 84) {
                                    idx = 38;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 87) {
                                    idx = 39;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 97) {
                                    idx = 40;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 102) {
                                    idx = 41;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 112) {
                                    idx = 42;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 115) {
                                    idx = 43;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 125) {
                                    idx = 44;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 126) {
                                    idx = 45;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 127) {
                                    idx = 46;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 128) {
                                    idx = 47;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 129) {
                                    idx = 48;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 130) {
                                    idx = 49;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 133) {
                                    idx = 50;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 134) {
                                    idx = 51;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 135) {
                                    idx = 52;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 136) {
                                    idx = 53;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 137) {
                                    idx = 54;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 142) {
                                    idx = 55;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 147) {
                                    idx = 56;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 148) {
                                    idx = 57;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 149) {
                                    idx = 58;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum < 150) {
                                    idx = 59;
                                    fishBag.add(fishList.get(idx));
                                    bagMoney = bagMoney + fishList.get(idx).getPrice();
                                    System.out.println(fishList.get(idx).getName() + "을(를) 잡았다!");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                } else if (randNum > 160 && randNum < 170) {
                                    System.out.println("물고기가 도망갔습니다...");
                                    bait--;
                                    System.out.println("남은 미끼: " + bait);
                                }
                            } else if (bait == 0) { // 바다 낚시 미끼 없을 때
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
                        while (true) {
                            System.out.println("낚싯대 강화 " + "현재 +" + rod + "강");
                            System.out.println("낚싯대를 강화하시겠습니까? (Y/N)");
                            System.out.println("강화비: " + (10000 + 10000 * rod));
                            System.out.println("지갑 잔액: " + myMoney);
                            System.out.print(">>> ");

                            String yn;
                            yn = String.valueOf(scan.nextLine());
                            if ( yn.equalsIgnoreCase("Y") && (myMoney - 10000 - (10000 * rod)) > 0) {   // 지갑의 돈이 강화비보다 많거나 같을 때
                                // 지갑에서 강화비를 빼고 rod = rod + 1
                                myMoney = myMoney - 10000 - (10000 * rod);
                                rod = rod + 1;
                                System.out.println("강화 성공!");
                                System.out.println("현재 낚싯대 강화 수치 " + rod + "강");
                                System.out.println("지갑 잔액: " + myMoney);
                            } else if (yn.equalsIgnoreCase("N")){
                                System.out.println("강화를 종료합니다.");
                                break;
                            } else if (yn.equalsIgnoreCase("Y") && (myMoney - 10000 - (10000 * rod)) < 0) {
                                System.out.println("강화비가 부족합니다.");
                            }
                        }


                    } else if (select == 2) {
                        while (true) {
                            System.out.println("찌 강화 " + "현재 +" + fishFloat + "강");
                            System.out.println("찌를 강화하시겠습니까? (Y/N)");
                            System.out.println("강화비: " + (10000 + 10000 * fishFloat));
                            System.out.println("지갑 잔액: " + myMoney);
                            System.out.print(">>> ");

                            String yn;
                            yn = String.valueOf(scan.nextLine());
                            if (yn.equalsIgnoreCase("Y") && (myMoney - 10000 - (10000 * fishFloat)) > 0) {
                                myMoney = myMoney - 10000 - (10000 * fishFloat);
                                fishFloat = fishFloat + 1;
                                System.out.println("강화 성공!");
                                System.out.println("현재 찌 강화 수치 " + fishFloat + "강");
                                System.out.println("지갑 잔액: " + myMoney);
                            } else if (yn.equalsIgnoreCase("N")){
                                System.out.println("강화를 종료합니다.");
                                break;
                            } else if (yn.equalsIgnoreCase("Y") && (myMoney - 10000 - (10000 * fishFloat)) < 0) {
                                System.out.println("강화비가 부족합니다.");
                            }
                        }
                    } else if (select == 3) {
                        System.out.println("강화를 종료합니다.");
                        break;
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
                    System.out.println("떡밥(" + baitPrice + "원)");
                    System.out.println("현재 잔액: " + myMoney + "원");
                    System.out.println("구매 가능 떡밥 개수: " + (myMoney / baitPrice) + "개");
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
                System.out.println("물고기 합계: " + sum + "원");
                System.out.println("지갑 합계: " + myMoney + "원");
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
