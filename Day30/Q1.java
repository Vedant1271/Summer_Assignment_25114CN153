import java.util.Scanner;

public class StudentRecordSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = new String[50];
        int[] rollNo = new int[50];
        int[] marks = new int[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== STUDENT RECORD SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (count < 50) {
                        System.out.print("Enter Roll Number: ");
                        rollNo[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name: ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Marks: ");
                        marks[count] = sc.nextInt();

                        count++;
                        System.out.println("Student record added successfully.");
                    } else {
                        System.out.println("Record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No student records found.");
                    } else {
                        System.out.println("\nRoll No\tName\t\tMarks");
                        System.out.println("------------------------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println(rollNo[i] + "\t" + name[i] + "\t\t" + marks[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Student Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(search)) {
                            System.out.println("Student Found!");
                            System.out.println("Roll No: " + rollNo[i]);
                            System.out.println("Name: " + name[i]);
                            System.out.println("Marks: " + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Update Marks: ");
                    int roll = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (rollNo[i] == roll) {
                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextInt();
                            System.out.println("Marks updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Student Record System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
