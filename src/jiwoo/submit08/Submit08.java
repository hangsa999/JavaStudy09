package jiwoo.submit08;

import java.util.*;

public class Submit08 {

    public static void main(String[] args) {

        System.out.println("\n==================== Q.01 ====================\n");

//        다른 방법 1
//        HashSet<Integer> makeLotto = new HashSet<Integer>();
//
//        int rand = 0;
//
//        while (true) {
//
//            rand = (int)(Math.random() * 45 + 1);
//
//            makeLotto.add(rand);
//
//            if (makeLotto.size() == 6) {
//
//                break;
//
//            }
//
//        }
//
//        System.out.println(makeLotto);

//        ArrayList<Integer> myLotto = makeLotto();
//        System.out.println(myLotto);
//        HashSet<Integer> makeLotto = new HashSet<Integer>();
//
//        for (int i = 0; i < 6; i++) {
//
//            int rand = (int) (Math.random() * 45 + 1);
//
//            makeLotto.add(rand);
//
//        }
//
//        System.out.println(makeLotto);

        ArrayList<Integer> myLotto = makeLotto();

        System.out.println(myLotto);

        System.out.println("\n==================== Q.02 ====================\n");

        HashMap<String, String> infoMap = new HashMap<>();

        infoMap.put("a001", "1234a");
        infoMap.put("b001", "1234b");
        infoMap.put("c001", "1234c");
        infoMap.put("d001", "1234d");
        infoMap.put("e001", "1234e");

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("아이디를 입력해주세요.");
            System.out.print(">>> ");
            String id = scan.nextLine();

            System.out.println("비밀번호를 입력해주세요.");
            System.out.print(">>> ");
            String password = scan.nextLine();


//            if (infoMap.get(id) != null) {
//                if (infoMap.get(id).equals(password)) {
//                    System.out.println("로그인 성공");
//                    break;
//                }
//            } else if () {
//
//            } else {
//                System.out.println("존재하지 않는 아이디입니다.");
//            }

            if (password.equals(infoMap.get(id))) {
                // 로그인 성공
                System.out.println("로그인 성공");
                break;
            } else {
                System.out.println("아이디 혹은 비밀번호가 틀립니다.");
            }

        }




//
//            if (infoMap.containsKey(id) && infoMap.containsValue(password)) {
//
//                System.out.println("로그인 성공");
//
//            } else if (!infoMap.containsKey(id)) {
//
//                System.out.println("존재하지 않는 아이디입니다.");
//
//            } else if (infoMap.containsKey(id) && !infoMap.containsValue(password)) {
//
//                System.out.println("비밀번호가 틀렸습니다.");
//
//            }

//        System.out.println("\n==================== Q.02 ====================\n");
//
//        // 로또를 몇장 구메헤애 딩첨이 될까?
//        // 로또 시뮬레이션
//        int[] winLotto = {11, 21, 22, 30, 39, 44};
//
//        long num = 0;
//
//        while (true) {
//            // 로또 한장 구매
//            ArrayList<Integer> lotto = makeLotto();
//            num++;
//            int count = 0;
//            // winLotto와 lotto의 숫자 6개가 일치하는지 확인
//            // winLotto와 lotto의 각 인덱스 자리의 숫자가 일치하는 개수 카운트
//            for (int i = 0; i < 6; i++) {
//                if (Objects.equals(lotto.get(i), makeLotto().get(i))) {
//                    count++;
//                }
//            }
//
//            //카운트한 숫자가 6개면 당첨
//            if (count == 6) {
//                System.out.println("당첨!");
//                System.out.println(num + "회 구매");
//                System.out.println((num*1000) + "원 씀");
//                break;
//            } else {
//                System.out.println(count + "개 맞춤. 현재 " + num + "회 구매");
//            }
//        }



    }   // main 종료

//      다른 방법 1 메소드
//    public static ArrayList<Integer> makeLotto() {
//
//        HashSet<Integer> makeLotto0 = new HashSet<Integer>();
//
//        for (int i = 0; i < 6; i++){
//
//            int rand = (int) (Math.random() * 45 + 1);
//
//            makeLotto0.add(rand);
//
//
//        }
//        ArrayList<Integer> makeLotto1 = new ArrayList<>(makeLotto0);
//
//        return makeLotto1;
//
//    }

    public static ArrayList<Integer> makeLotto() {

        HashSet<Integer> makeLottoHash = new HashSet<Integer>();

        ArrayList<Integer> makeLottoArray = new ArrayList<>();

        int rand = 0;

        while (true) {

            rand = (int)(Math.random() * 45 + 1);

            makeLottoHash.add(rand);

            if (makeLottoHash.size() == 6) {

                break;

            }

        }
//        HashSet -> ArrayList 변환
//        ArrayList<Integer> makeLottoArray = new ArrayList<>(makeLottoHash);

        makeLottoArray.addAll(makeLottoHash);

        Collections.sort(makeLottoArray);

        return makeLottoArray;

    }
//    String key;
//    String Value;
//
//    void infoMap(String id, String password) {
//        // this 는 현재 객체를 의미
//        // 현재 객체의 필드변수에 생성자의 파라미터로 들어온 값 부여
//        this.key = key;
//        this.Value = Value;
//    }

}
