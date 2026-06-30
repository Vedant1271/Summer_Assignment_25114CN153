public class ColumnWiseSum {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int j = 0; j < matrix[0].length; j++) {

            int sum = 0;

            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Sum of Column " + (j + 1) + " = " + sum);
        }
    }
}
