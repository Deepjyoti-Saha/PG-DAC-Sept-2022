import java.lang.*;

//Program for Assignment 2 Page 2 Star Pattern 6

class SP6
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
					   
		   for (int j=(i-1); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		
		   for (int j= 1; j<=(2*(6-i))-1; j++)
		   {
			   System.out.print("*");
		   }
		   

		   
		   
		   System.out.println();						
		}

	}
}