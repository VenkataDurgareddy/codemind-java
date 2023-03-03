class Box
{
	double width,height,depth;
	Box(double w,double h,double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	Box()
	{
		width=height=depth=0;
	}
        Box(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class Test1
{
	public static void main(String args[])
	{
		Box b1=new Box(10,20,15);
		Box b2=new Box();
		Box b3=new Box(7);
		double vol;
		vol=b1.volume();
		System.out.println("The volume of the box1 is:"+b1.volume());
		System.out.println("The volume of the box2 is:"+b2.volume());
		vol=b3.volume();
		System.out.println("The volume of the box3 is:"+b3.volume());
          }
}
