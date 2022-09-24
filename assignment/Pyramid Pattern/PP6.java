import java.lang.*;

//Program for Assignment 2 Page 3 Pyramid Pattern 6

class PP6
{
	public static void main(String arg[])
	{
		for (int i=1; i<=9; i++)
		{
		   for (int j=1; j<=(i-1); j++)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= 9; j>=i; j--)
		   {
			   System.out.print("* ");
		   }
		   System.out.println();						
		}

	}
}