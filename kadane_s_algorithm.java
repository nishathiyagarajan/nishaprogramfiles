import java.util.*;
public class kadane_s_algorithm {
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    //size of array
    int n=scan.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   {
       a[i]=scan.nextInt();
   }

   // checking for largest substring sum
    int max=a[0];
   int sum=0;
   for(int i=0;i<n;i++)
   {
       if(sum<=0)
       {
           sum=0;
       }
       sum+=a[i];
       if(max<sum)
       {
           max=sum;

       }
   }
   System.out.println("Max sum "+max);
}
}
