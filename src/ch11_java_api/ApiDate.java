package ch11_java_api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class ApiDate {

    public static void main(String[] args) throws ParseException {
        // API 란? 완성된, 만들어져있는 코드를 가져다 쓰는 것
        // SDK 란? 프로그램 로직, 기술이 만들어져있으나
        // 그냥 가져다 쓰기보다는 가지고 와서 추가적인 개발을
        // 해서 써야하는 것

        // JDK 안에 만들어져있는 API 들 배우기

        // 현재 시간 구하기
        // 1. Date 클래스 사용
        Date dateToday = new Date();

        // Date 객체가 생성될 때 (= new Date() 실행)
        // Date 객체 내부에 new Date()가 실행되었을때의 시간이
        // 저장된다.

        // Tue Oct 24 10:27:21 KST 2023
        System.out.println(dateToday);

        // 날짜 포맷을 바꿔서
        // 2023-10-24 10:27:21 형태로 바꾸기
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        // sdf.format(Date 객체) 는 객체에 저장된 날짜를
        // 정해둔 날짜 포맷 형식으로 변환한 문자열을 리턴
        String strToday = sdf.format(dateToday);
        System.out.println(strToday);

        System.out.println("\n=======================================\n");

        // 2. Calendar 클래스 사용
        // .getInstance() 실행 시 새로운 객체가 생성된다.
        // 객체가 생성될 때의 시간이 저장된다.
        Calendar calToday = Calendar.getInstance();

        System.out.println(calToday);

        // Calendar 객체에서 Date 객체로 꺼내기
        Date calToDate = calToday.getTime();

        System.out.println(calToDate);
        System.out.println(sdf.format(calToDate));
        System.out.println(sdf.format(calToDate.getTime()));

        System.out.println("\n=======================================\n");

        // 3. System 클래스 사용
        // 현재 시간에 비해 밀리초 단위로 리턴
        // 1970년 1월 1일 0시부터 현재까지 경과된 시간을 밀리초 단위로 리턴
        long longToday = System.currentTimeMillis();
        System.out.println(longToday);

        System.out.println( sdf.format(longToday) );
        System.out.println( sdf.format(0l) );

        System.out.println("\n=======================================\n");

        // 다양한 날짜 타입 만들기
        // 1. 2023/10/24 11:04:30
        // 2. 2023-10-24 오전 11:04:30
        // 3. 화요일 11:04:30
        // @ 2023.10.24 AM 11:04:30

        Date dateNow = new Date();


        sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        System.out.println(sdf.format((dateNow)));

        sdf = new SimpleDateFormat("yy-MM a hh:mm:ss");
        System.out.println(sdf.format((dateNow)));

        sdf = new SimpleDateFormat("E hh:mm:ss");
        System.out.println(sdf.format((dateNow)));

        sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
        System.out.println(sdf.format((dateNow)));

        sdf = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.ENGLISH);
        System.out.println(sdf.format((dateNow)));

        // 현재 미국 날짜를 2023.10.24 AM 01:04:30 형식으로 출력하기
        TimeZone time;
        Date date1 = new Date();
        DateFormat df = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
        time = TimeZone.getTimeZone("GMT-4");
        df.setTimeZone(time);
        System.out.println(df.format(date1));

        System.out.println("\n=======================================\n");

        // 날짜형 문자열(String) -> Date 객체로 변환
        String strTomorrow = "2023-10-25 20:12:45";

        // SimpleDateFormat 에 문자열과 같은 형태의 포맷 설정
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 해당 날짜형 문자열의 날짜가 저장된 Date 객체 리턴
        // sdf의 날짜 포맷과 날짜형 문자열의 형식이 하나라도 다르면 에러 발생
        Date dateTomorrow = sdf.parse(strTomorrow);

        System.out.println(dateTomorrow);

        String strTime = "11:48:32";
        sdf = new SimpleDateFormat("HH:mm:ss");
        Date dateTime = sdf.parse(strTime);
        System.out.println(dateTime);   // Thu Jan 01 11:48:32 KST 1970

        System.out.println("\n=======================================\n");

        // 날짜 세팅하기
        Calendar cal = Calendar.getInstance();

        // 98년 12월 02일
        // 여기서 month 부분은 1월이 0, 2월이 1, ..., 12월 11
        cal.set(1998, 11, 2, 14, 20, 20);

        sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));

        // Date 타입의 객체를  Calendar 타입으로 변환
        Date temp = new Date();
        Calendar calTemp = Calendar.getInstance();
        calTemp.setTime(temp);  // Date 객체의 시간이 calendr 객체에 저장된다.

        System.out.println(sdf.format(calTemp.getTime()));

        // 날짜 꺼내기

        // 년도
        System.out.println(calTemp.get(Calendar.YEAR)); // 1이라는 숫자에 대해 네이밍이 주어진 상태
        // 월
        System.out.println(calTemp.get(Calendar.MONTH));




        System.out.println("\n=======================================\n");


        // 날짜 연산
        String oneDay = "2023.10.24 12:21:32";
        String twoDay = "2023.11.21 11:11:22";

        sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date oneDate = sdf.parse(oneDay);
        Date twoDate = sdf.parse(twoDay);

        // Date 객체에 .getTime() 하면 그 밀리초가 나옴

        System.out.println(oneDate.getTime());
        System.out.println(twoDate.getTime());

        long diffMillSec = twoDate.getTime() - oneDate.getTime();
        System.out.println(diffMillSec + "밀리초 차이");

        // 1초 = 1000밀리초
        // diffMillSec / 1000 => 초 단위
        long diffSec = diffMillSec / 1000;
        System.out.println(diffSec + "초 차이");

        // 1분 = 60초
        // diffSec / 60 => 분 단위
        long diffMin = diffSec / 60;
        System.out.println(diffMin + "분 차이");

        // 1시간 = 60분
        // diffMin / 60 => 시간 단위
        long diffHour = diffMin / 60;
        System.out.println(diffHour + "시간 차이");

        // 1일 = 24시간
        // diffHour / 24 => 일 단위
        long diffDate = diffHour / 24;
        System.out.println(diffDate + "일 차이");

        // 한 줄로 며칠 차이인지 확인
        long diff = diffMillSec / 1000 / 60 / 60 / 24;
        System.out.println(diff + "일 차이");

        System.out.println("\n=======================================\n");

        // 디데이 계산기
        // 디데이 계산기
        // 2023.09.18 에 대해 +37
        // 2023.11.03 에 대해 -9
        // 2023.10.26 에 대해 +2
        // 2023.10.22 에 대해 -2
        // 이 출력되는 디데이 계산기를 만들어보기

        // 오늘 날짜에 대한 Date 객체 생성 후
        // 1. welcomeDay 와 날짜 연산
        // 2. together 와 날짜 연산

        String welcomeDay = "2023.09.18";
        String together = "2023.11.03";
        String twoTwo = "2023.10.26";
        String mTwoTwo = "2023.10.22";

        Date todayDate = new Date();

        sdf = new SimpleDateFormat("yyyy.MM.dd");
        String today = sdf.format(todayDate);
        Date today1 = sdf.parse(today);
        Date welcomeDate = sdf.parse(welcomeDay);
        Date togetherDate = sdf.parse(together);
        Date twoTwoDate = sdf.parse(twoTwo);
        Date mTwoTwoDate  = sdf.parse(mTwoTwo);

        System.out.println(welcomeDate.getTime());
        System.out.println(togetherDate.getTime());
        System.out.println(twoTwoDate.getTime());
        System.out.println(mTwoTwoDate.getTime());

        // 9.18
        diffMillSec = (today1.getTime() - welcomeDate.getTime()) / 1000 / 60 / 60 / 24;
        if (diffMillSec < 0) {
            diffMillSec = ((today1.getTime() - welcomeDate.getTime()) / 1000 / 60 / 60 / 24);
            System.out.println("D" + diffMillSec);
        } else {
            diffMillSec = (today1.getTime() - welcomeDate.getTime()) / 1000 / 60 / 60 / 24;
            System.out.println("D+" + diffMillSec);
        }

        // 11.03
        diffMillSec = (today1.getTime() - togetherDate.getTime()) / 1000 / 60 / 60 / 24;
        if (diffMillSec < 0) {
            diffMillSec = ((today1.getTime() - togetherDate.getTime()) / 1000 / 60 / 60 / 24);
            System.out.println("D" + diffMillSec);
        } else {
            diffMillSec = (today1.getTime() - togetherDate.getTime()) / 1000 / 60 / 60 / 24;
            System.out.println("D+" + diffMillSec);
        }

        // 10.22
        diffMillSec = (today1.getTime() - twoTwoDate.getTime()) / 1000 / 60 / 60 / 24;
        if (diffMillSec < 0) {
            diffMillSec = ((today1.getTime() - twoTwoDate.getTime()) / 1000 / 60 / 60 / 24);
            System.out.println("D" + diffMillSec);
        } else {
            diffMillSec = (today1.getTime() - twoTwoDate.getTime()) / 1000 / 60 / 60 / 24;
            System.out.println("D+" + diffMillSec);
        }

        // 10.26
        diffMillSec = (today1.getTime() - mTwoTwoDate.getTime()) / 1000 / 60 / 60 / 24;
        if (diffMillSec < 0) {
            diffMillSec = ((today1.getTime() - mTwoTwoDate.getTime()) / 1000 / 60 / 60 / 24);
            System.out.println("D" + diffMillSec);
        } else {
            diffMillSec = (today1.getTime() - mTwoTwoDate.getTime()) / 1000 / 60 / 60 / 24;
            System.out.println("D+" + diffMillSec);
        }

        System.out.println("\n=======================================\n");

        // Calendar 날짜 연산
        // 특정 날짜를 기준으로 날짜를 더하거나 뺄 때 유용
        Calendar toCal = Calendar.getInstance();
        System.out.println(sdf.format(toCal.getTime()));

        // 3일 뒤
        toCal.add(Calendar.DATE, 3);
        System.out.println(sdf.format(toCal.getTime()));

        // 20일 뒤
        toCal.add(Calendar.DATE, 20);
        System.out.println(sdf.format(toCal.getTime()));

        // 7일 전
        toCal.add(Calendar.DATE, -7);
        System.out.println(sdf.format(toCal.getTime()));

        // 10달 뒤
        toCal.add(Calendar.MONTH, 10);
        System.out.println(sdf.format(toCal.getTime()));

        System.out.println("\n=======================================\n");

        // 달력 만들기
        int year = 2023;
        int month = 10;

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, 1);
        System.out.println(sdf.format(calendar.getTime()));

        // 1일이 무슨 요일에 시작하는지 알아야 함
        // 1: 일요일, 2: 월요일, ..., 7: 토요일
        int startDay = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(startDay);

        // 해당 월의 마지막 일자가 몇일인지 알아야 함
        int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastDay);

        System.out.println(year + "년 " + month + "월 달력");
//        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("월\t화\t수\t목\t금");


        for (int i = 1; i <= 42; i++) {
            // i가 startDay보다 작으면 출력 안함
            if (i < startDay) {
                System.out.print("\t");
            } else if (!(i % 7 == 0 || i % 7 == 1)){
                // startDay가 3이라면
                // i 는 3일때 처음 들어온다.
                // i = 3 ->1
                // i = 4 ->2
                // i = 5 ->2

                // startDay가 4라면
                // i 는 4일때 처음 들어온다.
                // i = 4 -> 1
                // i = 5 -> 2
                // i - startDay -> 2
                int currentDay = i - startDay + 1;

                // currentDay가 lastDay보다 크면 for문 종료
                if (currentDay > lastDay) {
                    break;
                }

//                System.out.print(currentDay + "\t");
                System.out.printf("%2d\t", currentDay);
            }

            // i가 7, 14, 21, 28, ... 일 때 줄 바꾸기
            if (i % 7 == 0) {
                System.out.println();
            }

        }

        System.out.println("\n=======================================\n");

        // 주말이 제외된 달력을 만들어보기






    }
}
