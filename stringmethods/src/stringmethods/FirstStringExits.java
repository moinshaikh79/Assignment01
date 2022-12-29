package stringmethods;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstStringExits {
	public static void main(String[] args) {
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String m1,m2;
			System.out.println("Put Your First name:");
			m1=br.readLine();
			System.out.println("Put Your Second name:");
			m2=br.readLine();
			System.out.println("First String:"+m1);
			System.out.println("Second String:"+m2);
			if(m1.contains(m2))
			{
				System.out.println("yes,Fist String exists in another");
				
			}
			else
			{
				System.out.println("No,First String exists in another");
			}
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
				
			

   }
	
}	

