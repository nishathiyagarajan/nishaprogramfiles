import java.util.*;
public class Anagram_string {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int count[] = new int[26];
        for (char c : a.toCharArray()) {
            count[c - 'a']++;

        }
        System.out.println();
        for (char c : b.toCharArray()) {
            count[c - 'a']--;
            //System.out.print(count[c-'a']+" ");
        }
        /*for (int i : count) {
            System.out.print(i + " ");
        }*/

        int sum = 0;
        for (int i : count) {
            sum += Math.abs(i);
        }
        System.out.println("sum " + sum);

    }
}
