package jiwoo.submit11.q02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static ch07_array.ArrayMain.printArray;

public class DateBoardMain {

    public static void main(String[] args) throws ParseException {
        // dbList에 랜덤 날짜를 가지는 DateBoard 객체 100개 삽입
        ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        for(int i = 0; i < 100; i++) {
            int randDay = (int)(Math.random() * 365) + 1;		// 1~365
            Calendar cal = Calendar.getInstance(); // 오늘날짜
            cal.add(Calendar.DATE, randDay * -1); // 오늘날짜에서 1~365 중 랜덤한 일수를 뺀다.

            String strDate = sdf.format(cal.getTime());
            dbList.add(new DateBoard((i+1) + "번째 생성된 글", strDate));
        }

//        for(int i = 0; i < dbList.size(); i++) {
//            System.out.println(dbList.get(i));
//        }

        // TODO 코드작성 시작 ~!!
        // System.out.println(dbList.get(0).getDate());    // 0번 인덱스 시간값(String)
        // System.out.println(dbList.size());              // dblist 리스트 갯수
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");


        System.out.println("날짜별로 정렬 후 출력(최신순)");

        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1; i++) {
                Date date1 = formatDate.parse(dbList.get(i).getDate());
                long num1 = date1.getTime();
                Date date2 = formatDate.parse(dbList.get(i+1).getDate());
                long num2 = date2.getTime();
                if (num1 < num2) {
                    DateBoard db = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, db);
                }   // 내부 if문 종료
            }   // 내부 for문 종료
        }   // 외부 for문 종료
        for (int i = 0; i < dbList.size(); i++){
            System.out.println(dbList.get(i));
        }

        System.out.println("");
        System.out.println("날짜별로 정렬 후 출력(오래된 순)");
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1; i++) {
                Date date1 = formatDate.parse(dbList.get(i).getDate());
                long num1 = date1.getTime();
                Date date2 = formatDate.parse(dbList.get(i+1).getDate());
                long num2 = date2.getTime();
                if (num1 > num2) {
                    DateBoard db = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, db);
                }   // 내부 if문 종료
            }   // 내부 for문 종료
        }   // 외부 for문 종료
        for (int i = 0; i < dbList.size(); i++){
            System.out.println(dbList.get(i));
        }

        System.out.println("");
        System.out.println("최근 한달 내 작성된 게시글");  // 오늘 기준 30일 전까지, 9.26 ~ 10.26


        // 이 부분은 date로 했는데 하루 차이가 날 수 있으니까 calendar로 해보기
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1; i++) {
                Date date1 = formatDate.parse(dbList.get(i).getDate());
                long num1 = date1.getTime();
                Date date2 = formatDate.parse(dbList.get(i+1).getDate());
                long num2 = date2.getTime();
                if (num1 > num2) {
                    DateBoard db = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, db);
                }   // 내부 if문 종료
            }   // 내부 for문 종료
        }   // 외부 for문 종료

        Date todayDate = new Date();
        long todayMillSec = todayDate.getTime();   // 현재 시간일 때 지나간 총 시간(밀리초)

        for (int i = 0; i < dbList.size(); i++){
            Date date1 = formatDate.parse(dbList.get(i).getDate());
            long num1 = date1.getTime();
            long diffMillSec = todayMillSec - num1;     // 밀리초 차이
            long diffSec = diffMillSec / 1000;          // 초 차이
            long diffMin = diffSec / 60;                // 분 차이
            long diffHour = diffMin / 60;               // 시간 차이
            long diffDate = diffHour / 24;              // 일 차이

            if (diffDate <= 30) {                        // 차이가 30일 이하일 때
                System.out.println(dbList.get(i));
            }
        }



        System.out.println("");
        System.out.println("이번 달에 작성된 게시물");        // 10월
        SimpleDateFormat sdfMonth = new SimpleDateFormat("MM");     // Date에서 몇월인지만 출력
        Date date = new Date();
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1; i++) {
                Date date1 = formatDate.parse(dbList.get(i).getDate());
                long num1 = date1.getTime();
                Date date2 = formatDate.parse(dbList.get(i+1).getDate());
                long num2 = date2.getTime();
                if (num1 > num2) {
                    DateBoard db = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, db);
                }   // 내부 if문 종료
            }   // 내부 for문 종료
        }   // 외부 for문 종료
        for (int i = 0; i < dbList.size(); i++) {
            Date monthCheck = formatDate.parse(dbList.get(i).getDate());
            if (sdfMonth.format(monthCheck).equals(sdfMonth.format(date))) {
            System.out.println(dbList.get(i));
            }
        }

        System.out.println("");
        System.out.println("6월에 작성된 게시물");
        for (int k = 0; k < dbList.size() - 1; k++) {
            for (int i = 0; i < dbList.size() - 1; i++) {
                Date date1 = formatDate.parse(dbList.get(i).getDate());
                long num1 = date1.getTime();
                Date date2 = formatDate.parse(dbList.get(i+1).getDate());
                long num2 = date2.getTime();
                if (num1 > num2) {
                    DateBoard db = dbList.get(i);
                    dbList.set(i, dbList.get(i + 1));
                    dbList.set(i + 1, db);
                }   // 내부 if문 종료
            }   // 내부 for문 종료
        }   // 외부 for문 종료
        for (int i = 0; i < dbList.size(); i++) {
            Date monthCheck = formatDate.parse(dbList.get(i).getDate());
            if (sdfMonth.format(monthCheck).equals("06")) {
                System.out.println(dbList.get(i));
            }
        }

        System.out.println("");
        System.out.println("23년 7월 14일 ~ 23년 8월 21일 사이 작성된 게시물");
        // String -> date -> 밀리초
        // 23년 7월 14일 00시 00분 밀리초 <= date 밀리초 < 23년 8월 22일 00시 00분 밀리초
        String startDay = "2023.07.14 00:00:00";
        String endDay = "2023.08.22 00:00:00";

        Date date230714 = formatDate.parse(startDay);
        Date date230822 = formatDate.parse(endDay);














    }
}


