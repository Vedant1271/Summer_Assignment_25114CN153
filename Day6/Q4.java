import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, n;
        long result = 1;

        System.out.print("Enter base (x): ");
        x = sc.nextInt();

        System.out.print("Enter exponent (n): ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println(x + "^" + n + " = " + result);

        sc.close();
    }
}
