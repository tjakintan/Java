import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//         Methods = reusable block of codes

//        Method overloading
        printGreeting();
        printGreeting("c#");

//        Array
        int numTemps = 5;
        double[] temp = new double[numTemps];

        String [] seasons = new String[]{"fall", "winter", " spring", "summer"};
        printArray(seasons, 5);

//        enhanced for loop
        for (String season : seasons){
            System.out.printf("%s ", seasons);
        }
        System.out.println("================================");
    }

    public static void printArray(String[] seasons, int numSeasons){
        for (int i = 0; i < seasons.length; i++){
            System.out.printf("%s", seasons[i]);
        }
        System.out.println("=========================");
    }

    public static void printGreeting(){
        System.out.println("I love Java");
        System.out.println("Java 21 ia around the corner");
        System.out.println("java is great");
    }

    public static void printGreeting(String language){
        System.out.printf("I love %s\n", language);
        System.out.printf("%s 21 ia around the corner\n", language);
        System.out.printf("%s is great\n", language);
    }

    public static String upperCaseString(String firstname){
        var result = "";
        for (var letter : firstname.toCharArray()){
            result += String.valueOf(letter).toUpperCase();
        }
        return result;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%s ", matrix[i][j]);
            }
        }
    }






}