import java.util.*;
public class PrimeNumbersList
{
	public static void main(String args[])
	{
		int i;
		int n=789;
		int no;
		int temp=0;
		for(no=1;no<=789;no++)
		{
			for(i=1 ;i<=no-1;i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
		}
		if(temp==0)
		{
			System.out.println(no);
		}
	}
}