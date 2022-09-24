import java.lang.*;

//Program for Assignment 1 Page 1 Pattern 17

class Pattern17
{
	public static void main(String arg[])
	{
		int count = 0;
		for (int i=1; i<=5; i++)
		{
		   for (int j=1; j<=i; j++)
		   {	count++ ;
			   System.out.print(count);
		   }
		   
		   System.out.println();						
		}

	}
}