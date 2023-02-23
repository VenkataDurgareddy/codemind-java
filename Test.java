class Room
{
	double length,breadth,height;
	Room()
	{
	  length=14;
	  breadth=12;
	  height=10;
	}
	double volume()
	{
	  return length*breadth*height;
	}
}
class Box
{
	double length,breadth,height;
	Box(double l,double b,double h)
	{
	   length=l;
	   breadth=b;
	   height=h;
	}
	double volume()
	{
	   return length*breadth*height;
	}
}
class Test
{
	public static void main(String args[])
	{
	  Room r=new Room();
	  System.out.println("The volume of the room is"+r.volume());
	  Box b=new Box(6,5,1);
	  System.out.println("The voulume of the box is"+b.volume());
	}
}
