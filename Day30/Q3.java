import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] empName = new String[50];
        int[] empId = new int[50];
        String[] department = new String[50];
        double[] salary = new double[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (count < 50) {
                        System.out.print("Enter Employee ID: ");
                        empId[count] = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name: ");
                        empName[count] = sc.nextLine();

                        System.out.print("Enter Department: ");
                        department[count] = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        salary[count] = sc.nextDouble();

                        count++;
                        System.out.println("Employee added successfully.");
                    } else {
                        System.out.println("Employee record is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nID\tName\t\tDepartment\tSalary");
                        System.out.println("------------------------------------------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println(empId[i] + "\t" + empName[i] + "\t\t" +
                                    department[i] + "\t\t" + salary[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == searchId) {
                            System.out.println("Employee Found!");
                            System.out.println("ID: " + empId[i]);
                            System.out.println("Name: " + empName[i]);
                            System.out.println("Department: " + department[i]);
                            System.out.println("Salary: " + salary[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Employee ID to Update Salary: ");
                    int updateId = sc.nextInt();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (empId[i] == updateId) {
                            System.out.print("Enter New Salary: ");
                            salary[i] = sc.nextDouble();
                            System.out.println("Salary updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Employee Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
