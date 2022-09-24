import java.lang.*;

//Program for Assignment 2 Page 1 Pyramid Pattern 5

class PP5
{
	public static void main(String arg[])
	{
		for (int i=1; i<=9; i++)
		{
		   for (int j=(9-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= (10-i); j<=9; j++)
		   {
			   System.out.print(j);
		   }
		   
		   for (int j= 1; j<=(i-1); j++)
		   {
			   System.out.print(9-j);
		   }
		   
		   
		   System.out.println();						
		}

	}
}