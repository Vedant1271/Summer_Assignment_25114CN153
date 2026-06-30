import java.util.Scanner;

public class MenuDrivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {
            System.out.println("\n===== MENU DRIVEN STRING OPERATIONS =====");
            System.out.println("1. Enter String");
            System.out.println("2. Display String");
            System.out.println("3. Find Length");
            System.out.println("4. Convert to Uppercase");
            System.out.println("5. Convert to Lowercase");
            System.out.println("6. Reverse String");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter a string: ");
                    str = sc.nextLine();
                    break;

                case 2:
                    System.out.println("String: " + str);
                    break;

                case 3:
                    System.out.println("Length = " + str.length());
                    break;

                case 4:
                    System.out.println("Uppercase: " + str.toUpperCase());
                    break;

                case 5:
                    System.out.println("Lowercase: " + str.toLowerCase());
                    break;

                case 6:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reversed String: " + rev);
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 7);

        sc.close();
    }
}
