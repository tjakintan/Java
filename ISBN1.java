import java.util.Scanner;

public class ISBN1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first 12 digits of an ISBN-15 as a string: ");
        String digits = scanner.nextLine();
        String[] numberArray = digits.split("");

        int[] number = new int[numberArray.length];

        for (int i = 0; i < numberArray.length; i++) {
            number[i] = Integer.parseInt(numberArray[i]);
        }
        if (number.length < 12){
            System.out.println("There must be 12 digits in total");
        }
        else{
            int d1 = number[0];
            int d2 = number[1];
            int d3 = number[2];
            int d4 = number[3];
            int d5 = number[4];
            int d6 = number[5];
            int d7 = number[6];
            int d8 = number[7];
            int d9 = number[8];
            int d10 = number[9];
            int d11 = number[10];
            int d12 = number[11];

            int d13 = 10 - (d1 + (3*d2) + d3 + (3*d4) + d5 + (3*d6) + d7 + (3*d8) + d9 + (3*d10) + d11 + (3*d12)) % 10;

            System.out.printf("The ISBN-13 number si %s%s%s%s%s%s%s%s%s%s%s%s%s", d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13);
        }

    }

}
