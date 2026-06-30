public class RepeatedCharacterPattern {
    public static void main(String[] args) {

        for (char ch = 'A'; ch <= 'E'; ch++) {
            int count = ch - 'A' + 1;

            for (int j = 1; j <= count; j++) {
                System.out.print(ch);
            }

            System.out.println();
        }

    }
}
