import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long binary;
        int decimal = 0, base = 1;

        System.out.print("Enter a binary number: ");
        binary = sc.nextLong();

        long temp = binary;

        while (temp > 0) {
            long lastDigit = temp % 10;

            decimal += lastDigit * base;
            base = base * 2;

            temp = temp / 10;
        }

        System.out.println("Decimal of " + binary + " = " + decimal);

        sc.close();
    }
}
