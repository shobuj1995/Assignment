package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> mapTest = new HashMap<>();
        mapTest.put("Name","Obaydul");
        mapTest.put("Id","500");
        mapTest.put("Country","Bangladesh");

        System.out.println("----------------------------------------");

        System.out.println(mapTest.get("Country"));


        System.out.println("===========================================");
        Map<String,Object> json = new HashMap<>();
        json.put("Name","Jhon curtar");
        json.put("Email","123@gmail.com");
        json.put("Id",14);

        System.out.println(json);
    }
}
