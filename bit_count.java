
import java.util.*;
public class bit_count {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scan.nextInt();
       int digit[]=new int[100];
       int count=0;
       int k=0;
        while(n>0)
        {
            count+=n&1;
            digit[k]=n&1;
            k++;
            n>>=1;

        }
       int j=0;
       int res[]=new int[100];
       res[j++]=count;

        for(int i=0;i<k;i++)
        {
           if(digit[k-1-i]==1)
           {
               int m=i+1;
               res[j++]=m;
           }
        }

        for(int h=0;h<j;h++)
        {
            System.out.println(res[h]);
        }
    }
}
