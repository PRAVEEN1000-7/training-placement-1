import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> innerList = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                innerList.add(sc.nextInt());
            }
            listOfLists.add(innerList);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(listOfLists.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
