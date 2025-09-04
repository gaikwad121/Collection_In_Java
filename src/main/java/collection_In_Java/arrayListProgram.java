package collection_In_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayListProgram {

	public static void main(String[] args) {
list();
	}
public static  void list() {
	ArrayList<Integer> li=new ArrayList<>();
	li.add(10);
	li.add(4);
	li.add(5);
	li.add(56);
	li.add(23);
	li.add(7);
	li.add(89);
	li.add(5);
	li.add(23);
	li.add(7);

	//System.out.println(li.size());
//System.out.println(li.contains(10));
//System.out.println(li.get(0));
	Collections.sort(li);
	System.out.println(li.getLast());
for(int l:li) {
	System.out.println(l);
}
}}
