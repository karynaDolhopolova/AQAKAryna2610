package homeWork89;

import java.util.*;

public class Lesson89 {
    public static void main(String[] args) {
        String products = "butter, butter, sausage, milk";
        correction(products);

    }

    private static void correction(String str) {
        List<String> productsList = new ArrayList<>(Arrays.asList(str.replace(" ", "").split(",")));
        Set<String> listOfProducts = new HashSet<>(productsList);
        for (String p : listOfProducts) {
            System.out.println(p.toUpperCase().charAt(0) + p.substring(1));
        }
    }
}