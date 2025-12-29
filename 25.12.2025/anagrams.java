""" 
Q : Check whether two strings are case-insensitive anagrams, meaning they contain the same characters with the same frequencies, regardless of letter case.
"""

import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length())
            return false;

        int[] count = new int[26];

        for (int i = 0; i < a.length(); i++) {
            count[a.charAt(i) - 'a']++;
            count[b.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if (isAnagram(a, b))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");

        sc.close();
    }
}
