import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String operation = sc.next();
            if (operation.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (operation.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
