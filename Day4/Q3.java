import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, original, remainder, result = 0, digits = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        // Count number of digits
        int temp = num;
        while (temp != 0) {
            temp = temp / 10;
            digits++;
        }

        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            remainder = temp % 10;
            result += Math.pow(remainder, digits);
            temp = temp / 10;
        }

        if (result == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        sc.close();
    }
}
