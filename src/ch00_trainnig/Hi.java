package ch00_trainnig;

import java.util.Scanner;

public class Hi {

    public static void main(String[] args) {

//        System.out.println("\n======== Q. 01 ========\n");
//
//        String name = "홍길동";
//        int age = 26;
//        double height = 177.9;
//        String phone = "01073987332";
//        String email = "akow283@gmail.com";
//
//        System.out.println("이름: " + name);
//        System.out.println("나이: " + age);
//        System.out.println("키: " + height);
//        System.out.println("연락처: " + phone);
//        System.out.println("이메일: " + email);
//
//
//        System.out.println("\n======== Q. 02 ========\n");
//
//        String enigma = "너오구늘리뭐너먹구지리";
//
//        enigma = enigma.replace("너", "");
//        System.out.println(enigma);
//
//        enigma = enigma.replace("구", "");
//        System.out.println(enigma);
//
//        enigma = enigma.replace("리", "");
//        System.out.println(enigma);
//
//
//        System.out.println("\n======== Q. 03 ========\n");
//
//        String littlePrince = "나는 그때 아무것도 이해하지 못했어. 꽃의 말이 아닌 행동을 보고 판단했어야 했어. 내게 향기를 전해주고 즐거움을 주었는데, 그 꽃을 떠나지 말았어야 했어. 그 허영심 뒤에 가려진 따뜻한 마음을 보았어야 했는데, 그때 난 꽃을 제대로 사랑하기에는 아직 어렸던 거야.";
//
//        String target = "허영심 뒤에 가려진 따뜻한 마음";
//
//        // System.out.println(littlePrince.indexOf(target));
//        // System.out.println(target.length());
//
//        System.out.println(littlePrince.substring(littlePrince.indexOf(target), littlePrince.indexOf(target)+target.length()));
//
//        String fruits = "Apple, Banana, Cherry";
//        System.out.println(fruits);
//
//        System.out.println(fruits.length());
//        System.out.println("Apple, Banana, Cherry".length());
//
//        char p = fruits.charAt(2);
//        System.out.println(p);
//
//        System.out.println(fruits.indexOf("Banana"));
//
//        System.out.println(fruits.substring(7));
//
//        String world = "  The New World !!   ";
//        System.out.println(world.replace(" ", ""));
//        System.out.println(world.trim());
//
//        // 대소문자 관련
//        System.out.println(world.toUpperCase());
//        System.out.println(world.toLowerCase());
//
//        System.out.println(world);
//        System.out.println(world.contains("New"));
//        System.out.println(world.contains("new"));
//        System.out.println(world.toLowerCase().contains("nEW".toLowerCase()));
//
//        // 여백 제거 + 단어 추가
//        System.out.println(world.trim().concat("!!!"));
//        System.out.println(world.trim() + "!!!");
//
//        world = world.trim() + "!!!!!";
//        System.out.println(world.trim());
//
//        // 빈 문자열(Empty)과 Null(본체가 없음)은 다르다
//        String nothing = "";
//        System.out.println(nothing);
//        System.out.println(nothing.length());
//
//        String nullthing = null;
//        System.out.println(nullthing);
//
//        // println 은 줄바꿈을 자동으로 해준다
//        System.out.println("상단");
//        System.out.println("중단");
//        System.out.println();
//        System.out.println("하단");
//
//        // print 는 오직 값만을 출력 (줄바꿈 X)
//        System.out.print("print");
//        System.out.print("줄바꿈X");

//        System.out.println("\n===============23-09-21===============\n");
//
//        // 줄바꿈 ln, \n 등
//        System.out.println("오 목\n\n\n\n\n\n\n\n");
//        System.out.println();
//        System.out.println("오 목?");
//
//        // 기능문 출력은 \ 뒤에
//        System.out.println("쌍따옴표 : \"");
//        System.out.println("역슬래시 : \\");
//        // 특문 출력 가능
//        System.out.println("★");
//
//        // printf(); 문자열 뒤 f (포맷 문자열, format string)
//        // %d double, %s String
//        System.out.printf("안녕 printf야?\n");
//        System.out.printf("%d명 4일째 수업중\n", 9);
//        System.out.printf("%d명 %d일째 수업중\n", 9, 4);
//        System.out.printf("%d명 %d일째 %s중\n\n", 9, 4, "수업");
//        // %05d = 0을 5자리까지 출력
//        // %.4f = 소수점 4자리까지 출력
//        System.out.printf("ch%02d_표준입출력\n", 3);
//        System.out.printf("ch%05d_표준입출력\n", 3);
//        System.out.printf("원주율 = %.1f\n", 3.14152);
//        System.out.printf("원주율 = %.4f\n", 3.14152);
//        // 원 단위 = 3자리마다 콤마(,)
//        System.out.printf("통장 잔고 : %,d 원", 100000);
//
//        System.out.println("\n================================\n");
//
//        // 표준 입력
//        // 객체는 참조타입을 담는 변수
//        Scanner scan = new Scanner(System.in);
//        String str = new String("오늘 비옴?");
//        System.out.println(str);
//        System.out.println(scan);
//
//        System.out.print("이름 : ");
//        String name = scan.nextLine();
//        System.out.println(name + "님, 환영합니다.");
//
//        System.out.print("나이 : ");
////        System.out.println("나이 : " + age + " 세");
////
////        System.out.print("키 : ");
////        String height = scan.nextLine();
////        System.out.println("키 : " + height + "cm");
//
//        // nextLine() 은 문자열 타입으로 리턴한다.
//        // ex) 30 입력 시 "30" 으로 가져옴
//        // 그래서 숫자를 가져올 땐
//        // Integer.parseInt(scan.nextLine()); 사용
//        int Age = Integer.parseInt(scan.nextLine());
//
//        System.out.println("입력하신 나이는 " + (Age - 1) + "세 입니다");
//
//        // 산술 연산자(Operator)
//        int numA = 10;
//        int numB = 3;
//
//        // numA 에 1 더하기
//        numA = numA + 1;
//        System.out.println(numA);
//
//        // numA 에 20 더하기
//        numA = numA + 20;
//        System.out.println(numA);
//
//        // numA 에 21 빼기
//        numA = numA - 21;
//        System.out.println(numA);
//
//        System.out.println("더하기 " + numA + numB);
//        System.out.println("더하기 " + (numA + numB));
//        System.out.println("빼기 " + (numA - numB));
//        System.out.println("곱하기 " + (numA * numB));
//        System.out.println("나누기 " + (numA / numB));
//        System.out.println("나머지 " + (numA % numB));
//
//        // 증감 연산자
//        numA++; // 1 증가
//        System.out.println(numA);
//
//        numA--; // 1 감소
//        System.out.println(numA);
//
//        ++numA;; // 1 증가
//        System.out.println(numA);   // 11
//
//        System.out.println(numA++); // 11
//        System.out.println(numA);   // 12
//
//        System.out.println(++numA); // 13
//
//        // 대입 연산자
//        numA = numA + 11;  // 산술
//        numA++;           // 증감
//        numA += 20;        // 대입
//
//        System.out.println(numA);
//
//        numA -= 30;
//        System.out.println(numA);
//
//        numA *= 3;
//        System.out.println(numA);
//
//        numA /= 5;
//        System.out.println(numA);
//
//        numA %= 5;
//        System.out.println(numA);
//
//        // 문자열 더하기
//        String subway = "반석역";
//
//        subway = subway + " 지족역";
//        System.out.println(subway);
//
//        // 대입연산자 사용가능 (뒤에만 추가된다)
//        subway += " 노은역";
//        System.out.println(subway);
//
//        subway = "대전지하철 " + subway + " 월드컵경기장역";
//        System.out.println(subway);
//
//        // 형변환
//        int intNum = 15;
//        double doubNum = 1.23;
//        System.out.println(intNum * doubNum);  // 18.45
//
//        // int 곱하기, 나누기 double은 double 타입이 된다 (자동 형변환)
//        double mulResult = intNum * doubNum;
//        System.out.println(mulResult);
//
//        // int 곱하기, 나누기 float은 float 타입이 된다.
//        float floatMul = intNum * 2.34f;
//        System.out.println(floatMul);
//
//        // 정수와 소수를 곱하거나 나누면 결과는 소수가 나온다.
//
//        // 같은 정수타입, 같은 소수타입의 경우 메모리 크기만 허용된다면
//        // 형변환이 가능하다.
//        long longNum = 4356;
//        /// int castLong = 4355L;  // 메모리 크기가 더 큰 long 에서 int 로는 자동 형변환 X
//        int castlong = (int)3560000000L; // (타입) 값을 이용하여 강제 형변환이 가능하다.
//        System.out.println(castlong); // 크기가 넘어가는 경우 제대로 된 값이 담기지 않는다.
//
//        // 숫자와 문자열을 더하면
//        // 숫자가 문자열로 자동형변환이 되어 문자열 이어붙이기가 된다.
//        String month = "이번달 " + 9;
//
//        // 강제 형변환 (int)
//        int intCast = (int)3.976;
//        System.out.println(intCast);  // 정수인 3만 담긴다.
//
//        // 10 * 3.333 = 33.33
//        // 정수인 33만 intMul 에 담기
//        int intMul = (int)(10 * 3.333);  // 33
//        System.out.println(intMul);
//        // (int) 는 소수를 정수로 먼저 만든 뒤 계산한다.
//        int intMul1 = (int)3.333 * 10;   // 30
//        System.out.println(intMul1);
//
//        // 가장 많이 하는 실수
//        System.out.println(10/3);  // 3
//        // 10/3 -> 3.333333
//        // 연산 값이 소수일지라도, 정수 타입이 유지되므로 정수만 출력
//
//        // 3.3333..로 출력되도록 형변환을 적용해보기
//        double result = (double)10 / 3;
//        System.out.println(result);
//
//        // (중요) 숫자인 문자열을 정수로 형변환
//        String strNum = "123";
//        System.out.println(strNum + 2);
//
//        int num= Integer.parseInt(strNum);
//        System.out.println(num + 2);
//
//        // 소수형 문자열을 소수 타입으로 형변환
//        strNum = "23.45";
//        double dnum = Double.parseDouble(strNum);
//        System.out.println(dnum + 1.23);

//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("이름을 입력해주세요.");
//        System.out.print(">>> ");
//        String name = scan.nextLine();
//
//        System.out.println("국어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        double kr = Integer.parseInt(scan.nextLine());
//
//
//        System.out.println("영어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        double en = Integer.parseInt(scan.nextLine());
//
//        System.out.println("수학 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        double math = Integer.parseInt(scan.nextLine());
//
//        double avg = (kr + en + math) / 3;
//
//        System.out.println("이름: " + name);
//        System.out.printf("국어: " + "%.0f\n", kr);
//        System.out.printf("영어: " + "%.0f\n", en);
//        System.out.printf("수학: " + "%.0f\n", math);
//        System.out.printf("평균: " + "%.3f\n", avg);
//
//        System.out.println("\n=====================================\n");
//
//        int example = 278;
//        System.out.println(example);
//        String ex= "0" + example;
//
//        System.out.println(ex);
//
//        System.out.println(ex.substring(1,2));
//        System.out.println(ex.substring(2,3));
//        System.out.println(ex.substring(3,4));
//
//        int ex1 = Integer.parseInt(ex.substring(1,2));
//        int ex2 = Integer.parseInt(ex.substring(2,3));
//        int ex3 = Integer.parseInt(ex.substring(3,4));
//
//        System.out.println(ex1 + ex2 + ex3);
//
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("이름을 입력해주세요.");
//        System.out.print(">>> ");
//        String name = scan.nextLine();
//
//        System.out.println("국어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        int kr = Integer.parseInt(scan.nextLine());
//
//        System.out.println("영어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        int en = Integer.parseInt(scan.nextLine());
//
//        System.out.println("수학 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        int math = Integer.parseInt(scan.nextLine());
//
//        double avg = ((double)(kr + en + math) / 3);
//
//        System.out.println("이름: " + name);
//        System.out.println("국어: " + kr);
//        System.out.println("영어: " + en);
//        System.out.println("수학: " + math);
//        System.out.printf("평균: " + "%.2f", avg);
//
//          System.out.println("\n====================Q. 02=================\n");
//
//          int example = 278;
//
//          String ex = example + "";
//
//          String ex1 = ex.substring(0,1);
//          String ex2 = ex.substring(1,2);
//          String ex3 = ex.substring(2,3);
//
//          int ex11= Integer.parseInt(ex1);
//          int ex22= Integer.parseInt(ex2);
//          int ex33= Integer.parseInt(ex3);
//
//          System.out.println(ex11 + ex22 + ex33);





    }
}
