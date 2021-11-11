package java_Assignment_1;

import java.util.Scanner;
class LoginValidation
{
	static void validation(String name,String pwd,int attempts)
	{
		String n="giriraj",p="100";
		
		if(attempts!=3)
		{
			if(name.equals(n) && pwd.equals(p))
			{
			System.out.println("Welcome " + name);
			}
			else
			{
			System.out.println("Invalid Login");
			attempts=attempts+1;
			enterDetails(attempts);
			if(attempts==3)
				{
				System.out.println("Login limit exceeded....!!!");
				}
			}
		}
	}
	static void enterDetails(int attempts)
	{
		Scanner sc=new Scanner(System.in);
		String password,name;
		System.out.println("Enter the username:");
		name=sc.next();
		System.out.println("Enter password:");
		password=sc.next();
		//System.out.println(name+"  "+password);
		validation(name,password,attempts);
		sc.close();
	}
	public static void main(String[] args) 
	{
		int attempts=1;
		enterDetails(attempts);
	}
}