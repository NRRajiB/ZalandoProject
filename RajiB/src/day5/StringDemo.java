package day5;

public class StringDemo {
public static void main(String[] args) {
	String s="A Man is Sitting on Horse";
String[] s1 = s.split(" ");
for (int i = s1.length-1; i>=0; i--) {
	System.out.println(s1[i]);
	}
System.out.println(s1[5]+" "+s1[4]+" "+s1[3]+" "+s1[2]+" "+s1[1]+" "+s1[0]);

}
}
