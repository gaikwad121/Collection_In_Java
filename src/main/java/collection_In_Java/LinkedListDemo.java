package collection_In_Java;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<Integer> li=new LinkedList<Integer>();
	li.add(5);
	li.add(6);
	li.add(7);
	li.add(8);
	li.add(9);
	li.add(10);
	li.add(4);
	li.add(3);
	li.add(2);
	li.add(1);
li.get(5);
li.get(2);
li.addFirst(9);

li.lastIndexOf(5);
li.removeIf(x -> x%2!=0);
System.out.println(li);
LinkedList<String> animal=new LinkedList<>(Arrays.asList("dog","bear","lion"));
LinkedList<String> animalremove=new LinkedList<>(Arrays.asList("elempahnt","tiger","bear","dog"));
animal.removeAll(animalremove);
System.out.println(animal);

}
}
