import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthMapper {
    public static void main(String[] args) {
//        IDEA: user provides you 1-2
//        you will return thr name of the corresponding month
//        store thr month data into a map!

        Map<Integer, String> monthMap = new HashMap<>();
        monthMap.put(1, "Jan");
        monthMap.put(2, "feb");
        monthMap.put(3, "mar");
        monthMap.put(4, "apr");
        monthMap.put(5, "may");
        monthMap.put(6, "june");
        monthMap.put(7, "july");
        monthMap.put(8, "aug");
        monthMap.put(9, "sep");
        monthMap.put(10, "oct");
        monthMap.put(11, "nov");
        monthMap.put(12, "dec");

        if (monthMap.containsKey(9)){
            System.out.println("9 IS a key");
        }
        if (monthMap.containsValue("DEC")){
            System.out.println("DEC is in the map");
        }

        for (var entry: monthMap.entrySet()){
            System.out.printf("%s - %s\n", entry.getKey(), entry.getValue());
        }
        var scanner = new Scanner(System.in);
        System.out.println("Enter a month in t: ");
        var integer = scanner.nextInt();
        if (monthMap.containsKey(integer)){
            System.out.println("Found");
        }else{
            System.out.println("not found");
        }

        monthMap.put(12, "December");



    }
}
