"""
Q : Given lines of text containing HTML/XML-like tags, extract and print the valid content enclosed within matching start and end tags.
If no valid content exists in a line, print None. 
"""

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Matcher matcher = pattern.matcher(line);
            boolean found = false;

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        sc.close();
    }
}
