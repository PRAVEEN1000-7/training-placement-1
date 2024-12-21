import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String small = s.substring(0, k);
        String large = s.substring(0, k);
        
        for (int i = 1; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            
            if (sub.compareTo(small) < 0) {
                small = sub;
            }
            if (sub.compareTo(large) > 0) {
                large = sub;
            }
        }
        return small + "\n" + large;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
