import java.util.Scanner;

public class RecursiveFactorial {

    // Recursive function
    static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        long result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
