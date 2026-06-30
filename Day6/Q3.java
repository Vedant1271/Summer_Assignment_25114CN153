import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, count = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        int n = num;

        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }

        System.out.println("Number of set bits in " + num + " = " + count);

        sc.close();
    }
}
