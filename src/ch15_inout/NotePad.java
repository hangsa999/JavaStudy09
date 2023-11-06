package ch15_inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NotePad {

    public static void main(String[] args) {

        // 프로그램 실행 시
        // 파일명과 내용을 입력받아
        // /home/pc33/stuList 폴더 내에 해당 파일명으로 입력한
        // 내용이 들어간 텍스트 파일 생성하기
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("파일명");
            System.out.print(">>> ");
            String name = scan.nextLine();
            System.out.println("내용");
            System.out.print(">>> ");
            String msg = scan.nextLine();

            try (FileWriter writer = new FileWriter("/home/pc33/stuList/" + name + ".txt");){
                writer.write(msg);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            break;
        }
    }
}
