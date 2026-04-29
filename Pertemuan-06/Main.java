import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        int[] angka = { 1, 2, 3 };
        System.out.println("Array:" + angka[0]);

        // ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println("ArrayList: " + list);

        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Nilai", 100);
        System.out.println("HashMap: " + map.get("Nilai"));
    }
}