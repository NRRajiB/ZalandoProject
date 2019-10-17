package day5;

import java.util.Arrays;

public class BasicJava {
public void anagram(String A, String B) {
String s1=A.replaceAll("//s"," ");	
String s2=B.replaceAll("//s", " ");
char[] c1 = s1.toLowerCase().toCharArray();
	char[] c2 = s2.toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	
	if(Arrays.equals(c1, c2)) {
	System.out.println("anagram");
	}
	else {
		System.out.println("Not Anagram");
	}

}


public static void main(String[] args) {
	BasicJava bj=new BasicJava();
	bj.anagram("Raji","jira");
	bj.anagram("sky", "ghj");
	bj.anagram("mom", "Mom");
}

}
