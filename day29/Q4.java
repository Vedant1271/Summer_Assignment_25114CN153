import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productName = new String[50];
        int[] quantity = new int[50];
        double[] price = new double[50];

        int count = 0;
        int choice;

        do {
            System.out.println("\n===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {

                case 1:
                    if (count < 50) {
                        System.out.print("Enter Product Name: ");
                        productName[count] = sc.nextLine();

                        System.out.print("Enter Quantity: ");
                        quantity[count] = sc.nextInt();

                        System.out.print("Enter Price: ");
                        price[count] = sc.nextDouble();

                        count++;
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Inventory is full.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("\nProduct\t\tQuantity\tPrice");
                        System.out.println("-------------------------------------------");
                        for (int i = 0; i < count; i++) {
                            System.out.println(productName[i] + "\t\t" + quantity[i] + "\t\t" + price[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Product Name to Search: ");
                    String search = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (productName[i].equalsIgnoreCase(search)) {
                            System.out.println("Product Found!");
                            System.out.println("Name: " + productName[i]);
                            System.out.println("Quantity: " + quantity[i]);
                            System.out.println("Price: " + price[i]);
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Product Name to Update: ");
                    String update = sc.nextLine();
                    found = false;

                    for (int i = 0; i < count; i++) {
                        if (productName[i].equalsIgnoreCase(update)) {
                            System.out.print("Enter New Quantity: ");
                            quantity[i] = sc.nextInt();
                            System.out.println("Quantity updated successfully.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting Inventory Management System...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
