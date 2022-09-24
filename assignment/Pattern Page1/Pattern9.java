import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 9

class Pattern9
{
	public static void main(String arg[])
	{
		char c = 'A';
		for (int i=1; i<=5; i++)
		{
		   for (int j=(5-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 1; j<=i; j++)
		   {
		   
		   if (j==1)
			   c = 'A';
			   
			   System.out.print(c+" ");
			   c++;
		   }
		   System.out.println();						
		}

	}
}