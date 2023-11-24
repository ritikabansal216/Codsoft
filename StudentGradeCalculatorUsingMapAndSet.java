import java.util.*;

public class StudentGradeCalculatorUsingMapAndSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> studentGrades = new HashMap<>();
        Set<String> uniqueStudents = new HashSet<>();

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String studentName = scanner.nextLine();

            // Check if the student name is unique
            if (!uniqueStudents.add(studentName)) {
                System.out.println("Student name already exists. Please enter a unique name.");
                i--; // Decrement i to re-enter the name for the same student
                continue;
            }

            System.out.print("Enter the grade for student " + studentName + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            studentGrades.put(studentName, grade);
        }

        if (!studentGrades.isEmpty()) {
            double totalGrades = 0;
            for (int grade : studentGrades.values()) {
                totalGrades += grade;
            }

            double averageGrade = totalGrades / studentGrades.size();
            System.out.println("The average grade of the students is: " + averageGrade);
        } else {
            System.out.println("No grades entered. Cannot calculate average.");
        }

        scanner.close();
    }
}
