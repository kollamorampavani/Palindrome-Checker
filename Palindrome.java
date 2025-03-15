package strings;
import java.util.*;
public class Palindrome {
	public static String reverse(String s) {
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
			t=t+s.charAt(i);
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
	     System.out.println("enter string");
	     String s=scan.next();
	     String res=reverse(s);
	     if(s.equals(res)) {
	    	 System.out.println("palindrome");
	     }
	     else {
	    	 System.out.println("not palindrome");
	     }
	}

}
