package collection_In_Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StringNameDescendingComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // Reverse order: Z → A
    }

    static class Demo {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("banana");
            list.add("apple");
            list.add("kiwi");
            list.add("orange");
            list.add("grape");

            list.sort(new StringNameDescendingComparator());

            System.out.println("Sorted by name (descending): " + list);
        }
    }
}
