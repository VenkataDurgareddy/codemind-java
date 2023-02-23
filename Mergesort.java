import java.util.*;
public class Mergesort
{
	public static void sort(int[] a,int low,int high)
	{
	  int n=high-low;
	  if(n<=1)
           return ;
         int mid=low+n/2;
         sort(a,low,mid);
         sort(a,mid,high);
         int temp[]=new int[n];
         int i=low,j=mid;
        for(int k=0;k<n;k++)
        {
		if(i==mid)
		  temp[k]=a[j++];
                else if(j==high)
                  temp[k]=a[i++];
         	else if(a[j]<a[i])
		  temp[k]=a[j++];
		else
		  temp[k]=a[i++];
        }
        for(int k=0;k<n;k++)
         a[low+k]=temp[k];
	}
	public static void main(String[] args)
        {
          Scanner sc=new Scanner(System.in);
          int n,i;
	  System.out.println("Enter number of integer elements");
          n=sc.nextInt();
          int arr[]=new int[n];
          System.out.println("\nEnter"+n+"integer elements");
	  for(i=0;i<n;i++)
           arr[i]=sc.nextInt();
          sort(arr,0,n);
          System.out.println("\n Elements after sorting");
            for(i=0;i<n;i++)
              System.out.print(arr[i]+" ");
	}
}