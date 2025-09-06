package collection_In_Java;

public class revString {
public static void main(String[] args) {
	String s="SDET";
	String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
