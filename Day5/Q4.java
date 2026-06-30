import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num;

        System.out.print("Enter a number: ");
        num = sc.nextLong();

        long n = num;

        // Remove factors of 2
        while (n % 2 == 0) {
            n = n / 2;
        }

        // Check odd factors
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                n = n / i;
            }
        }

        // If remaining number is > 2, it is prime
        if (n > 2) {
            System.out.println("Largest Prime Factor of " + num + " is " + n);
        } else {
            System.out.println("Largest Prime Factor of " + num + " is 2");
        }

        sc.close();
    }
}
