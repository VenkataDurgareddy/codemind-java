import java.util.*;
class Square
{
	int length,breadth;
	public void get(int x,int y)
	{
		length=x;
		breadth=y;
	}
	int area()
	{
		return (length*breadth);
	}
}
class Cube extends Square
{
	int height;
	public void getdata(int x,int y,int z)
	{
		get(x,y);
		height=z;
	}
		int volume()
		{
			return(length*breadth*height);
		}
}
public class Inherit
{
	public static void main(String args[])
	{
		Cube c=new Cube();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length,breadth,height");
		int l=sc.nextInt();
		int b=sc.nextInt();
		int h=sc.nextInt();
		c.getdata(l,b,h);
		int b1=c.area();
		System.out.println("Area of square is"+b1);
		int b2=c.volume();
		System.out.println("Volume of cube is"+b2);
	}
}