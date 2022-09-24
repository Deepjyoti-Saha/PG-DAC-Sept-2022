import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 16

class Pattern16
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=0; j<i; j++)
		   {
			   System.out.print((5-j)+" ");
		   }
		   
		   System.out.println();						
		}

	}
}