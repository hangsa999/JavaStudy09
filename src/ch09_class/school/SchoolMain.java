package ch09_class.school;

import ch09_class.common.UtilClass;

import java.util.ArrayList;

public class SchoolMain {

    public static void main(String[] args) {
        // 학교의 성적입력, 관리하는 프로그램을 만들 예정
        // 각 학생에 대해 객체로 만들어 써야겠다.
        // 학생은 이름, 국어, 영어, 수학, 평균 을 가진다.

        Student minjae1 = new Student();
        Student minjae = new Student("민재", 65, 33, 42);

        System.out.println(minjae);

        Student yumin = new Student("유민", 78, 82, 100);

        System.out.println(yumin);

        System.out.println(yumin.getMath());

        yumin.math = 97;
        System.out.println(yumin); // 평균이 변하지 않음

        // 필드변수 수정에 대한 제어
        yumin.setEng(83);
        System.out.println(yumin);

        // 점수가 몇이건 평균값을 지정해버리면 지정한 값 그대로 나온다
        // 평균을 수정하는건 불가능
        // 평균에 대한 Setter를 지우기
//        yumin.setAvg(90.5);
        System.out.println(yumin);

//        Student.getMath()

        // Math 크래스 내 메소드를
        // Math를 객체로 생성하지 않아도 사용 가능
        Math.random();
        Math.round(3.14);

        // static이 붙어있는  필드변수와 메소드는
        // 해당 클래스를 객체로 생성하지 않아도 사용가능
        UtilClass.myRound(3.1415, 2);

        yumin.setKor(86);
        System.out.println(yumin);

        System.out.println("\n=================================================\n");

        ArrayList<Student> stuList = new ArrayList<>();

//        stuList.add(minjae);
//        stuList.add(yumin);
        stuList.add(new Student("지우", 76, 98, 75));
        stuList.add(new Student("동우", 86, 98, 85));
        stuList.add(new Student("강연", 77, 99, 64));

        for (int i = 0; i < stuList.size(); i++) {
            System.out.println(stuList.get(i));
        }

        // stuList에 담긴 학생들의 평균을 이용해서
        // 종합 성적표를 출력해보기
        // 1등. 유민, 국어: 86, 영어: 83, 수학: 97, 평균: 88.67
        // 2등. 동우, 국어: 86, 영어: 88, 수학: 85, 평균: 86.33
        // 3등. 지우, 국어: 76, 영어: 98, 수학: 75, 평균: 83.0

        for (int i = 0;  i < stuList.size() - 1; i++) {

            for (int k = 0;  k < stuList.size() - 1; k++) {

                if (stuList.get(i).getAvg() < stuList.get(i + 1).getAvg()) {

                    Student tmp = stuList.get(i);

                    stuList.set(i, stuList.get(i+1));

                    stuList.set(i + 1, tmp);

                }

            }

        }

        for (int i = 0; i < stuList.size(); i++) {

            System.out.println((i+1) + "등. " + stuList.get(i));

        }

        System.out.println("\n=================================================\n");

//        Collections.sort(stuList, (stuA, stuB) -> stuA.getAvg() - stuB.getAvg());
//        Collections.sort(stuList, (stuA, stuB) -> {
//            int result = 1;
//
//            if (stuA.getAvg() - stuB.getAvg() < 0) {
//
//                result = -1;
//
//            }
//
//            return result;
//        });
//
//        Collections.sort(stuList, new Comparator<Student>() {
//
//            @Override
//            public int compare(Student stuA, Student stuB) {
//
//                return (stuA.getAvg() - stuB.getAvg() < 0) ? -1 : 1;
//
//            }
//
//        });




    } // main 종료

}
