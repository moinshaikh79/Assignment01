package stringmethods;

import java.util.Scanner;

public class StringRevers {
	public static void main(String args[])
	{
		     Scanner sc=new Scanner(System.in);
		     System.out.println("Please Enter String value");
		     String p=sc.nextLine();
		     
		     StringBuilder sb=new StringBuilder(p);
		     sb.reverse();
		     String result=sb.toString();
		     
		     System.out.println("Reverse String is : "+result);
		     System.out.println("The UpperCase is : "+p.toUpperCase());
		   }

}

