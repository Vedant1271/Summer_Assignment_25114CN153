import java.util.Scanner;

public class RecursiveSumOfDigits {

    // Recursive function
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int result = sumDigits(num);

        System.out.println("Sum of digits = " + result);

        sc.close();
    }
}
