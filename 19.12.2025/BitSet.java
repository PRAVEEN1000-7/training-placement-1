"""
Q : You are given two BitSets of size N, initially all bits set to 0, and M operations to perform on them.
After each operation (AND, OR, XOR, FLIP, SET), print the number of set bits in BitSet 1 and BitSet 2.
"""


import java.io.*;
import java.util.*;

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
            int y = sc.nextInt();

            BitSet first = (x == 1) ? b1 : b2;
            BitSet second = (y == 1) ? b1 : b2;

            if (op.equals("AND")) {
                first.and(second);
            } else if (op.equals("OR")) {
                first.or(second);
            } else if (op.equals("XOR")) {
                first.xor(second);
            } else if (op.equals("FLIP")) {
                first.flip(y);
            } else if (op.equals("SET")) {
                first.set(y);
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        sc.close();
    }
}
