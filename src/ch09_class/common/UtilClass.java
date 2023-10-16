package ch09_class.common;

// 유용한 함수들을 제공하는 클래스
public class UtilClass {
    /**
     * 입력한 소수를 소수 n번째 자리로 반올림하여 리턴해주는 함수
     * @param num   반올림하고자 하는 소수
     * @param n     소수 n번째 자리를 지정하는 정수
     * @return      반올림된 소수 리턴
     */
    public static double myRound(double num, int n) {
    int one = 1;
    for (int i = 0; i < n; i++) {
        one *= 10;
    }
    return (double)Math.round(num * one) / one;
}

    /**
     * a부터 b사이의 랜덤 정수를 리턴하는 메소드
     * @param a 시작 정수
     * @param b 최대 정수
     * @return 정수 리턴
     */
    public static int makeRandom(int a, int b) {

        return (int)((Math.random() * b-a+1) + 1);

    }



}
