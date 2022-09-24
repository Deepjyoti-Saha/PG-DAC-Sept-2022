import java.lang.*;

//Program for Assignment 2 Page 2 Pattern 10

class SP10
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=(5-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 1; j<=5; j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();						
		}

	}
}