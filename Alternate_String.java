import java.util.*;
public class Alternate_String {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.next();
        byte[] byt=a.getBytes();
        int count=0;
        for(int i=0;i<a.length()-1;i++)

            if(byt[i]==byt[i+1])
            {  count++;}


        System.out.println(count);
    }
}
