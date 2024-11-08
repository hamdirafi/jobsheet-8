import java.util.Scanner;
public class AverageValue01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numStudents = 5;
        int numAssignments = 5;
        double totalScore, averageScore;
        double highestScore = 0;
        double lowestScore = 100; // Assuming scores are out of 100

        for (int j = 1; j <= numStudents; j++) {
            totalScore = 0;

            System.out.println("Input Nilai Mahasiswa ke- " + j + ":");
            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Nilai ke-" + i + " = ");
                double score = sc.nextDouble();

                totalScore += score;

                // Check if the current score is the highest or lowest
                if (score > highestScore) {
                    highestScore = score;
                }
                if (score < lowestScore) {
                    lowestScore = score;
                }
            }

            // Calculate and display the average for the current student
            averageScore = totalScore / numAssignments;
            System.out.println("Rata-rata Nilai Mahasiswa " + j + ": " + averageScore);
        }

        
        sc.close();
    }
}
 
