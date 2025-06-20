import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       
       BitSet b1 = new BitSet(n);
       BitSet b2 = new BitSet(n);
       
       for (int i = 0; i < m; i++) {
           String op = sc.next();
           int x = sc.nextInt();
           
           if (op.equals("AND")) {
               int y = sc.nextInt();
               if (x == 1) {
                   b1.and(b2);
               } else {
                   b2.and(b1);
               }
           } else if (op.equals("OR")) {
               int y = sc.nextInt();
               if (x == 1) {
                   b1.or(b2);
               } else {
                   b2.or(b1);
               }
           } else if (op.equals("XOR")) {
               int y = sc.nextInt();
               if (x == 1) {
                   b1.xor(b2);
               } else {
                   b2.xor(b1);
               }
           } else if (op.equals("FLIP")) {
               int idx = sc.nextInt();
               if (x == 1) {
                   b1.flip(idx);
               } else {
                   b2.flip(idx);
               }
           } else if (op.equals("SET")) {
               int idx = sc.nextInt();
               if (x == 1) {
                   b1.set(idx);
               } else {
                   b2.set(idx);
               }
           }
           
           System.out.println(b1.cardinality() + " " + b2.cardinality());
       }
   }
}
