/*WAP to find the Greater number between Three numbers (Type 1)*/

/*import java.util.*;
public class GreaterThree1
{
	public static void main(String args[])
	{
		int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.println("a is Greater");
		}
		else if(b>a && b>c)
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
public class GreaterThree1
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THREE NUMBERS: ");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is Greater");
		}
		else
		{
	        System.out.println("c is Greater");
		}
		
	}
}