import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        int intValue = sc.nextInt();     
        double doubleValue = sc.nextDouble();   
        sc.nextLine();
        String stringValue = sc.nextLine();
        System.out.println("String: " + stringValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Int: " + intValue);
        
        sc.close();
    }
}
