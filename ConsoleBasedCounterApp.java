package tasks;

import java.util.Scanner;

public class ConsoleBasedCounterApp 
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter number to Start counting ");
	int num=s.nextInt();
	int count=0;
	
	while(num!=0)
	{
		count=count+1;
		System.out.println(" Enter next Number ");
		num=s.nextInt();
	}
	System.out.println("count is :" +count);
}
}
