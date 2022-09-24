import java.lang.*;

//Program for Assignment 2 Page 1 Pattern 10

class Pattern10
{
	public static void main(String arg[])
	{
	
		char c = 'A';
		for (int i=1; i<=5; i++)
		{
		   for (int j=(5-i); j>=1; j--)
		   {
			   System.out.print(" ");
		   }
		   
		   for (int j= (6-i); j<=5; j++)
		   {
				
			if(j==5)
			{
				c='E';
			   System.out.print(c+" ");
			}
			if(j==4)
			{
				c='D';
			   System.out.print(c+" ");
			}
			if(j==3)
			{
				c='C';
			   System.out.print(c+" ");
			}
			if(j==2)
			{
				c='B';
			   System.out.print(c+" ");
			}
			if(j==1)
			{
				c='A';
			   System.out.print(c+" ");
			}
			   //c--;
			//   System.out.print(j+" ");
		   }
		   System.out.println();						
		}

	}
}