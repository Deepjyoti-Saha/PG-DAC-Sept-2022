import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 11

class Pattern11
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=(5-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 1; j<=(2*i)-1; j++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();						
		}

	}
}