package jiwoo.submit11.q03;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.parser.ParseException;

public class JsonKrw {

    public static void main(String[] args) throws ParseException {

        String resp = "{\"success\": true, \"timeseries\": true, \"base\": \"USD\", \"start_date\": \"2020-08-01\", \"end_date\": \"2022-08-01\", \"rates\": {\"2020-08-01\": {\"JPY\": 105.65, \"KES\": 107.57, \"KGS\": 76.52, \"KHR\": 4092.64, \"KMF\": 417.5, \"KPW\": 898.38, \"KRW\": 1192.25}, \"2020-08-02\": {\"JPY\": 105.74, \"KES\": 107.69, \"KGS\": 76.62, \"KHR\": 4100, \"KMF\": 418.06, \"KPW\": 899.58, \"KRW\": 1193.46}}}";

        JsonParser jsonParser = new JsonParser();

        JsonObject jsonResponse = (JsonObject)jsonParser.parse(resp);
        System.out.println(jsonResponse);

        JsonObject rates = (JsonObject) jsonResponse.get("rates");
        System.out.println(rates);

        JsonObject target = (JsonObject) rates.get("2020-08-02");
        System.out.println(target);
        System.out.println(target.get("KRW"));
    }

}
