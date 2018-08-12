import java.util.Arrays;
import java.util.Scanner;

public class weight_of_string {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String str1=str.toLowerCase();
        char []c=str1.toCharArray();
        int arr[]=new int[c.length];
        for(int i=0;i<c.length;i++) {
            int digit=Character.getNumericValue(c[i]);
            arr[i]=digit-9;
        }
        System.out.println("Enter 0 or 1 to calculate the weight if 1 it will ignore the vowel,s weight for calculation");
        int num=scan.nextInt();
        if(num==0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1 && arr[i] <= 26) {
                    sum += arr[i];
                } else {
                    sum += 0;
                }
            }
            System.out.println(sum);
        }
        else {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 1 && arr[i] <= 26) {
                    if (arr[i] == 1 || arr[i] == 5 || arr[i] == 9 || arr[i] == 15 || arr[i] == 21) {
                        sum += 0;
                    } else {
                        sum += arr[i];
                    }
                }
            }
            System.out.println("sum " + sum);
        }
    }

}
