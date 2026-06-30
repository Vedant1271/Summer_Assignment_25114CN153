public class PerfectNumberFunction {

    static boolean isPerfect(int num) {

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum += i;
        }

        return sum == num;
    }

    public static void main(String[] args) {

        int num = 28;

        if (isPerfect(num))
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect Number");
    }
}
