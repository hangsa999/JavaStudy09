package jiwoo.submit11.q01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BoardMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList boardList = new ArrayList();

        int num = 0;
        String title = "";
        String date = "";
        String detail = "";

        post : while (true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
            System.out.print(">>> ");
            int select = Integer.parseInt(scan.nextLine());
            if (select == 1) { // 글 목록
                for (int i = 0; i < boardList.size(); i++) {
                    System.out.println(boardList.get(i));
                }
            } else if (select == 2) { // 글 쓰기
                num = num + 1;
                System.out.print("글 제목을 입력해주세요: ");
                title = scan.nextLine();
                System.out.print("글 내용을 입력해주세요: ");
                detail = scan.nextLine();
                Date nowDate = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
                date = sdf.format(nowDate);
                Board board = new Board(num, title, date, date);
                boardList.add(board);
            }


        }


    }
}
