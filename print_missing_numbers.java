import java.util.*;
public class print_missing_numbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n-1; i++) {
                a[i] = scan.nextInt();
            }
            int e_sum=n*(n+1)/2;//get sum of n numbers;
            int o_sum=0;
            for(int i=0;i<n-1;i++)
            {
                o_sum+=a[i];// get sum of given array
            }
            int b=e_sum-o_sum;
            System.out.println("Missing element is " + b);
            

    }
}
