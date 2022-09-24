import java.lang.*;


class SP15
{
public static void main(String args[])
{
	for( int i=1;i<=4;i++)
	{
		for (int j=1;j<=i;j++)
		{
			if(j==1)
			System.out.print("*");
			else if (j==i)
			System.out.print("*");
			else
			System.out.print(" ");
		}
			System.out.println();
	}
	
	for(int i=1;i<=5;i++)
			System.out.print("*");
}
}