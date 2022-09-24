import java.lang.*;

//Program for Assignment 2 Page 2 Star Pattern 12

class SP12
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
		for (int i=1; i<=4; i++)
		{
		   for (int j=i; j>=0; j--)
		   {
			   System.out.print("*");
		   }
		   
		   System.out.println();						
		}
		
		

	}
}