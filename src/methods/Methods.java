/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.*;
class Methods
{
	static Scanner s=new Scanner(System.in);
	public int factorial()
	{
		System.out.println("Enter a number to find its factorial:");
		int n=s.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public void table()
	{
		System.out.println("Enter a number to find its table:");
		int n=s.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+"*"+n+"="+i*n);
		}
	}

	public void prime()
	{
		System.out.println("Enter a number to check that is it prime or not.??:");
		int n=s.nextInt();
		
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n+" is a prime number:");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
	
	public String evenOdd()
	{
		System.out.println("Enter a number to check that is it even or odd.??:");
		int n=s.nextInt();
		if(n%2==0)
		{
			return(n+" is an even number:");
		}
		else
		
			return(n+" is an odd number:");
		
		
	}
	
	public void menu()
	{
		int n=0;
		do{
		
		System.out.println("ENTER:");
		System.out.println();
		System.out.println("   1:For finding factorial of any integer number:");
		System.out.println("   2:To make table of any integer number:");
		System.out.println("   3:For cheking any integer number that is it prime or not:");
		System.out.println("   4:For cheking any integer number that is even or odd:");
		
		System.out.println("Enter your choice between 1 and 4:");
		n=s.nextInt();
		
		if(n==1)
		{
			System.out.println(factorial());
		}
		else if(n==2)
		{
			table();
		}
		else if(n==3)
		{
			prime();
		}
		else if(n==4)
		{
			System.out.println(evenOdd());
		}
		else{
			System.out.println("Wrong entry:Please enter b/w 1 and 4");
		}
		}
		while(n>4);	

	}
	public static void main(String args[])
	{
		Methods m=new Methods();
		m.menu();
	}
}