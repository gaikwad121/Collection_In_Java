package collection_In_Java;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyarrayWriteRead {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();
        list.add("egg");
        list.add("mango");
        list.add("banana");

        System.out.println("Initial List: " + list);

        // Reader Thread
        Thread readerThread = new Thread(() -> {
            while (true) {
                for (String item : list) {
                    System.out.println("Reading: " + item);
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Writer Thread
        Thread writerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Give reader thread some time to start
                if (!list.contains("butter")) {
                    list.add("butter");
                    System.out.println("Writer added: butter");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        readerThread.start();
        writerThread.start();
    }
}
