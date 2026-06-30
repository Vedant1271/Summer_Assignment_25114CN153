import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            sum = sum + (num % 10); // extract last digit
            num = num / 10;         // remove last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}
