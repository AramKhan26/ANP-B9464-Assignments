/*WAP to find whether the number is prime no or not*/
/*import java.util.*;
public class PrimeNo
{
	public static void main(String args[])
	{
		int num=7;
		int temp=0;
     	for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
	}
}*/

/*To take input from the user*/
import java.util.*;
public class PrimeNo
{
	public static void main(String args[])
	{
		int num;
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		num=sc.nextInt();
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println(num+ " is a Prime Number");
		}
		else
		{
			System.out.println(num+ " is not a Prime Number");
		}
	}
}                                                                 
