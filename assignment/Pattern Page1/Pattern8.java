import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 10

class Pattern8
{
	public static void main(String arg[])
	{
		for (int i=5; i>=1; i--)
		{
		   for (int j=(i-1); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= i; j<=5; j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();						
		}

	}
}