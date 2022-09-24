import java.lang.*;

//Program for Asignment 2 Page 1 Pattern 2

class Pattern2
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=1; j<=i; j++)
		   {
			   if (j == 1)
				   System.out.print("A "); 
			   else if (j == 2)
					System.out.print("B ");
			   else if (j == 3)
					System.out.print("C ");
			   else if (j == 4)
					System.out.print("D ");
			   else if (j == 5)
					System.out.print("E ");
		
			   
		   }
		   
		   System.out.println();	
		}

}
}