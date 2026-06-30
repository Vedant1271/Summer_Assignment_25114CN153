import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Enter first number: ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " = " + a);

        sc.close();
    }
}
