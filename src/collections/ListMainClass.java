package collections;

import java.util.ArrayList;
import java.util.List;

public class ListMainClass {
    public static void main(String[] args) {


        //String type list
        List<String> stringTests = new ArrayList<>();
        stringTests.add("Obaydul");
        stringTests.add("Jhon the ripper");
        stringTests.add("Alex");
        stringTests.add(null);
        stringTests.add("Obaydul");

//        System.out.println(stringTests.get(0));

        stringTests.remove(1);
        for(String s:stringTests){
            System.out.println(s);
        }
        System.out.println("--------------------------------------");

        stringTests.add(1,"jhon removed");

//        System.out.println(stringTests);
        for(String s:stringTests){
            System.out.println(s);
        }


    }
}
