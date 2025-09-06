package collection_In_Java;

public class program {
public static void main(String[] args) {
	String s="swiss";
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++) {
	boolean repeated=false;
	for(int j=0;j<ch.length;j++) {
	if(i!=j && ch[i]==ch[j]) {
		repeated=true;
	}
	}
	if(!repeated) {
		System.out.println(ch[i]);
		break;
	}
	}
}
}
