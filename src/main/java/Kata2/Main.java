package Kata2;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main (String[] args) {
        SalesLoader l = new CsvFileSalesLoader(new File("src/main/10000_Sales_Records.csv"));
        List<Sales> sales = l.load();
        Map<String, Integer> Map = new HashMap<>();
        for (Sales sale : sales) {
            String itemType = sale.getItem_Type();
            Map.put(itemType, Map.getOrDefault(itemType, 0) + 1);
        }
        for (String k: Map.keySet()) {
            System.out.println(k + " : " + Map.get(k));
        }

    }


}
