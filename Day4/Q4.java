import java.util.Scanner;

public class ArmstrongInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start, end;

        System.out.print("Enter starting number: ");
        start = sc.nextInt();

        System.out.print("Enter ending number: ");
        end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {

            int temp = num;
            int digits = 0;
            int result = 0;

            // count digits
            int t = temp;
            while (t != 0) {
                t = t / 10;
                digits++;
            }

            // calculate Armstrong sum
            t = temp;
            while (t != 0) {
                int rem = t % 10;
                result += Math.pow(rem, digits);
                t = t / 10;
            }

            // check condition
            if (result == num) {
                System.out.print(num + " ");
            }
        }

        sc.close();
    }
}
