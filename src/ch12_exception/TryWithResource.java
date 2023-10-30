package ch12_exception;

import java.util.Scanner;

public class TryWithResource {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        try {
//             Integer.parseInt(scan.nextLine())
//        } catch (Exception e) {
//            // 에러 처리
//            System.out.println("에러 발생");
//        }  finally {
//            // try 내부고크다 게러가 발생하든ㅁ 안하든 finally 내부는 실행
//            scan.close();
//        }

        // try-with-resource 구문
        // .close() 가 필요한 객체를 try() 소괄오 안에 선언 후
        // try(){} 중괄호 내에서 사용
        // 이후 별도로 .closer()를 작성하지 않아도 자동으로 닫힌다
        try (Scanner sca = new Scanner(System.in)) {
            System.out.println(sca.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // catch가 없다는 것은 딱 .close()만을 이용하겠다는 목적
        System.out.println(scan.nextLine());




    }

}
