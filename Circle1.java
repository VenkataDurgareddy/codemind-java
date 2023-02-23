import java.util.*;
class Circle
{
	float radius;
	double pi=3.42825;
	void area()
	{
	  double a=pi*radius*radius;
	  System.out.println("Area of circle:"+a);
	}
	void circum()
	{
           double cir=2*pi*radius;
	   System.out.println("Diameter of a circle"+cir);
	}
}
class Circle1
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
          System.out.println("enter the radius:");
	  Circle obj=new Circle();
	  obj.radius=sc.nextFloat();
	  obj.area();
	  obj.circum();
	}
}