import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner sc = new Scanner(System.in);

    static int[] roll = new int[50];
    static String[] name = new String[50];
    static int[] marks = new int[50];
    static int count = 0;

    // Function to add a student
    static void addStudent() {
        if (count < 50) {
            System.out.print("Enter Roll Number: ");
            roll[count] = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name: ");
            name[count] = sc.nextLine();

            System.out.print("Enter Marks: ");
            marks[count] = sc.nextInt();

            count++;
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Record is full.");
        }
    }

    // Function to display students
    static void displayStudents() {
        if (count == 0) {
            System.out.println("No records found.");
            return;
        }

        System.out.println("\nRoll\tName\t\tMarks");
        System.out.println("--------------------------------");
        for (int i = 0; i < count; i++) {
            System.out.println(roll[i] + "\t" + name[i] + "\t\t" + marks[i]);
        }
    }

    // Function to search student
    static void searchStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.println("Student Found");
                System.out.println("Roll No : " + roll[i]);
                System.out.println("Name    : " + name[i]);
                System.out.println("Marks   : " + marks[i]);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to update marks
    static void updateMarks() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                System.out.print("Enter New Marks: ");
                marks[i] = sc.nextInt();
                System.out.println("Marks updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to delete student
    static void deleteStudent() {
        System.out.print("Enter Roll Number: ");
        int r = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == r) {
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    name[j] = name[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                System.out.println("Record deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Function to calculate average marks
    static void averageMarks() {
        if (count == 0) {
            System.out.println("No records available.");
            return;
        }

        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += marks[i];
        }

        double avg = (double) sum / count;
        System.out.println("Average Marks = " + avg);
    }

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Delete Student");
            System.out.println("6. Average Marks");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    updateMarks();
                    break;

                case 5:
                    deleteStudent();
                    break;

                case 6:
                    averageMarks();
                    break;

                case 7:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
