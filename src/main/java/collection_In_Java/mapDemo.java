package collection_In_Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {
public static void main(String[] args) {
	/*Map<String,Integer>map=new HashMap<>();
	map.put("jyoti", 1);
	map.put("sneha", 2);
	map.put("Dharati", 3);
	map.put("Aishwarya", 4);
	map.put("nanda", 5);
	map.put("Aaradhya", 6);
	map.put("Swara", 7);*/
	//System.out.println(map);
	Map<Integer,String>map=new HashMap<>();
	map.put(1,"jyoti");
	map.put(2,"sneha");
	map.put(3,"Dharati");
	map.put(4,"Aishwarya");
	map.put(5,"nanda");
	map.put(6,"Aaradhya");
	map.put(7,"Swara");
	map.put(7,"Swara");
map.remove("jyoti");
boolean bool=map.remove(4, "karn");
System.out.println(bool);
System.out.println(map);
	String student=map.get(3);
	String num=map.getOrDefault(2, student);
	System.out.println(num);
	System.out.println(student);
	System.out.println(map.containsKey(4));
	System.out.println(map.containsValue("Swara"));
	//Set<Integer> keys=map.keySet();
	//for(int i:keys)
	//System.out.println(map.get(i));
	Set<Map.Entry<Integer, String>> entries=map.entrySet();
	for(Entry<Integer, String> entry:entries) {
		//System.out.println(entry.getKey()+" : "+entry.getValue());
		entry.setValue(entry.getValue().toUpperCase());
	
System.out.println(entry);
}
}}










