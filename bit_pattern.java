import java.util.*;
public class bit_pattern {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int n=15;
        int p_d=0;
        int c_d=0;
        int k=0;
        int dup=n;


        /*int j=n^(n>>1);
        System.out.println(j);
        */
        int digit=0;
        while(n>0)
        {
            digit=n&1;
           n>>=1;
            System.out.print(digit+" ");
        }
         System.out.println();

        p_d=dup&1;
        dup>>=1;
        while(dup>0)
        {

            c_d=dup&1;
            if(p_d==c_d)
            {
                System.out.println("No match");
                break;
            }
            p_d=c_d;
            dup=dup>>1;
        }


    }

}
