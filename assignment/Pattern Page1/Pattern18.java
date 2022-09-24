import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 18

class Pattern18
{
	public static void main(String arg[])
	{
	
		char c = 'A';
		for (int i=5; i>=1; i--)
		{
		   for (int j=1; j<=i; j++)
		   {
		   if (j==1)
			   c = 'A';
		   
			   System.out.print(c+" ");
			   c++ ;
		   }
		   
		   System.out.println();						
		}

	}
}