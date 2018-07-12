import java.util.Arrays;
public class array_reverse {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int arr1[] = new int[5];
        int n = 5;
        for (int i = 0; i < n; i++)
        {
            arr1[i] = arr[(n - 1) - i];
        }
        System.out.println("reverse" + Arrays.toString(arr1));
        for (int i = 0; i < n; i++)
        {
            System.out.print(  arr1[i]+"");
        }
    }
}
