import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter position (n): ");
        n = sc.nextInt();

        int a = 0, b = 1, result = 0;

        if (n == 1) {
            result = 0;
        } else if (n == 2) {
            result = 1;
        } else {
            for (int i = 3; i <= n; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }

        System.out.println(n + "th Fibonacci term = " + result);

        sc.close();
    }
}
