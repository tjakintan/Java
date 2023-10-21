import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {

    public static String UnknownOperatorException(String a){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> operator = new ArrayList<>();
        operator.add('+');
        operator.add('-');
        operator.add('*');
        operator.add('/');
        if (!(operator.contains(a.charAt(0)))){
            System.out.println(a.charAt(0) + " is an unknown operator\nRe-enter your last line:");
            return scanner.nextLine();
        }
        return a;
    }


    public static void main(String[] args) {
        System.out.println("Calculator is on.");
        Scanner scanner = new Scanner(System.in);

        double result = 0.0;
        String userInput;
        String pos;
        ArrayList<String> perform = new ArrayList<>();


        do {
            pos = scanner.nextLine().trim();
            userInput = UnknownOperatorException(pos);
            perform.add(String.valueOf(userInput.charAt(0)));
            perform.add(String.valueOf(userInput.charAt(1)));


            for (int i = 0; i < perform.size() - 1; i++){
                if (perform.get(i).equals("+")){
                    result = result + Double.parseDouble(perform.get(i+1));
                }
                if (perform.get(i).equals("-")){
                    result = result - Double.parseDouble(perform.get(i+1));
                }
                if (perform.get(i).equals("*")){
                    result = result * Double.parseDouble(perform.get(i+1));
                }
                if (perform.get(i).equals("/")){
                    result = result / Double.parseDouble(perform.get(i+1));
                }
            }

            System.out.println("Result is " + result);
            System.out.println("Again (Y/N)");
            String position = scanner.nextLine();
            if (position.equalsIgnoreCase("N")){
                break;
            }
            if (position.equalsIgnoreCase("Y")){
                while(!(perform.isEmpty())){
                    perform.remove(0);
                }
            }
        }
        while (scanner.hasNextLine() );
        scanner.close();
    }
}
