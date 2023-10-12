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

        System.out.println("아이디를 입력해주세요.");
        System.out.print(">>> ");
        String id = scan.nextLine();

        System.out.println("비밀번호를 입력해주세요.");
        System.out.print(">>> ");
        String password = scan.nextLine();

        if (infoMap.containsKey(id) && infoMap.containsValue(password)) {

            System.out.println("로그인 성공");

        } else if (!infoMap.containsKey(id)) {

            System.out.println("존재하지 않는 아이디입니다.");

        } else if (infoMap.containsKey(id) && !infoMap.containsValue(password)) {

            System.out.println("비밀번호가 틀렸습니다.");

        }

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
