class Overload
{
	void max(float a,float b)
	{
		System.out.println("Max method with float argument invoked");
		if(a>b)
		 System.out.println(a+"is greater");
		else
		 System.out.println(b+"is greater");
	}
	void max(double a,double b)
	{
		System.out.println("Max method with double argument invoked");
		if(a>b)
		 System.out.println(a+"is greater");
		else
		 System.out.println(b+"is greater");
	}
	void max(long a,long b)
	{
		System.out.println("Max method with long argument invoked");
		if(a>b)
		 System.out.println(a+"is greater");
		else
		 System.out.println(b+"is greater");
	}
	public static void main(String args[])
	{
		Overload o1=new Overload();
		o1.max(23L,12L);
		o1.max(2,3);
		o1.max(54,.35f);
		o1.max(43d,35d);
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           