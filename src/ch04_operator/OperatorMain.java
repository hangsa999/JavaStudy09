package ch04_operator;

import java.util.SortedMap;

public class OperatorMain {

    public static void main(String[] args) {

        // 산술 연산자(Operator)
        int numA = 10;
        int numB = 3;

        // numA 에 1 더하기
        numA = numA + 1;
        System.out.println(numA);

        // numA 에 20 더하기
        numA = numA + 20;
        System.out.println(numA);

        // numA 에 21 빼기
        numA = numA - 21;
        System.out.println(numA);

        System.out.println("더하기 " + numA + numB);
        System.out.println("더하기 " + (numA + numB));
        System.out.println("빼기 " + (numA - numB));
        System.out.println("곱하기 " + (numA * numB));
        System.out.println("나누기 " + (numA / numB));
        System.out.println("나머지 " + (numA % numB));

        System.out.println("\n====================================\n");

        // 증감 연산자
        numA++; // 1 증가
        System.out.println(numA);

        numA--; // 1 감소
        System.out.println(numA);

        ++numA;; // 1 증가
        System.out.println(numA);   // 11

        System.out.println(numA++); // 11
        System.out.println(numA);   // 12

        System.out.println(++numA); // 13


        System.out.println("\n=====================================\n");

        // 대입 연산자
        numA = numA + 11;  // 산술
        numA++;           // 증감
        numA += 20;        // 대입

        System.out.println(numA);

        numA -= 30;
        System.out.println(numA);

        numA *= 3;
        System.out.println(numA);

        numA /= 5;
        System.out.println(numA);

        numA %= 5;
        System.out.println(numA);

        System.out.println("\n=====================================\n");

        // 문자열 더하기
        String subway = "반석역";

        subway = subway + " 지족역";
        System.out.println(subway);

        // 대입연산자 사용가능 (뒤에만 추가된다)
        subway += " 노은역";
        System.out.println(subway);

        subway = "대전지하철 " + subway + " 월드컵경기장역";
        System.out.println(subway);

        System.out.println("\n=====================================\n");

        // 형(Type) 변환
        // 형변환이 가능한 경우에 대해 형변환을 통해 상황에 맞게 적절히 사용할 수 있다.
        int intNum = 15;
        double doubNum = 1.23;

        System.out.println(intNum * doubNum);  // 18.45

        // int 곱하기, 나누기 double은 double 타입이 된다 (자동 형변환)
        double mulResult = intNum * doubNum;
        System.out.println(mulResult);

        // int 곱하기, 나누기 float은 float 타입이 된다
        float floatMul = intNum * 2.34f;
        System.out.println(floatMul);

        // 정수와 소수를 곱하거나 나누면 결과는 소수가 나온다.

        // 같은 정수타입, 같은 소수타입의 경우 메모리 크기만 허용된다면
        // 형변환이 가능하다.
        long longNum = 4356;
        /// int castLong = 4355L;  // 메모리 크기가 더 큰 long 에서 int 로는 자동 형변환 X
        int castlong = (int)3560000000L; // (타입) 값을 이용하여 강제 형변환이 가능하다.
        System.out.println(castlong); // 크기가 넘어가는 경우 제대로 된 값이 담기지 않는다.

        // 숫자와 문자열을 더하면
        // 숫자가 문자열로 자동형변환이 되어 문자열 이어붙이기가 된다.
        String month = "이번달 " + 9;

        // 강제 형변환
        int intCast = (int)3.976;
        System.out.println(intCast);  // 정수인 3만 담긴다.

        // 10 * 3.333 = 33.33
        // 정수인 33만 intMul 에 담기
        int intMul = (int)(10 * 3.333);  // 33
        System.out.println(intMul);

        int intMul1 = (int)3.333 * 10;   // 30
        System.out.println(intMul1);

        // 가장 많이 하는 실수
        System.out.println(10/3);  // 3
        // 10/3 -> 3.333333
        // 연산 값이 소수일지라도, 정수 타입이 유지되므로 정수만 출력

        double result = (double)10 / 3;
        System.out.println(result);  // 3.3333..로 출력되도록 형변환을 적용해보기

        // 프로그래밍에서 소수 연산의 정확도는 떨어진다
        // 하지만 대부분 소수 둘째, 셋째 자리까지 사용을 하기 때문에 상관하지 않아도 된다.
        // 정확한 소수 연산 꼭 필요하다면 다른 사람들이 만들어놓은 라이브러리를 가져다 쓰면 된다.

        // ** 숫자형 문자열을 정수로 형변환
        String strNum = "123";
        System.out.println(strNum + 2);

        int num= Integer.parseInt(strNum);
        System.out.println(num + 2);

        // 소수형 문자열을 소수 타입으로 형변환
        strNum = "23.45";
        double dnum = Double.parseDouble(strNum);
        System.out.println(dnum + 1.23);

        System.out.println("\n=====================================\n");


        // 나머지 연산자(%) 사용 예시

        // 홀수, 짝수 판별
        int anyNum = 7;

        // 2로 나눈 나머지가 0이면 짝수, 1이면 홀수
        System.out.println(anyNum % 2);



















    }
}
