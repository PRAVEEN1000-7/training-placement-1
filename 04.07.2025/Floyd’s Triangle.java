

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter no. of rows :");
        int n = ip.nextInt();
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if (i>=j){
                    
                    System.out.print(number+" ");
                    number++;

                }

            }
                System.out.println();

        }
    }
}
