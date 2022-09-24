import java.lang.*;

//Program for Asignment 2 Page 1 Pattern 5

class Pattern5
{
	public static void main(String arg[])
	{
		for (int i=1; i<=5; i++)
		{
		   for (int j=1; j<=i; j++)
		   {
			   if (i == 1)
				   System.out.print("A "); 
			   else if (i == 2)
					System.out.print("B ");
			   else if (i == 3)
					System.out.print("C ");
			   else if (i == 4)
					System.out.print("D ");
			   else if (i == 5)
					System.out.print("E ");
		
			   
		   }
		   
		   System.out.println();	
		}

}
}