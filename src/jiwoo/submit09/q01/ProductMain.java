package jiwoo.submit09.q01;

import java.util.ArrayList;

public class ProductMain {

    public static void main(String[] args) {
        System.out.println("\n========================= Q.01 =========================\n");

        // Product 클래스로 객체 담기
        Product frige = new Product("냉장고", 2000000);
        Product tv = new Product("TV", 1000000);
        Product aircon = new Product("에어컨", 800000);
        Product computer = new Product("컴퓨터", 1300000);
        Product fan = new Product("선풍기", 100000);

        // ArrayList 객체에 담기
        ArrayList<Product> productList = new ArrayList<>();

        productList.add(new Product("냉장고", 2000000));
        productList.add(new Product("TV", 1000000));
        productList.add(new Product("에어컨", 800000));
        productList.add(new Product("컴퓨터", 1300000));
        productList.add(new Product("선풍기", 100000));

//        System.out.println(productList.get(0).getPrice());
//
//        System.out.println(productList.size());

        System.out.println("\n========================= 가격 별 정렬 =========================\n");

        // 가격별로 정렬
        for (int k = 0; k < productList.size() - 1; k++) {

            for (int i = 0; i < productList.size() - 1; i++) {

                if (productList.get(i).getPrice() > productList.get(i + 1).getPrice()) {

                    Product tmp = productList.get(i);

                    productList.set(i, productList.get(i + 1));

                    productList.set(i + 1, tmp);

                }

            }

        }

        //  정렬 후 출력
        for (int i = 0; i < productList.size(); i++) {

            System.out.println(productList.get(i));

        }

        System.out.println("\n========================= TV =========================\n");

        // TV 인덱스 위치 찾기
        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getName().equals("TV")){

                // 인덱스가 2이므로 2를 표시
                System.out.println(i);

            }

        }

    } // main 종료

}
