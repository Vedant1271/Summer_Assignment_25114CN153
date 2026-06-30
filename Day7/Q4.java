import java.util.Scanner;

public class RecursiveReverseNumber {

    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }

        int digit = num % 10;
        rev = rev * 10 + digit;

        return reverse(num / 10, rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int result = reverse(num, 0);

        System.out.println("Reversed number = " + result);

        sc.close();
    }
}
