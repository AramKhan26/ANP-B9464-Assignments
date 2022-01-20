/*WAP to find whether the number is even or odd*/

/*import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
	{
		int num=1739;
		if(num%2==0)
		{
			System.out.println("num is Even");
		}
		else
		{
			System.out.println("num is Odd");
		}
	}
}*/

/*To take input from the user*/
import java.util.*;
public class EvenOdd
{
	public static void main(String args[])
	{
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a num");
	num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("num is Even");
	}
	else
	{
		System.out.println("num is Odd");
	}
	}
}