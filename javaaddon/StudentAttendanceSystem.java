import java.util.HashMap;
import java.util.Scanner;

class StudentAttendanceSystem {
    private HashMap<String, Boolean> attendanceRecords;

    public StudentAttendanceSystem() {
        attendanceRecords = new HashMap<>();
    }

    public void markAttendance(String studentName, boolean isPresent) {
        attendanceRecords.put(studentName, isPresent);
    }

    public void displayAttendance() {
        System.out.println("Attendance Records:");
        for (String student : attendanceRecords.keySet()) {
            String attendanceStatus = attendanceRecords.get(student) ? "Present" : "Absent";
            System.out.println(student + ": " + attendanceStatus);
        }
    }

    public static void main(String[] args) {
        StudentAttendanceSystem attendanceSystem = new StudentAttendanceSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Student Attendance System");
        char choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Is student present? (true/false): ");
                    boolean isPresent = scanner.nextBoolean();
                    attendanceSystem.markAttendance(name, isPresent);
                    break;
                case 2:
                    attendanceSystem.displayAttendance();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please enter again.");
            }

            System.out.print("Do you want to continue (y/n)? ");
            choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline
        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}