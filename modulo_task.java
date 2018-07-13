import java.util.*;
import java.lang.*;
import java.io.*;

public class modulo_task {
        public static void main (String[] args) {
            //code
            Scanner scan=new Scanner(System.in);
            int t=scan.nextInt();
            int pos=0;
            while(t>0)
            {
                System.out.println("Enter num for finding greatest module");
                int n=scan.nextInt();
               // int max=0;
                System.out.println("Largest module = "+((n/2)+1));
                /*for(int i=1;i<n;i++)
                {
                    int mod=n%i;
                    if(mod>max)
                    {
                        max=mod;
                        pos=i;
                    }
                }
                System.out.println(pos);*/
                t--;
            }
        }
    }

