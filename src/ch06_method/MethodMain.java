package ch06_method;

public class MethodMain {

    public static void main(String[] args) {
        // 메소드 - method = 함수 = function
        // 굳이 나누자면
        // 메소드는 클래스에 종속된 함수를 말하며,
        // 함수는 클래스에 독립적인 함수를 말한다. (신경쓰지 않아도 된다)

        // 1부터 100까지 다 더하면 결과는?
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 30; i <= 60; i++) {
            sum += i;
        }
        System.out.println(sum);

        sum = 0;
        for (int i = 25; i <= 50; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("\n================================\n");

//        sum = 0;
//        for (int i = a; i <= b; i++) {
//            sum += i;
//        }
//        System.out.println("a부터 b까지 더한 결과: " + sum);

        // 위 작업을 메소드로 만들기
        // a부터 b까지 더한 결과는?

        // 함수의 실행 -> 함수명();
        System.out.println("printSum 실행 전");
        printSum(10, 20);
        System.out.println("printSum 실행 후");

        printSum(70, 90);
        printSum(5, 20);

        // 함수를 쓰면 좋은점
        // 실행부의 코드가 간결해진다(= 가독성이 좋아진다)
        // 중복된 코드를 한 곳에서 관리할 수 있으므로
        // 수정이 용이하다.

        // 리턴값이 존재하는 함수?
        String fruits = "Apple";
        fruits.substring(1, 3);

        // 리턴값이 존재하는 함수 만들기
        returnSum(1, 3); // 실행만 하고 리턴값을 사용하지 않는 상황
        System.out.println(returnSum(1, 3));

        // 리턴값을 변수에 담을 수 있다.
        int num = returnSum(1, 3);
        System.out.println(num);

        // 리턴값이 없으면(void) 변수에 담을 수 없다.
        // int n = printSum(1, 3);

        System.out.println("\n================================\n");

        // System.out.println(); 을 파이썬처럼 print() 로 만들어 쓰기
        System.out.println("우리의 println");
        print("우리의 println");

        System.out.println(returnSum(1, 3));
        print(returnSum(1, 3));

        System.out.println("\n================================\n");

        // Math.abs() : 절대값을 리턴해주는 함수
//        int rst = Math.abs(-10); // = 10
//        System.out.println(rst);
//
//        rst = myAbs(-10);
//        System.out.println(rst);
        myAbs(-121);

        System.out.println("\n================================\n");

        // makeCard 메소드 만들기
        // 파라미터로 이름, 국영수 점수를 넣으면
        // 이름: 유민
        // 국어: 90
        // 영어: 87
        // 수학: 79
        // 평균: 85.33
        // 등급: B
        // ==================
        // 위와 같이 콘솔창에 성적표가 출력되도록 한다.
        // 평균이 90점 이상이면 A, 80점 이상이면 B, 그 외 C

        makeCard("유민", 90, 87, 79);


        myRound(3.141592, 2);

    }   // main 메소드 끝

    public static void makeCard(String name, int kor, int eng, int math) {
        System.out.println("이름: " + name);
        System.out.println("국어: " + kor);
        System.out.println("영어: " + eng);
        System.out.println("수학: " + math);

        double avg = (kor + eng + math) / 3.0;
        // avg를 소수 둘째자리까지 나오게 하기
        // 소수 셋째자리에서 반올림
        // Math.round() 는 소수 첫째자리에서 반올림한 정수값을 리턴
        avg = myRound(avg, 3);

        System.out.println("평균: " + avg);

        String deg = "";
        if (avg >= 90) {
            deg = "A";
        } else if (avg >= 80) {
            deg = "B";
        }
        System.out.println("등급: " + deg);

        System.out.println("==================");
    }

    /**
     * 입력한 소수를 소수 n번째 자리로 반올림하여 리턴해주는 함수
     * @param num   반올림하고자 하는 소수
     * @param n     소수 n번째 자리를 지정하는 정수
     * @return      반올림된 소수 리턴
     */
    public static double myRound(double num, int n) {
        // Math.round() 는 소 첫째자리에서 반올림한 정수를 리턴

        // 3.141592
        // Math.round(3.141592) => 3 리턴

        // 3.141592 에 10을 곱함 => 31.41592
        // Math.round(31.41592) => 31 리턴
        // 리턴값에 10을 나눔 (10의 1승) => 3.1

        // 3.141592 에 100을 곱함 => 314.1592
        // Math.round(314.1592) => 314 리턴
        // 리턴값에 100을 나눔 (10의 2승) => 3.14

        // num = num * Math.pow(10, n);
        // num = Math.round(num);
        // num = num / Math.pow(10, n);
        // System.out.println(num);
        // return num;
        int one = 1;
        // one에 10을 n번 곱함
        for (int i = 0; i < n; i++) {
            one *= 10;
        }
        return (double)Math.round(num * one) / one;
    }



    public static int myAbs(int num) {
        if (num < 0){
            // num = 음수일 때만 실행
            System.out.println(num *= -1);
        } else {
            System.out.println(num);
        }
        return num;
    }

    public static void print(String word) {
        System.out.println(word);
    }

    // 기본적으로 변수와 같이 메소드명은 중복 선언할 수 없다.
    // 하지만 하나의 클래스 내에서
    // 파라미터가 다르게 선언하면 중복 선언할 수 있다.
    // = 메소드 오버로딩 (Method Overloading)
    public static void print(int word) {
        System.out.println(word);
    }

    public static void print(double word) {
        System.out.println(word);
    }
    // 메소드의 선언
    // public : 접근 제어자
    // static : 정적 메소드 선언
    // void : 함수의 리턴값이 없음을 의미 (리턴값이 있으면 이 자리에 리턴값의 타입을 적어준다)입
    // printSum은 함수명을 의미 (선언한 메소드를 실행 시 함수명을 이용)
    // 소괄호() 안에는 입력받을 파라미터를 선
    public static void printSum(int startNumber, int endNumber) {
        int sum = 0;
        // 메소드가 실행될 때 a, b 값을 받아야 한다 => 파라미터에 기
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        System.out.println(startNumber + "부터 " + endNumber + "까지 더한 결과 : " + sum);
    }

    public static int returnSum(int startNumber, int endNumber) {
        int sum = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            sum += i;
        }
        // sum 값을 리턴
        return sum;
    }



}
