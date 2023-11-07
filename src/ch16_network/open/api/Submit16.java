package ch16_network.open.api;

import java.util.Scanner;

public class Submit16 {

    public static void main(String[] args) {

        MedicineService medicineService = MedicineService.getInstance();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("증상을 이야기해주세요 [종료: q]");
            System.out.print(">>> ");
            String command = scan.nextLine();
            if (command.equals("q")) {
                System.out.println("종료합니다.");
                break;
            } else {
                System.out.println("약국에 가서 아래의 약들을 요청하세요.");
                System.out.println("제목: ");
            }


        }




    }

}
