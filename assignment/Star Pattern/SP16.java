import java.lang.*;


class SP16
{
public static void main(String args[])
{
	for( int i=1;i<=4;i++)
	{
		for (int j=5;j>=1;j--)
		{
			if((j==i)||(j==1))
			System.out.print("*");
	/*		else if (j==1)
			System.out.print("*");
			
			*/
			else               
			System.out.print(" ");
		}
			System.out.println();
	}
	
	for(int i=1;i<=5;i++)
			System.out.print("*");
}
}