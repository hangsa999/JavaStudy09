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

        return (int)((Math.random() * (b-a+1) )+a);
        // 20,40 = ?
        // (int)((Math.random() * 40-20+1)+20); => 20부터 40까지
        // 17, 17 = ??
        // (int)((Math.random() * 17-17+1)+17); => 17부터 17까지
        // 1, 1100 = ???
        // (int)((Math.random() * 1100 - 1 + 1)+1); => 1부터 1100까지
        // 22, 26 = ?
        // (int)((Math.random() * 26 - 22 + 1)+22); => 22부터 26까지
    }



}
