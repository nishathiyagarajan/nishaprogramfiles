/*
Finding Count of Unique Digits on a given integer.
1. For example: Input- 292
             Output- count 2
   Explanation: In the number 292, 2 has repeated twice and 9 has repeated once. Taking the count for 2 as 1 and for 9 as 1.
             By adding the count will get it as 2.
2. For example: Input- 1015
             Output- count 3
   Explanation: In the number 1015, 1 has repeated twice and the other numbers occurs once.By adding the count will get it as 3.
*/


import java.util.*;

public class Unique_digits {
    public static void main(String args[])
    {
        int arr[]=new int[10];
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        String str=Integer.toString(num);
        char c[]=str.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            int digit=Character.getNumericValue(c[i]);
            arr[digit]++;
        }
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=1)
            {
                count++;
            }
        }
        System.out.println("count "+ count);
    }
}
