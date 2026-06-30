public class PalindromeFunction {

    static boolean isPalindrome(int num) {

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        int num = 121;

        if (isPalindrome(num))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
