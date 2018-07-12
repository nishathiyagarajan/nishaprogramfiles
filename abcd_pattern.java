public class abcd_pattern {
    public static void main(String args[])
    {
        char ch;
        ch='A';
        System.out.println(ch);
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.print(ch +" ");
                    ch++;
                }
                else if(j==0 || j==n-1)
                {
                    System.out.print(ch +" ");
                    ch++;
                }
                else
                {
                    System.out.print("$ ");
                }
            }
            System.out.println(" ");
        }
    }
}
