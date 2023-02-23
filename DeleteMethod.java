public class DeleteMethod
{
	public static void main( String [] args)
	{
           StringBuffer str=new StringBuffer("madam");
	   str.deleteCharAt(2);
	   System.out.println(str);
	   StringBuffer str1=new StringBuffer("newDelhi");
	   str1.delete(0,4);
	   System.out.println(str1);
	  StringBuffer str2=new StringBuffer("madam");
          str2.delete(0,str2.length());
	  System.out.println(str2);
	}
}