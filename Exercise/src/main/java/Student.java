import java.util.Scanner;

public class Student {

    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;

        if (average > 0.0 && average <= 100.0) {
            this.average = average;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAverage(double studentAverage) {
        if (studentAverage > 0.0 && studentAverage <= 100.0) {
            this.average = studentAverage;
        }
    }

    public double getAverage() {
        return average;
    }

    public String getLetterGrade() {
        String letterGrade = "";

        if (average >= 90.0) {
            letterGrade = "A";
        } else if (average >= 80.0) {
            letterGrade = "B";
        } else if (average >= 70.0) {
            letterGrade = "C";
        } else if (average >= 60.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        return letterGrade;
    }

    public int calculateAverage() {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 5) {
            System.out.print("Enter grade: ");
            int grade = input.nextInt();
            total += grade;
            gradeCounter++;
        }

        return total;
    }

    public void analysis() {
        Scanner input = new Scanner(System.in);
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        while (studentCounter <= 5) {
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();

            if (result == 1) {
                passes++;
            } else {
                failures++;
            }

            studentCounter++;
        }

        System.out.printf("Number of passes: %d%n", passes);
        System.out.printf("Number of failures: %d%n", failures);
    }
}