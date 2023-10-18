import java.util.Scanner;

public class Markov1 {

    public static boolean isMarkovMatrix(Double[][] matrix){

        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");

        Double[][] matrix = new Double[3][3];

        for (int i = 0; i < 3; i++){ // rows
            for (int j = 0; j < 3; j++){ // columns
                matrix[i][j] = scanner.nextDouble();
            }
        }

        boolean isSumOne = isMarkovMatrix(matrix);
        if (isSumOne){
            System.out.println("It is a Markov matrix");
        }else{
            System.out.println("It is not a Markov matrix");
        }

    }

}
