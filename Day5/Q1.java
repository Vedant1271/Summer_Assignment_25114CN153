import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        // Find sum of divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check condition
        if (sum == num && num != 0) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");
        }

        sc.close();
    }
}
