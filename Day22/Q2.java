public class CountWords {

    public static void main(String[] args) {

        String str = "Java is easy to learn";

        String[] words = str.trim().split("\\s+");

        System.out.println("Number of Words = " + words.length);
    }
}
