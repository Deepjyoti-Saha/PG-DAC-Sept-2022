import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 6

class Test1
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=(5-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 1; j<=3; j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();						
		}

	}
}