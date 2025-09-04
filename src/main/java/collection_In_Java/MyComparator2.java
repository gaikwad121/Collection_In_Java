package collection_In_Java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1; // Ascending order
    }

    static class Demo {
        public static void main(String[] args) {
            List<Integer> li = new ArrayList<>();
            li.add(5);
            li.add(8);
            li.add(9);
            li.add(1);
            li.add(2);
            li.add(3);
            li.add(4);
            li.add(7);
            li.add(6);

            li.sort(new MyComparator2());

            System.out.println("Sorted List: " + li);
        }
    }
}
