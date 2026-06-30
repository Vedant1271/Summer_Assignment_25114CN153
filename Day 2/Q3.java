import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int product = 1;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;   // extract last digit
            product = product * digit;
            num = num / 10;         // remove last digit
        }

        System.out.println("Product of digits = " + product);

        sc.close();
    }
}
