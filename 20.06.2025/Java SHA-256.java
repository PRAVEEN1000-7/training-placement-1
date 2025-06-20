import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class Solution {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
       
       try {
           MessageDigest md = MessageDigest.getInstance("SHA-256");
           byte[] bytes = md.digest(s.getBytes());
           
           StringBuilder sb = new StringBuilder();
           for (byte b : bytes) {
               sb.append(String.format("%02x", b));
           }
           
           System.out.println(sb.toString());
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}
