public class ArmstrongFunction {

    static boolean isArmstrong(int num) {

        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        return original == sum;
    }

    public static void main(String[] args) {

        int num = 153;

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
