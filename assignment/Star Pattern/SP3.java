import java.lang.*;

//Program for Assignment 2 Page 2 Star Pattern 3

class SP3
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=5; j>=i; j--)
		   {
			   System.out.print("*");
		   }
		   
		   System.out.println();						
		}

	}
}