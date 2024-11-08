import java.util.Scanner;

public class Square01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value N = ");
        int N = sc.nextInt();

        for (int iOuter = 1; iOuter <= N; iOuter++) { // Outer loop for rows
            for (int i = 0; i <= N; i++) {            // Inner loop for columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
        
        sc.close();
    }
}