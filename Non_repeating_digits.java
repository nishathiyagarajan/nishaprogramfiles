/*
 Finding the Count of Non-Repeating Numbers in a given integer.
 1. For Example: Input-1234
              Output- count 4
    Explanation: In a given number 1, 2, 3, 4 has not repeated in the given input. So by taking the count, will get output as 4.
 2. For Example: Input-1015
                 Output- count 2
    Explanation: In a given number 1 occurs twice, 0 and 5 has not repeated. So its count will be 2 in the output expected.
 */
import java.util.*;
public class Non_repeating_digits {
    public static void main(String args[])
    {
        int arr[]=new int [10];
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
            if(arr[i]==1)
            {
                count++;
            }
        }
        System.out.println("count "+ count);
    }
}
