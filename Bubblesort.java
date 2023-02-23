import java.util.*;
class Bubblesort
{
   public static void main(String args[])
   {
     int n,i,j,temp,array[];
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of elements to bee sorted");
     n=sc.nextInt();
     array=new int[n];
     System.out.println("Enter"+n+"intergers");
    for(i=0;i<n;i++)
    {
      array[i]=sc.nextInt();
     }
   for(i=0;i<n;i++)
   {
     for(j=0;j<n-i-1;j++)
     {
        if(array[j]>array[j+1])
        {
              temp=array[j];
              array[j]=array[j+1];
              array[j+1]=temp;
        }
      }
   }
   System.out.println("sotred list of elements");
   for(i=0;i<n;i++)
   {
      System.out.println(array[i]);
   }
   }
}