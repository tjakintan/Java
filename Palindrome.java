import java.util.ArrayList;

import java.util.List;


public class Palindrome {

    public static boolean isNumPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        List<Integer> digits = new ArrayList<>();

        for (int number = 1; number < 100000; number++){
            if (isNumPrime(number)){
                digits.add(number);
            }
        }

        int[] arr = new int[digits.size()];

        for(int z = 0; z < digits.size(); z++){
            arr[z] = digits.get(z);
        }

        List<Integer> answer = new ArrayList<>();


        for (int a = 0; a < digits.size(); a++){

            int number = arr[a];
            int temp, remainder;
            int sum = 0;

            temp = number;

            while (number != 0){
                remainder = number % 10;
                sum = sum * 10 + remainder;
                number = number / 10;
            }

            number = sum;

            if (temp == sum){
                answer.add(number);
            }
            else {
                ;
            }

        }

        for (int j = 0; j < 100; j++){
            System.out.print(answer.get(j));
            System.out.print(" ");
        }

    }

}
