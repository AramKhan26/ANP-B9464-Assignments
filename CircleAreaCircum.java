import java.util.*;
public class CircleAreaCircum
{
  public static void main(String args[])
  {
    double radius, area, circumference;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Radius of Circle:");
	radius=in.nextDouble();
	//Calculate area and circumference of circle
	area=Math.PI*radius*radius;
	circumference=2*Math.PI*radius;
	System.out.println("Area of Circle:" +area);
	System.out.println("Circumference of Circle:" +circumference);
	}
}