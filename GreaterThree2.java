/*WAP to find the Greater number between Three numbers (Type 2)*/

/*import java.util.*;
public class GreaterThree2
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is Greater");
			}
			else
			{
				System.out.println("c is Greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is Greater");
		}
		else
		{
			System.out.println("c is Greater");
		}
	}
}
*/

/*To take input from the user*/
import java.util.*;
public class GreaterThree2
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THREE NUMBERS: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is Greater");
			}
			else
			{
				System.out.println("c is Greater");
			}
		}
		else if(b>c)
		{
			System.out.println("b is Greater");
		}
		else
		{
			System.out.println("c is Greater");
		}
	}
}