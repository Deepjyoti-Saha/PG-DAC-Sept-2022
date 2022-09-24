import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 15

class Pattern15
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=5; j>=i; j--)
		   {
			   System.out.print(j+" ");
		   }
		   
		   System.out.println();						
		}

	}
}