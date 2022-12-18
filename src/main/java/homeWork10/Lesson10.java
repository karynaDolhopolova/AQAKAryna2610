package homeWork10;

import java.util.*;

public class Lesson10 {
    public static void main(String[] args) {
        Map<Integer, String> mendeleevTable = new HashMap<>();
        mendeleevTable.put(26, "Fe");
        mendeleevTable.put(12, "Mg");
        mendeleevTable.put(20, "Ca");
        mendeleevTable.put(14, "Si");
        mendeleevTable.put(101, "Md");

        printMap(mendeleevTable);

////        SortedSet<Integer> element = new TreeSet<>(mendeleevTable.keySet());
////        for (Integer key : element) {
////            String value = mendeleevTable.get(key);
////            System.out.println(key + " = " + value);
//        }

    }

    private static void printMap(Map<Integer, String> map) {
        SortedSet<Integer> element = new TreeSet<>(map.keySet());
        for (Integer key : element) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

