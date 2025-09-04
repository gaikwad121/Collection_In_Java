package collection_In_Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringNameComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2); // Sort by name (alphabetical order)
    }

    static class Demo {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("banana");
            list.add("apple");
            list.add("kiwi");
            list.add("orange");
            list.add("grape");

            list.sort(new StringNameComparator());

            System.out.println("Sorted by name: " + list);
        }
    }
}
