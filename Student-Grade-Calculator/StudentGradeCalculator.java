import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = sc.nextLine();

        // Number of subjects
        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = sc.nextInt();
        sc.nextLine();

        String[] subjects = new String[numberOfSubjects];
        double[] marks = new double[numberOfSubjects];

        double total = 0;

        // Enter subject details
        for (int i = 0; i < numberOfSubjects; i++) {

            System.out.print("\nEnter subject " + (i + 1) + " name: ");
            subjects[i] = sc.nextLine();

            // Marks validation
            while (true) {
                System.out.print("Enter marks for " + subjects[i] + " (0-100): ");
                marks[i] = sc.nextDouble();

                if (marks[i] >= 0 && marks[i] <= 100) {
                    break;
                }

                System.out.println("Invalid marks! Please enter between 0 and 100.");
            }

            sc.nextLine();
            total += marks[i];
        }

        // Calculate percentage
        double maximumMarks = numberOfSubjects * 100;
        double percentage = (total / maximumMarks) * 100;

        // Calculate grade
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Pass / Fail
        String result = percentage >= 40 ? "PASS" : "FAIL";

        // Display result
        System.out.println("\n=================================");
        System.out.println("          STUDENT RESULT");
        System.out.println("=================================");

        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNumber);

        System.out.println("---------------------------------");

        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.printf("%-15s : %.2f%n", subjects[i], marks[i]);
        }

        System.out.println("---------------------------------");

        System.out.printf("Total      : %.2f / %.2f%n", total, maximumMarks);
        System.out.printf("Percentage : %.2f%%%n", percentage);
        System.out.println("Grade      : " + grade);
        System.out.println("Result     : " + result);

        System.out.println("=================================");

        sc.close();
    }
}