import java .util.*;
public class digital_prime {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0)
        {
            int n=scan.nextInt();
            int digit=0;
            while(n!=0 || digit>9)
            {

                if(n==0)
                {
                    n=digit;
                    digit=0;
                }
                digit+=n%10;
                n/=10;
            }
           // for(int i=2;i<digit;i++){
                if(digit==2||digit==3||digit==5||digit==7)
                //if(digit%i==0)
                {
                    System.out.println("1");

                }
                else
                {
                    System.out.println("0");
                }
                System.out.println();
            t--;
            }

        }
    }

