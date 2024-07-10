import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of subjects: ");
        int numSubjects = input.nextInt();

        int[] marks = new int[numSubjects];
        
        System.out.println("Enter the marks for " + numSubjects + " subjects:");

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        int tot = 0;
        for (int mark : marks) {
            tot += mark;
        }

        float per = (float) tot / numSubjects; // Ensure floating-point division

        System.out.println("Total: " + tot);
        System.out.println("Percentage: " + per + "%"); // Add percent sign

        if (per >= 90)
            System.out.println("Grade A");
        else if (per >= 80)
            System.out.println("Grade B");
        else if (per >= 70)
            System.out.println("Grade C");
        else if (per >= 60)
            System.out.println("Grade D");
        else if (per >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");

        input.close(); // Close the scanner
    }
}

