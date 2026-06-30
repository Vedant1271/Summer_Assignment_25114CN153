public class MaximumFunction {

    static int maximum(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("Maximum = " + maximum(25, 18));
    }
}
