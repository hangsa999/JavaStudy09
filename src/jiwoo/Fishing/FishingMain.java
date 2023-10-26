package jiwoo.Fishing;

import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {

    public static void main(String[] args) throws InterruptedException {
        // 생선 길이는 나중에 랜덤값으로 넣어보기

        // 강 물고기 객체 (22종)
        Fish cruclanCarp = new Fish("붕어", 160, "강");
        Fish bluegill = new Fish("블루길", 180, "강");
        Fish paleChub = new Fish("피라미", 200, "강");
        Fish dace = new Fish("황어", 240, "강");
        Fish yellowPerch = new Fish("옐로우퍼치", 300, "강");
        Fish freshwaterGoby = new Fish("동사리", 400, "강");
        Fish loach = new Fish("미꾸라지", 400, "강");
        Fish blackBass = new Fish("큰입배스", 400, "강");
        Fish pondSmelt = new Fish("빙어", 400, "강");
        Fish neonTetra = new Fish("네온테트라", 500, "강");
        Fish tilapla = new Fish("틸라피아", 800, "강");
        Fish rainbowFish = new Fish("레인보우피시", 800, "강");
        Fish bitterling = new Fish("납줄개", 900, "강");
        Fish sweetFish = new Fish("은어", 900, "강");
        Fish guppy = new Fish("구피", 1300, "강");
        Fish nibbleFish = new Fish("닥터피시", 1500, "강");
        Fish plke = new Fish("강꼬치고기", 1800, "강");
        Fish mittenCrab = new Fish("참게", 2000, "강");
        Fish betta = new Fish("베타", 2500, "강");
        Fish piranha = new Fish("피라니아", 2500, "강");
        Fish angerlFish = new Fish("천사어", 3000, "강");
        Fish softShelledTurtle = new Fish("자라", 3750, "강");

        // 강 희귀어종 객체 (5종)
        Fish saddledBichir = new Fish("엔드리케리", 4000, "강");
        Fish snappingTurtle = new Fish("늑대거북", 5000, "강");
        Fish arowana = new Fish("아로와나", 10000, "강");
        Fish arapalma = new Fish("피라루쿠", 10000, "강");
        Fish dorado = new Fish("도라도", 15000, "강");

        // 바다 물고기 객체
        Fish horseMackerel = new Fish("전갱이", 150, "바다");
        Fish anchovy = new Fish("멸치", 200, "바다");
        Fish pufferFish = new Fish("가시복", 250, "바다");
        Fish dab = new Fish("가자미", 300, "바다");
        Fish seaBass = new Fish("농어", 400, "바다");
        Fish zebraTurkeyFish = new Fish("쏠배감펭", 500, "바다");
        Fish squid = new Fish("오징어", 500, "바다");
        Fish ribbonEel = new Fish("리본장어", 600, "바다");
        Fish clownFish = new Fish("흰동가리", 650, "바다");
        Fish oliveFlounder = new Fish("넙치", 800, "바다");
        Fish seaButterfly = new Fish("클리오네", 1000, "바다");
        Fish surgeonFish = new Fish("블루탱", 1000, "바다");
        Fish butterflyFish = new Fish("나비고기", 1000, "바다");
        Fish seaHorse = new Fish("해마", 1100, "바다");
        Fish suckerFish = new Fish("빨판상어", 1500, "바다");
        Fish morayEel = new Fish("곰치", 2000, "바다");
        Fish footballFish = new Fish("초롱아귀", 2500, "바다");
        Fish redSnapper = new Fish("도미", 3000, "바다");
        Fish ray = new Fish("가오리", 3000, "바다");
        Fish blowFish = new Fish("복어", 5000, "바다");

        // 바다 희귀어종 객체
        Fish oceanSunFish = new Fish("개복치", 4000, "바다");
        Fish giantTrevally = new Fish("무명갈전갱이", 4500, "바다");
        Fish barredKnifejaw = new Fish("돌돔", 5000, "바다");
        Fish mahiMahi = new Fish("만새기", 6000, "바다");
        Fish tuna = new Fish("다랑어", 7000, "바다");
        Fish hammerheadShark = new Fish("귀상어", 8000, "바다");
        Fish oarFish = new Fish("산갈치", 9000, "바다");
        Fish napoleonFish = new Fish("나폴레옹피시", 10000, "바다");
        Fish blueMarlin = new Fish("청새치", 10000, "바다");
        Fish sawShark = new Fish("톱상어", 12000, "바다");
        Fish whaleShark = new Fish("고래상어", 13000, "바다");
        Fish greatWhiteShark = new Fish("상어", 15000, "바다");
        Fish barreleye = new Fish("데메니기스", 15000, "바다");
        Fish coelacanth = new Fish("실러캔스", 15000, "바다");

        // (히든) 절벽 위 객체
        Fish cherrySalmon = new Fish("산천어", 1000, "절벽 위");
        Fish charFish = new Fish("열목어", 3800, "절벽 위");
        Fish goldenTrout = new Fish("금송어", 15000, "절벽 위");
        Fish stringFish = new Fish("열본연어", 15000, "절벽 위");
        Fish endFish = new Fish("전설의 물고기", 1000000, "절벽 위");

        // 빈 리스트 만들기
        ArrayList<Fish> fishList = new ArrayList<>();

        // 리스트에 강 물고기 객체 추가
        fishList.add(cruclanCarp);
        fishList.add(bluegill);
        fishList.add(paleChub);
        fishList.add(dace);
        fishList.add(yellowPerch);
        fishList.add(freshwaterGoby);
        fishList.add(loach);
        fishList.add(blackBass);
        fishList.add(pondSmelt);
        fishList.add(neonTetra);
        fishList.add(tilapla);
        fishList.add(rainbowFish);
        fishList.add(bitterling);
        fishList.add(sweetFish);
        fishList.add(guppy);
        fishList.add(nibbleFish);
        fishList.add(plke);
        fishList.add(mittenCrab);
        fishList.add(betta);
        fishList.add(piranha);
        fishList.add(angerlFish);
        fishList.add(softShelledTurtle);

        // 리스트에 강 희귀어종 객체 추가
        fishList.add(saddledBichir);
        fishList.add(snappingTurtle);
        fishList.add(arowana);
        fishList.add(arapalma);
        fishList.add(dorado);

        // 리스트에 바다 물고기 객체 추가
        fishList.add(horseMackerel);
        fishList.add(anchovy);
        fishList.add(pufferFish);
        fishList.add(dab);
        fishList.add(seaBass);
        fishList.add(zebraTurkeyFish);
        fishList.add(squid);
        fishList.add(ribbonEel);
        fishList.add(clownFish);
        fishList.add(oliveFlounder);
        fishList.add(seaButterfly);
        fishList.add(surgeonFish);
        fishList.add(butterflyFish);
        fishList.add(seaHorse);
        fishList.add(suckerFish);
        fishList.add(morayEel);
        fishList.add(footballFish);
        fishList.add(redSnapper);
        fishList.add(ray);
        fishList.add(blowFish);

        // 리스트에 바다 희귀어종 객체 추가
        fishList.add(oceanSunFish);
        fishList.add(giantTrevally);
        fishList.add(barredKnifejaw);
        fishList.add(mahiMahi);
        fishList.add(tuna);
        fishList.add(hammerheadShark);
        fishList.add(oarFish);
        fishList.add(napoleonFish);
        fishList.add(blueMarlin);
        fishList.add(sawShark);
        fishList.add(whaleShark);
        fishList.add(greatWhiteShark);
        fishList.add(barreleye);
        fishList.add(coelacanth);


        // 리스트에 (히든) 절벽 위 물고기 객체 추가
        fishList.add(cherrySalmon);
        fishList.add(charFish);
        fishList.add(goldenTrout);
        fishList.add(stringFish);
        fishList.add(endFish);


        // 물고기 가방 (비어있는 새 목록 만들어서 잡은 물고기를 넣기, 상점 판매시 잡은 물고기 금액 합계만큼 지갑에 추가하고 리스트에서 삭제)

        ArrayList<Fish> fishBag = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        // 떡밥
        int bait = 10;

        // 구매하고싶은 떡밥 개수
        int baitBuyNum;

        // 떡밥 가격
        int baitPrice = 500;

        // 낚싯대 강화 수치
        int rod = 0;

        // 찌 강화 수치
        int fishFloat = 0;

        // 보유 금액
        int myMoney = 0;

        fishing:
        while (true) {

            System.out.println("");
            System.out.println("무엇을 할까?");
            System.out.println("");
            System.out.println("[1] 낚시터 선택  [2] 장비 강화  [3] 상점  [4] 가방  [5] 종료");
            System.out.print(">>> ");

            int select = Integer.parseInt(scan.nextLine());
            int sum = 0;
            int bagMoney = 0;

            if (select == 1) {

                // +10 낚싯대와 +10 찌를 보유한 상태로 지역 선택에 들어갈 때
                if (rod == 10 && fishFloat == 10) {

                    // 히든 지역!!!
                    System.out.println("");
                    System.out.println("절벽 위 낚시 포인트를 발견했다!");
                    System.out.println("한 번 올라가보자");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.print(".");
                    Thread.sleep(300);
                    System.out.println("");
                    System.out.println("절벽 위에 도착했다!");
                    System.out.println("낚시를 해 볼까?");
                    hidden:
                    while (true) {

                        System.out.println("");
                        System.out.println("[1] 낚시하기  [2] 가방 확인  [3] 나가기");
                        System.out.print(">>> ");
                        select = Integer.parseInt(scan.nextLine());

                        if (select == 1) {

                            if (bait > 0) {

                                int randNum = Fish.makeRandom(1, 100);

                                if (randNum <= 30) {
                                    fishBag.add(fishList.get(61));
                                    bagMoney = bagMoney + fishList.get(61).getPrice();
                                    System.out.println("");
                                    System.out.println(fishList.get(61).getName() + "를 잡았다!");
                                    bait--;
                                    System.out.println("남은 떡밥: " + bait + "개");
                                } else if (randNum <= 60) {
                                    fishBag.add(fishList.get(62));
                                    bagMoney = bagMoney + fishList.get(62).getPrice();
                                    System.out.println(fishList.get(62).getName() + "를 잡았다!");
                                    bait--;
                                    System.out.println("남은 떡밥: " + bait + "개");
                                } else if (randNum <= 75) {
                                    fishBag.add(fishList.get(63));
                                    bagMoney = bagMoney + fishList.get(63).getPrice();
                                    System.out.println("");
                                    System.out.println("[희귀] " + fishList.get(63).getName() + "를 잡았다!");
                                    bait--;
                                    System.out.println("남은 떡밥: " + bait + "개");
                                } else if (randNum <= 90) {
                                    fishBag.add(fishList.get(64));
                                    bagMoney = bagMoney + fishList.get(64).getPrice();
                                    System.out.println("");
                                    System.out.println("[희귀] " + fishList.get(64).getName() + "를 잡았다!");
                                    bait--;
                                    System.out.println("남은 떡밥: " + bait + "개");

                                    // 엔딩 물고기
                                } else if (randNum > 90) { // else로 해도 되지만 게임의 엔딩이니까 그냥 값을 다 넣음
                                    System.out.print("저항이 거세다");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.println("!");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.println(".");
                                    System.out.print("낚싯대가 부러질 것 같다");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.println("!");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.print(".");
                                    Thread.sleep(300);
                                    System.out.println(".");
                                    Thread.sleep(3000);
                                    fishBag.add(fishList.get(65));
                                    bagMoney = bagMoney + fishList.get(65).getPrice();
                                    System.out.println(fishList.get(65).getName() + "를 잡았다!");
                                    break fishing;
                                }                           // 엔딩


                            } else if (bait == 0) { // 떡밥 없을 때 낚시 시도 시
                                System.out.println("");
                                System.out.println("떡밥이 없습니다...");
                                System.out.println("");
                                System.out.println("[1] 가방 확인  [2] 나가기");
                                select = Integer.parseInt(scan.nextLine());

                                // 떡밥 없을 때 가방 확인
                                if (select == 1) {
                                    System.out.println("");
                                    System.out.println("==== 내 가방 ====");
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                    }
                                    System.out.println("");
                                    System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                    System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                    System.out.println("남은 떡밥: " + bait + "개");
                                    System.out.println("");
                                    System.out.println("[1] 나가기");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
                                        break hidden;
                                    } else {
                                        System.out.println("");
                                        System.out.println("잘못 입력하셨습니다.");
                                    }
                                } else if (select == 2) {
                                    break hidden;
                                }

                            } else if (select == 2) {   // 잡은 물고기 목록 보기
                                System.out.println("");
                                System.out.println("==== 내 가방 ====");
                                for (int i = 0; i < fishBag.size(); i++) {
                                    System.out.println(fishBag.get(i));
                                }
                                System.out.println("");
                                System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                System.out.println("남은 떡밥: " + bait + "개");
                                System.out.println("");
                            } else if (select == 3) {
                                break;
                            } else {
                                System.out.println("");
                                System.out.println("잘못 입력하셨습니다");
                            }


                        } else if (select == 2) {
                            System.out.println("");
                            System.out.println("==== 내 가방 ====");
                            for (int i = 0; i < fishBag.size(); i++) {
                                System.out.println(fishBag.get(i));
                            }
                            System.out.println("");
                            System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                            System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                            System.out.println("남은 떡밥: " + bait + "개");
                            System.out.println("");
                        } else if (select == 3) {
                            break hidden;
                        } else {
                            System.out.println("");
                            System.out.println("잘못 입력하셨습니다.");
                        }
                    } // 절벽 낚시 종료


                } else {        // 낚싯대, 찌가 풀강이 아닐 때, 일반 낚시터만 보여줌
                    System.out.println("");
                    System.out.println("오늘은 어디로 갈까?");
                    System.out.println("");
                    System.out.println("[1] 강 낚시터  [2] 바다 낚시터");
                    System.out.print(">>> ");
                    select = Integer.parseInt(scan.nextLine());

                    // 1번 : 강 낚시터 낚시
                    if (select == 1) {

                        System.out.println("");
                        System.out.println("강 낚시터에 입장하셨습니다.");

                        river:
                        while (true) {

                            System.out.println("");
                            System.out.println("[1] 낚시하기  [2] 자동 낚시  [3] 가방 확인  [4] 나가기");
                            System.out.print(">>> ");
                            select = Integer.parseInt(scan.nextLine());

                            if (select == 1) {

                                if (bait > 0) {

                                    int randNum = Fish.makeRandom(1, 1101 - rod * 10); // 낚싯대 +1강할 때 마다 실패 확률 10/1100 감소 => +10강 시 낚시를 실패하지 않음
                                    int fishNum;

                                    // 1000원 미만
                                    if (randNum <= 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(0, 13);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        // 1000 이상 ~ 2000 미만
                                    } else if (randNum <= 500 - fishFloat * 2 && randNum > 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(14, 16);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2000 이상 ~ 2500 미만
                                    } else if (randNum <= 700 - fishFloat * 3 && randNum > 500 - fishFloat * 2) {
                                        fishNum = Fish.makeRandom(17, 17);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2500 이상 ~ 3000 미만
                                    } else if (randNum <= 870 - fishFloat * 4 && randNum > 700 - fishFloat * 3) {
                                        fishNum = Fish.makeRandom(18, 19);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 3000 이상 ~ 5000 미만
                                    } else if (randNum <= 980 - fishFloat * 5 && randNum > 870 - fishFloat * 4) {
                                        fishNum = Fish.makeRandom(20, 21);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 희귀 강 물고기
                                    } else if (randNum <= 1000 && randNum > 980 - fishFloat * 5) {
                                        Thread.sleep(1000);
                                        System.out.print("저항이 거세다");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.println("!");
                                        Thread.sleep(1000);
                                        fishNum = Fish.makeRandom(22, 26);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println("[희귀] " + fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        Thread.sleep(300);
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(300);

                                        // 낚시 실패 (낚싯대 10강시 randNum 최대값이 1000이 되므로 실패하지 않음)
                                    } else if (randNum <= 1100 && randNum > 1000) {
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println("물고기가 떡밥만 먹고 도망갔습니다...");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(1000);
                                    }
                                    Thread.sleep(100);

                                    // 떡밥 없을 때 낚시 시도 시
                                } else if (bait == 0) {
                                    System.out.println("");
                                    System.out.println("떡밥이 없습니다...");
                                    System.out.println("");
                                    System.out.println("[1] 가방 확인  [2] 나가기");
                                    select = Integer.parseInt(scan.nextLine());

                                    // 떡밥 없을 때 강 낚시터 가방 확인
                                    if (select == 1) {
                                        System.out.println("");
                                        System.out.println("==== 내 가방 ====");
                                        for (int i = 0; i < fishBag.size(); i++) {
                                            System.out.println(fishBag.get(i));
                                        }
                                        System.out.println("");
                                        System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                        System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        System.out.println("[1] 나가기");
                                        select = Integer.parseInt(scan.nextLine());
                                        if (select == 1) {
                                            break river;
                                        }
                                    } else if (select == 2) {
                                        break river;
                                    }
                                }

                                // 자동 낚시 기능
                            } else if (select == 2 && bait > 0) {
                                // 떡밥이 다 떨어지면 자동 종료
                                int baitNum = bait;
                                for (int i = 0; i < baitNum; i++) {

                                    int randNum = Fish.makeRandom(1, 1101 - rod * 10); // 낚싯대 +1강할 때 마다 실패 확률 10/1100 감소 => +10강 시 낚시를 실패하지 않음
                                    int fishNum;

                                    // 1000원 미만
                                    if (randNum <= 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(0, 13);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 1000 이상 ~ 2000 미만
                                    } else if (randNum <= 500 - fishFloat * 2 && randNum > 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(14, 16);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2000 이상 ~ 2500 미만
                                    } else if (randNum <= 700 - fishFloat * 3 && randNum > 500 - fishFloat * 2) {
                                        fishNum = Fish.makeRandom(17, 17);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2500 이상 ~ 3000 미만
                                    } else if (randNum <= 870 - fishFloat * 4 && randNum > 700 - fishFloat * 3) {
                                        fishNum = Fish.makeRandom(18, 19);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 3000 이상 ~ 5000 미만
                                    } else if (randNum <= 980 - fishFloat * 5 && randNum > 870 - fishFloat * 4) {
                                        fishNum = Fish.makeRandom(20, 21);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 희귀 강 물고기
                                    } else if (randNum <= 1000 && randNum > 980 - fishFloat * 5) {
                                        System.out.print("저항이 거세다");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.println("!");
                                        Thread.sleep(1000);
                                        fishNum = Fish.makeRandom(22, 26);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println("[희귀] " + fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        Thread.sleep(300);
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(300);

                                        // 낚시 실패 (낚싯대 10강시 randNum 최대값이 1000이 되므로 실패하지 않음)
                                    } else if (randNum <= 1100 && randNum > 1000) {
                                        System.out.println("물고기가 떡밥만 먹고 도망갔습니다...");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(1000);
                                    }
                                    Thread.sleep(300);
                                }


                            } else if (select == 2 && bait == 0) {
                                System.out.println("");
                                System.out.println("떡밥이 없습니다...");
                                System.out.println("");
                                System.out.println("[1] 가방 확인  [2] 나가기");
                                select = Integer.parseInt(scan.nextLine());

                                // 떡밥 없을 때 강 낚시터 가방 확인
                                if (select == 1) {
                                    System.out.println("");
                                    System.out.println("==== 내 가방 ====");
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                    }
                                    System.out.println("");
                                    System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                    System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                    System.out.println("남은 떡밥: " + bait + "개");
                                    System.out.println("");
                                    System.out.println("[1] 나가기");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
                                        break river;
                                    }
                                } else if (select == 2) {
                                    break river;
                                }

                            } else if (select == 3) { // 잡은 물고기 목록 보기
                                System.out.println("");
                                System.out.println("==== 내 가방 ====");
                                for (int i = 0; i < fishBag.size(); i++) {
                                    System.out.println(fishBag.get(i));
                                }
                                System.out.println("");
                                System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                System.out.println("남은 떡밥: " + bait + "개");
                                System.out.println("");

                            } else if (select == 4) {
                                break river;

                            } else {
                                System.out.println("잘못 입력하셨습니다.");
                            }

                        }

                    } // 강 낚시터 종료

                    // 2 : 바다 낚시터 입장
                    else if (select == 2) {
                        System.out.println("바다 낚시터에 입장하셨습니다.");
                        sea:
                        while (true) {
                            System.out.println("");
                            System.out.println("[1] 낚시하기  [2] 자동 낚시  [3] 가방 확인  [4] 나가기");
                            System.out.print(">>> ");
                            select = Integer.parseInt(scan.nextLine());

                            if (select == 1) {

                                if (bait > 0) {

                                    int randNum = Fish.makeRandom(1, 1100 - rod * 10); // 낚싯대 +1강할 때 마다 실패 확률 10/1100 감소 => +10강 시 낚시를 실패하지 않음
                                    int fishNum;

                                    if (randNum <= 250 - fishFloat) { // 1000원 미만
                                        fishNum = Fish.makeRandom(27, 36);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                    } else if (randNum <= 500 - fishFloat * 2 && randNum > 250 - fishFloat) { // 1000 이상 ~ 2000 미만
                                        fishNum = Fish.makeRandom(37, 41);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                    } else if (randNum <= 700 - fishFloat * 3 && randNum > 500 - fishFloat * 2) { // 2000 이상 ~ 2500 미만
                                        fishNum = Fish.makeRandom(42, 42);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                    } else if (randNum <= 870 - fishFloat * 4 && randNum > 700 - fishFloat * 3) { // 2500 이상 ~ 3500 미만
                                        fishNum = Fish.makeRandom(43, 45);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                    } else if (randNum <= 980 - fishFloat * 5 && randNum > 870 - fishFloat * 4) { // 3500 이상 ~ 5000 미만
                                        fishNum = Fish.makeRandom(46, 46);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("");
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                    } else if (randNum <= 1000 && randNum > 980 - fishFloat * 5) { // 희귀 바다 물고기
                                        System.out.print("저항이 거세다");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.println("!");
                                        Thread.sleep(1000);
                                        fishNum = Fish.makeRandom(47, 60);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        Thread.sleep(1000);
                                        System.out.println("[희귀] " + fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        Thread.sleep(300);
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                        Thread.sleep(300);

                                    } else if (randNum <= 1100 && randNum > 1000) { // 낚시 실패
                                        System.out.println("");
                                        System.out.println("물고기가 떡밥만 먹고 도망갔습니다...");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait);
                                        System.out.println("");
                                        Thread.sleep(1000);
                                    }
                                    Thread.sleep(300);

                                } else if (bait == 0) { // 바다 낚시 떡밥 없을 때
                                    System.out.println("떡밥이 없습니다...");
                                    System.out.println("");
                                    System.out.println("[1] 가방 확인  [2] 나가기");
                                    System.out.print(">>> ");
                                    select = Integer.parseInt(scan.nextLine());
                                    // 잡은 물고기 목록 보기
                                    if (select == 1) {
                                        System.out.println("");
                                        System.out.println("==== 내 가방 ====");
                                        for (int i = 0; i < fishBag.size(); i++) {
                                            System.out.println(fishBag.get(i));
                                        }
                                        System.out.println("");
                                        System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                        System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        System.out.println("[1] 나가기");
                                        System.out.print(">>> ");
                                        select = Integer.parseInt(scan.nextLine());
                                        if (select == 1) {
                                            break sea;
                                        }
                                    } else if (select == 2) {
                                        break sea;
                                    }

                                }

                            } else if (select == 2 && bait > 0) { // 바다 자동 낚시

                                // 떡밥이 다 떨어지면 자동 종료
                                int baitNum = bait;
                                for (int i = 0; i < baitNum; i++) {

                                    int randNum = Fish.makeRandom(1, 1101 - rod * 10); // 낚싯대 +1강할 때 마다 실패 확률 10/1100 감소 => +10강 시 낚시를 실패하지 않음
                                    int fishNum;

                                    // 1000원 미만
                                    if (randNum <= 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(27, 36);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 1000 이상 ~ 2000 미만
                                    } else if (randNum <= 500 - fishFloat * 2 && randNum > 250 - fishFloat) {
                                        fishNum = Fish.makeRandom(37, 41);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2000 이상 ~ 2500 미만
                                    } else if (randNum <= 700 - fishFloat * 3 && randNum > 500 - fishFloat * 2) {
                                        fishNum = Fish.makeRandom(42, 42);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 2500 이상 ~ 3000 미만
                                    } else if (randNum <= 870 - fishFloat * 4 && randNum > 700 - fishFloat * 3) {
                                        fishNum = Fish.makeRandom(43, 45);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 3000 이상 ~ 5000 미만
                                    } else if (randNum <= 980 - fishFloat * 5 && randNum > 870 - fishFloat * 4) {
                                        fishNum = Fish.makeRandom(46, 46);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println(fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");

                                        // 희귀 바다 물고기
                                    } else if (randNum <= 1000 && randNum > 980 - fishFloat * 5) {
                                        System.out.print("저항이 거세다");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.print(".");
                                        Thread.sleep(300);
                                        System.out.println("!");
                                        Thread.sleep(1000);
                                        fishNum = Fish.makeRandom(47, 60);
                                        fishBag.add(fishList.get(fishNum));
                                        bagMoney = bagMoney + fishList.get(fishNum).getPrice();
                                        System.out.println("[희귀] " + fishList.get(fishNum).getName() + " 을(를) 잡았다!");
                                        Thread.sleep(300);
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(300);

                                        // 낚시 실패 (낚싯대 10강시 randNum 최대값이 1000이 되므로 실패하지 않음)
                                    } else if (randNum <= 1100 && randNum > 1000) {
                                        System.out.println("물고기가 떡밥만 먹고 도망갔습니다...");
                                        bait--;
                                        System.out.println("남은 떡밥: " + bait + "개");
                                        System.out.println("");
                                        Thread.sleep(1000);
                                    }
                                    Thread.sleep(300);
                                }


                            } else if (select == 2 && bait == 0) { // 바다 자동 낚시 떡밥 없을 때
                                System.out.println("떡밥이 없습니다...");
                                System.out.println("");
                                System.out.println("[1] 가방 확인  [2] 나가기");
                                System.out.print(">>> ");
                                select = Integer.parseInt(scan.nextLine());
                                // 잡은 물고기 목록 보기
                                if (select == 1) {
                                    System.out.println("");
                                    System.out.println("==== 내 가방 ====");
                                    for (int i = 0; i < fishBag.size(); i++) {
                                        System.out.println(fishBag.get(i));
                                    }
                                    System.out.println("");
                                    System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                    System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                    System.out.println("남은 떡밥: " + bait + "개");
                                    System.out.println("");
                                    System.out.println("[1] 나가기");
                                    System.out.print(">>> ");
                                    select = Integer.parseInt(scan.nextLine());
                                    if (select == 1) {
                                        break sea;
                                    }
                                } else if (select == 2) {
                                    break sea;
                                }


                            } else if (select == 3) { // 바다 가방 확인
                                System.out.println("");
                                System.out.println("==== 내 가방 ====");
                                // 잡은 물고기 목록 보기
                                for (int i = 0; i < fishBag.size(); i++) {
                                    System.out.println(fishBag.get(i));
                                }
                                System.out.println("");
                                System.out.println("잡은 물고기: " + fishBag.size() + "마리");
                                System.out.println("가방 내 물고기 총액: " + bagMoney + "원");
                                System.out.println("남은 떡밥: " + bait + "개");
                                System.out.println("");

                            } else if (select == 4) {
                                break;
                            }
                        }
                        // 바다 낚시터 종료
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }
                }

            } else if (select == 2) {   // 장비 강화

                // 낚싯대 강화
                while (true) {
                    System.out.println("");
                    System.out.println("==== 장비 강화 ====");
                    System.out.println("");
                    System.out.println("[1] 낚싯대 강화  [2] 찌 강화  [3] 나가기");
                    System.out.print(">>> ");
                    select = Integer.parseInt(scan.nextLine());
                    if (select == 1) {
                        while (true) {

                            if (rod < 10) {
                                System.out.println("");
                                System.out.println("==== 낚싯대 강화 ====");
                                System.out.println("+" + rod + " 낚싯대를 +" + (rod + 1) + " 로 강화하시겠습니까? (Y/N)");
                                System.out.println("강화비: " + (100 + 100 * rod));
                                System.out.println("지갑 잔액: " + myMoney);
                                System.out.println("");
                                System.out.print(">>> ");

                                String yn;
                                yn = String.valueOf(scan.nextLine());
                                if (!(rod == 10) && (myMoney - 100 - (100 * rod)) > 0 && yn.equalsIgnoreCase("Y")) {   // 지갑의 돈이 강화비보다 많거나 같을 때 강화 가능
                                    // 지갑에서 강화비만큼 빼고 rod = rod + 1 로 강화수치 증가
                                    myMoney = myMoney - 100 - (100 * rod);
                                    rod = rod + 1;
                                    System.out.println("");
                                    System.out.println("==== +" + rod + " 낚싯대 강화 성공! ====");
                                    System.out.println("지갑 잔액: " + myMoney);
                                } else if (yn.equalsIgnoreCase("N")) {
                                    System.out.println("강화를 종료합니다.");
                                    break;
                                } else if (yn.equalsIgnoreCase("Y") && (myMoney - 100 - (100 * rod)) < 0) {
                                    System.out.println("강화비가 부족합니다.");
                                } else if (rod == 10) {
                                    System.out.println("더 이상 강화할 수 없습니다.");
                                    break;
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }

                            } else if (rod == 10) {
                                System.out.println("");
                                System.out.println("더 이상 강화할 수 없습니다.");
                                System.out.println("");
                                break;
                            } else {
                                System.out.println("잘못 입력하셨습니다.");
                            }


                        }

                        // 찌 강화
                    } else if (select == 2) {
                        while (true) {
                            if (fishFloat < 10) {
                                System.out.println("");
                                System.out.println("==== 낚시 찌 강화 ====");
                                System.out.println("+" + fishFloat + " 낚시 찌를 +" + (fishFloat + 1) + " 로 강화하시겠습니까? (Y/N)");
                                System.out.println("강화비: " + (100 + 100 * fishFloat));
                                System.out.println("지갑 잔액: " + myMoney);
                                System.out.println("");
                                System.out.print(">>> ");

                                String yn;
                                yn = String.valueOf(scan.nextLine());

                                if (!(fishFloat == 10) && (myMoney - 100 - (100 * fishFloat)) > 0 && yn.equalsIgnoreCase("Y")) {   // 지갑의 돈이 강화비보다 많거나 같을 때 강화 가능
                                    // 지갑에서 강화비만큼 빼고 fishFloat = fishFloat + 1 로 강화수치 증가
                                    myMoney = myMoney - 100 - (100 * fishFloat);
                                    fishFloat = fishFloat + 1;
                                    System.out.println("");
                                    System.out.println("==== +" + fishFloat + " 낚시 찌 강화 성공! ====");
                                } else if (yn.equalsIgnoreCase("N")) {
                                    System.out.println("강화를 종료합니다.");
                                    break;
                                } else if (yn.equalsIgnoreCase("Y") && (myMoney - 100 - (100 * fishFloat)) < 0) {
                                    System.out.println("강화비가 부족합니다.");
                                } else if (fishFloat == 10) {
                                    System.out.println("더 이상 강화할 수 없습니다.");
                                    break;
                                } else {
                                    System.out.println("잘못 입력하셨습니다.");
                                }

                            } else if (fishFloat == 10) {
                                System.out.println("");
                                System.out.println("더 이상 강화할 수 없습니다.");
                                System.out.println("");
                                break;

                            } else {
                                System.out.println("잘못 입력하셨습니다.");
                            }


                        }

                        // 강화 종료
                    } else if (select == 3) {
                        System.out.println("강화를 종료합니다.");

                        break;
                    }


                }

            } else if (select == 3) {   // 상점 (구매: 떡밥 / 판매: 가방 내 물고기(일괄))

                shop:
                while (true) {
                    System.out.println("");
                    System.out.println("==== 상점 ====");
                    System.out.println("");
                    System.out.println("[1] 떡밥 구매  [2] 물고기 판매  [3] 나가기");
                    System.out.print(">>> ");
                    select = Integer.parseInt(scan.nextLine());
                    // 구매 기능
                    if (select == 1) {  // 살 떡밥 개수를 입력하면 떡밥 가격 * 개수만큼 내 지갑에서 빠짐
                        // 구매하고싶은 총액이 내 지갑금액보다 많으면 구매 불가
                        System.out.println("");
                        System.out.println("==== 떡밥(" + baitPrice + "원) ====");
                        System.out.println("현재 잔액: " + myMoney + "원");
                        System.out.println("구매 가능 떡밥 개수: " + (myMoney / baitPrice) + "개");
                        System.out.println("구매할 개수를 입력해주세요.");
                        System.out.print(">>> ");
                        baitBuyNum = Integer.parseInt(scan.nextLine());
                        if ((baitBuyNum * baitPrice) <= myMoney) { // 구매 총액이 내 지갑금액보다 적으면 구매 가능
                            // 대충 지갑에서 돈 빠지고 떡밥 충전하는 내용
                            myMoney = myMoney - (baitBuyNum * baitPrice);
                            bait = bait + baitBuyNum;
                            System.out.println("");
                            System.out.println("떡밥 " + baitBuyNum + "개를 구매하였습니다.");
                            System.out.println("현재 보유 떡밥 수: " + bait + "개");
                            System.out.println("현재 잔액: " + myMoney + "원");
                        } else {
                            System.out.println("");
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
                        System.out.println("판매 완료!");
                        System.out.println("소지 금액: " + myMoney + "원");
                    } else if (select == 3) {
                        break shop;
                    } else {
                        System.out.println("잘못 입력하셨습니다.");
                    }

                }


            } else if (select == 4) {   // 가방
                System.out.println("");
                System.out.println("==== 내 가방 ====");
                // 잡은 물고기 목록 보기
                for (int i = 0; i < fishBag.size(); i++) {
                    System.out.println(fishBag.get(i));
                    sum += fishBag.get(i).getPrice();
                }
                System.out.println("");
                System.out.println("물고기 합계: " + sum + "원");
                System.out.println("지갑 합계: " + myMoney + "원");
            } else if (select == 5) {   // 종료
                System.out.println("낚시를 그만두었습니다..");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

            // 엔딩 이후 물고기 잡은 수, 떡밥 사용 수, 번 돈, 강화비용 등
            // if문 switch문으로 변환할 수 있게 해보기


        } // while 종료

    } // main 종료


} // class 종료
