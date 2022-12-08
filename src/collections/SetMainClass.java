package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMainClass {
    public static void main(String[] args) {
        Set<String> stringSet =  new HashSet<>();
        stringSet.add("Obaydul");
        stringSet.add("Obaydul");
        stringSet.add("Obaydul");
        stringSet.add("Jhon");
        stringSet.add("Jhon cutter");
        stringSet.add(null);

        for (String s: stringSet){
            System.out.println(s);
        }
        stringSet.remove("Obaydul");
        System.out.println(stringSet);

    }
}
