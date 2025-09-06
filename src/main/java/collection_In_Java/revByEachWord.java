package collection_In_Java;

public class revByEachWord {
public static void main(String[] args) {
	String str="Hello jyoti mahadev gaikwad";
	String s[]=str.split(" ");
	StringBuilder result=new StringBuilder();
	for(String word:s) {
		char ch[]=word.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			result.append(ch[i]);
		}
		result.append(" ");
	}
	System.out.println(result.toString().trim());
}
}
