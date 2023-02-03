package lab13_collection_map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class MapPractice {
    public static void main(String[] args) {


        Map<String, Object> car1 = new LinkedHashMap<>();

        car1.put("brand", "BMW");
        car1.put("model", "X5");
        car1.put("body", "SUV");
        car1.put("year", 2021); // autoboxing
        car1.put("auto", true); // autoboxing
        car1.put("price", 45000);

        System.out.println(car1.size());

        System.out.println(car1);

        car1.put("price", 55000);

        System.out.println("--------------------------------------------");

        System.out.println(car1);

        System.out.println(car1.get("brand") + ":" + car1.get("model"));

        System.out.println("--------------------------------------------");

        for (String key : car1.keySet()) {
            System.out.println(key);
        }
        System.out.println("--------------------------------------------");
        for (Map.Entry<String, Object> entry : car1.entrySet()) {
            //System.out.println(entry);
         //   System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getKey().equalsIgnoreCase("year")){
                entry.setValue(2019);
            }

            if (entry.getKey().equalsIgnoreCase("price")){
                entry.setValue(55000);
            }
        }


    }
}
