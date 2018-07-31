import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a,temp,num=0,rem;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		temp=a;
		while(temp>0)
		{
			rem=temp%10;
			num=num*10+rem;
			temp=temp/10;
		}
		if (a==num)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}	
}
