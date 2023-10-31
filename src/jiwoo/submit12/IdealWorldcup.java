//package jiwoo.submit12;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
//public class IdealWorldcup {
//    public static void main(String[] args) {
//
//        ArrayList foodList = new ArrayList();
//        foodList.add("김치말이국수");
//        foodList.add("마파두부");
//        foodList.add("볶음밥");
//        foodList.add("제육볶음");
//        foodList.add("라멘");
//        foodList.add("두부두루치기");
//        foodList.add("비빔면");
//        foodList.add("삼겹살");
//        foodList.add("라면");
//        foodList.add("햄버거");
//        foodList.add("된장찌개");
//        foodList.add("마라탕");
//        foodList.add("돼지국밥");
//        foodList.add("감자탕");
//        foodList.add("백반");
//        foodList.add("파스타");
//
//        worldcup(foodList);
//
//        Collections.shuffle(foodList);
//
//        for (int i = 0; i < foodList.size(); i += 2) {
//            System.out.println(foodList.size() + "강 ================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + foodList.get(i));
//            System.out.println("2. " + foodList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if (select == 1) {
//                selectList.add((String) foodList.get(i));
//            } else {
//                selectList.add((String) foodList.get(i+1));
//            }
//        }
//
//        foodList.clear();                // 선택된거 전달받기 위한 준비
//        foodList.addAll(selectList);    // 선택 항목 전달
//        selectList.clear();             // 다음 준비
//
//        for (int i = 0; i < foodList.size(); i += 2) {
//            System.out.println(foodList.size() + "강 ================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + foodList.get(i));
//            System.out.println("2. " + foodList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if (select == 1) {
//                selectList.add((String) foodList.get(i));
//            } else {
//                selectList.add((String) foodList.get(i+1));
//            }
//        }
//
//        foodList.clear();
//        foodList.addAll(selectList);
//        selectList.clear();
//
//        for (int i = 0; i < foodList.size(); i += 2) {
//            System.out.println(foodList.size() + "강 ================");
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + foodList.get(i));
//            System.out.println("2. " + foodList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if (select == 1) {
//                selectList.add((String) foodList.get(i));
//            } else {
//                selectList.add((String) foodList.get(i+1));
//            }
//        }
//
//        foodList.clear();
//        foodList.addAll(selectList);
//        selectList.clear();
//
//        for (int i = 0; i < foodList.size(); i += 2) {
//            if (foodList.size() == 2) {
//                System.out.println("결승 ================");
//            } else {
//                System.out.println(foodList.size() + "강 ================");
//            }
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + foodList.get(i));
//            System.out.println("2. " + foodList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if (select == 1) {
//                selectList.add((String) foodList.get(i));
//            } else {
//                selectList.add((String) foodList.get(i+1));
//            }
//        }
//
//        foodList.clear();
//        foodList.addAll(selectList);
//        selectList.clear();
//
//        // foodList에 1개만 있으면 해당 음식이 우승
//        if (foodList.size() == 1) {
//            System.out.println(foodList.get(0) + "우승!");
//        }
//
//    }
//
//    public static void worldcup(ArrayList foodList) {
//        ArrayList foodList = new ArrayList();
//
//        Scanner scan = new Scanner(System.in);
//
//        ArrayList<String> selectList = new ArrayList<>();
//
//        for (int i = 0; i < foodList.size(); i += 2) {
//            if (foodList.size() == 2) {
//                System.out.println("결승 ================");
//            } else {
//                System.out.println(foodList.size() + "강 ================");
//            }
//            System.out.println("메뉴를 선택해주세요.");
//            System.out.println("1. " + foodList.get(i));
//            System.out.println("2. " + foodList.get(i+1));
//            System.out.print(">>> ");
//
//            int select = Integer.parseInt(scan.nextLine());
//
//            if (select == 1) {
//                selectList.add((String) foodList.get(i));
//            } else {
//                selectList.add((String) foodList.get(i+1));
//            }
//        }
//
//        foodList.clear();
//        foodList.addAll(selectList);
//        selectList.clear();
//
//        // foodList에 1개만 있으면 해당 음식이 우승
//        if (foodList.size() == 1) {
//            System.out.println(foodList.get(0) + "우승!");
//        }
//    }
//
//}
