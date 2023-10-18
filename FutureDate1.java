import java.util.Scanner;

public class FutureDate1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day: ");

        int initialDate = scanner.nextInt();

        if(initialDate < 0 || initialDate > 7){

            System.out.println("Number must be within 0 and 6");

        }
        else {

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Enter the number of days elapsed since today: ");
            int finalDate = scanner2.nextInt();


            String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            System.out.println( "Today is " + days[initialDate] + " and the future day is " + days[(initialDate + finalDate) % 7] );

        }

        scanner.close();

    }

}
