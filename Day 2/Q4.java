import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, original, reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        original = num;

        while (num != 0) {
            int digit = num % 10;           // get last digit
            reverse = reverse * 10 + digit; // build reverse number
            num = num / 10;                // remove last digit
        }

        if (original == reverse) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

        sc.close();
    }
}
