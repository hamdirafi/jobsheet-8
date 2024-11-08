import java.util.Scanner;

public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value N = ");
        int N = sc.nextInt();

        int i = 1; // Starting from 1 to match the required output
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Move to the next line after each row
            i++;
        }
        
        sc.close();
    }
}
