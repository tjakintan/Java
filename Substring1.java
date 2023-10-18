import java.util.Scanner;

public class Substring1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String s1: ");
        String s1 = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter String s2: ");
        String s2 = scanner2.nextLine();

        if (s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        }
        else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }
}
