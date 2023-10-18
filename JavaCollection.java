import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class JavaCollection {
    public static void main(String[] args) throws IOException {


//        Check if a file exist
        var inputFile = new File("data.txt");
        if (inputFile.exists()){
            System.out.println("the file exists");
        }


//        create a buffer reader
        var bufferReader = new BufferedReader((new FileReader(inputFile)));
        String line = "";
        while ((line = bufferReader.readLine()) != null){
            System.out.println(line);
        }
        bufferReader.close();

//        collection of items
        boolean result = true;
        double pi = 3.14;
        char c = 'T';
        int answer = 42;
        Object[] data = new Object[]{result, pi, c, answer};
        System.out.println(data.length);

        ArrayList dataset = new ArrayList();
        dataset.add(result);
        dataset.add(pi);
        dataset.add(c);
        dataset.add(answer);

//        typed collection

        ArrayList <String> threeStooges = new ArrayList<>();
//        using -> lists
//        List<String> threeStooges = Arrays.asList("Larry", "curly", "moe");
        threeStooges.add("larry");
        threeStooges.add("moe");
        threeStooges.add("curly");
        System.out.printf("we have %d stooges \n", threeStooges.size());
        if (threeStooges.contains("moe")){
            System.out.println("this will print");
        }

        ArrayList <Double> dataPoints = new ArrayList<>();
        dataPoints.add(10.1);
        dataPoints.add(4.5);
        dataPoints.add(30.1);
        dataPoints.add(-10.0);


//        unsorted
        System.out.println("unsorted:- ");
        dataPoints.forEach(System.out::println);

//        sorted
        Collections.sort(dataPoints);
        System.out.println("sorted:- ");
        dataPoints.forEach(System.out::println);






    }
}
