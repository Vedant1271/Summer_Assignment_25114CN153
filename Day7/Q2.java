import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive function
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Enter position (n): ");
        n = sc.nextInt();

        System.out.println(n + "th Fibonacci term = " + fibonacci(n));

        sc.close();
    }
}
