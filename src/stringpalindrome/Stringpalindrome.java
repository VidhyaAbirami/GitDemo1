package stringpalindrome;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) {
	System.out.println("enter a string");
	String original,reversed="";
	Scanner s=new Scanner(System.in);
	original=s.next();
	int r=original.length();
    System.out.println(r);
    for(int i=r-1;i>=0;i--) {
    	 reversed=reversed+original.charAt(i);
    	 
    }
    System.out.println("original :"+original);
   System.out.println("reversed:"+reversed);
   if(reversed.equalsIgnoreCase(original))
	   System.out.println("Its a Palindrome");
   else
	   System.out.println("Its not a Palindrome");
//if(reversed.toLowerCase().equals(original.toLowerCase()))
//    System.out.println("yes");
//else
//	System.out.println("no");
	}

}
