package collection_In_Java;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String s = "swiss";
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        // Step 1: Count frequency of each character
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find first char with frequency 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated char: " + entry.getKey());
                break;
            }
        }
    }
}
