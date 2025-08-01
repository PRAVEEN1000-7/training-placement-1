import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<>();
       
       for(int i = 0; i < n; i++) {
           list.add(sc.nextInt());
       }
       
       int q = sc.nextInt();
       
       for(int i = 0; i < q; i++) {
           String op = sc.next();
           if(op.equals("Insert")) {
               int x = sc.nextInt();
               int y = sc.nextInt();
               list.add(x, y);
           } else {
               int x = sc.nextInt();
               list.remove(x);
           }
       }
       
       for(int i = 0; i < list.size(); i++) {
           System.out.print(list.get(i));
           if(i < list.size() - 1) {
               System.out.print(" ");
           }
       }
   }
}
