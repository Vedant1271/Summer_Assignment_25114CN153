import java.util.Scanner;

public class MiniLibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookName = new String[50];
        String[] author = new String[50];
        boolean[] issued = new boolean[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== MINI LIBRARY SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (count < 50) {
                        System.out.print("Enter Book Name: ");
                        bookName[count] = sc.nextLine();

                        System.out.print("Enter Author Name: ");
                        author[count] = sc.nextLine();

                        issued[count] = false;
                        count++;

                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBook Name\tAuthor\t\tStatus");
                        System.out.println("----------------------------------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println(bookName[i] + "\t" + author[i] + "\t" +
                                    (issued[i] ? "Issued" : "Available"));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(search)) {
                            System.out.println("Book Found!");
                            System.out.println("Book: " + bookName[i]);
                            System.out.println("Author: " + author[i]);
                            System.out.println("Status: " + (issued[i] ? "Issued" : "Available"));
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Name to Issue: ");
                    String issueBook = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(issueBook)) {
                            if (!issued[i]) {
                                issued[i] = true;
                                System.out.println("Book issued successfully.");
                            } else {
                                System.out.println("Book is already issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book Name to Return: ");
                    String returnBook = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (bookName[i].equalsIgnoreCase(returnBook)) {
                            if (issued[i]) {
                                issued[i] = false;
                                System.out.println("Book returned successfully.");
                            } else {
                                System.out.println("Book was not issued.");
                            }
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting Mini Library System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
