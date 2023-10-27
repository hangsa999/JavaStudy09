package jiwoo.submit12;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Submit12 {

    public static void main(String[] args) {

        System.out.println("\n======================= Q.01_1 =======================");

        String response = "{ \"city\" : [\"서울\", \"광주\", \"대구\", \"대전\", \"부산\", \"울산\", \"인천\"], \"fields\": [{\"id\": \"자장면\"},{\"id\": \"냉면\"}, {\"id\": \"김밥\"}, {\"id\": \"칼국수\"}], \"records\": [{\"시도명\": \"서울\", \"자장면\": 7069, \"냉면\": 11308, \"김밥\": 3215, \"칼국수\": 8962}, {\"시도명\": \"광주\", \"자장면\": 6800, \"냉면\": 9400, \"김밥\": 3160, \"칼국수\": 8400}, {\"시도명\": \"대구\", \"자장면\": 6250, \"냉면\": 10417, \"김밥\": 2750, \"칼국수\": 6750}, { \"시도명\": \"대전\", \"자장면\": 6700, \"냉면\": 10400, \"김밥\": 3000, \"칼국수\": 7800}, {\"시도명\": \"부산\", \"자장면\": 6143, \"냉면\": 10857, \"김밥\": 2786, \"칼국수\": 6986}, { \"시도명\": \"울산\", \"자장면\": 6500, \"냉면\": 9900, \"김밥\": 3300, \"칼국수\": 8400}, {\"시도명\": \"인천\", \"자장면\": 6500, \"냉면\": 10667, \"김밥\": 3050, \"칼국수\": 8000}]}";
        JsonParser jsonParser = new JsonParser();
        JsonObject jsonResponse = (JsonObject)jsonParser.parse(response);
//        System.out.println(jsonResponse);
        JsonArray records = (JsonArray) jsonResponse.get("records");
//        System.out.println(records);
//        JsonObject city0 = (JsonObject) records.get(0);
//        System.out.println(city0.get("냉면"));


        for (int i = 0; i < records.size() - 1; i++) {
            for (int k = 0; k < records.size() - 1; k++) {
                JsonObject left = (JsonObject) records.get(i);          // 기준 도시 (0번 시작)
                JsonObject right = (JsonObject) records.get(i + 1);     // 그 다음 도시 (1번 시작)
                int leftInt = Integer.parseInt(left.get("냉면").toString());
                int rightInt = Integer.parseInt(right.get("냉면").toString());
                if (leftInt > rightInt) {
                    JsonObject temp = (JsonObject) records.get(i);
                    records.set(i, records.get(i + 1));
                    records.set(i + 1, temp);
                }
            }
        }
        JsonObject lowPrice = (JsonObject) records.get(0);           // 0번 도시 (냉면 가격이 제일 싼 도시)  toString / valueOf
        System.out.println(lowPrice.get("시도명") + ", " + lowPrice.get("냉면") + "원");    // 0번 도시의 냉면 가격 (오름차순 정렬이라 제일 싼 냉면 가격 출력)

        System.out.println("\n======================= Q.01_2 =======================");

//        JsonObject city0 = (JsonObject) records.get(0);           // 0번 도시
//        System.out.println(city0.get("자장면"));                  // 0번 도시 자장면 가격
//        System.out.println(records.size());                       // 도시의 수
        int priceSum = 0;
        int jajang;
        for (int i =  0; i < records.size(); i++) {
            JsonObject city = (JsonObject) records.get(i);
            jajang = Integer.parseInt(String.valueOf(city.get("자장면")));
            priceSum += jajang;
        }
//        System.out.println(priceSum);
        int priceAvg = priceSum / records.size();
        System.out.println(records.size() + "개 도시 자장면 평균 가격: " + priceAvg);

        System.out.println("\n======================= Q.02 =======================");

        System.out.println(randUUID());

        System.out.println("\n======================= Q.03 =======================");

        String food = "{ \"짜장면\", \"짬뽕\", \"볶음밥\", \"제육볶음\", \"라멘\", \"카레\", \"냉면\", \"삼겹살\" , \"라면\", \"햄버거\", \"된장찌개\", \"마라탕\", \"돼지국밥\", \"감자탕\", \"백반\", \"파스타\"}";
        JsonParser foodParser = new JsonParser();






    }   // main 종료

    public static String randUUID() {
        Date date = new Date();
        SimpleDateFormat date15 = new SimpleDateFormat("yyMMddhhmmssSSS");
        String dateString = date15.format(date);
        int randNum1;
        for (int i = 0; i < 6; i++) {
            randNum1 = (int)(Math.random() * 9);
            dateString = dateString + randNum1;
        }
        // 메소드만 입력 시 바로 UUID가 나오게 하려면 여기에
        // System.out.println(dateString); 입력, return값 삭제, String을 void로 변경
        return dateString;
    }
}
