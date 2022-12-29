// Create Thread to find if the number is Even or odd


package Assignment02;

import java.util.Scanner;

public class Programe2C {
	public static void main(String[] args) 
	{
		MyThread m=new MyThread();
		m.start();
	}
}
class MyThread extends Thread
{
	public void run() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Number Is Even");
		}
		else
		{
			System.out.println("Number Iss Odd");
		}
	}
}
