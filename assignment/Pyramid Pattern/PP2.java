import java.lang.*;

//Program for Assignment 2 Page 3 Pyramid Pattern 2

class PP2
{
	public static void main(String arg[])
	{
		for (int i=1; i<=9; i++)
		{
		   for (int j=(9-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 1; j<=i; j++)
		   {
			   System.out.print(j+" ");
		   }
		   System.out.println();						
		}

	}
}