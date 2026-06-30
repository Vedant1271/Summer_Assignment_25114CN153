import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        String binary = "";

        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();

        int n = num;

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary;
                num = num / 2;
            }
        }

        System.out.println("Binary of " + n + " = " + binary);

        sc.close();
    }
}
