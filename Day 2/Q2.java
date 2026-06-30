import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, reverse = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;        // get last digit
            reverse = reverse * 10 + digit;
            num = num / 10;              // remove last digit
        }

        System.out.println("Reversed number = " + reverse);

        sc.close();
    }
}
