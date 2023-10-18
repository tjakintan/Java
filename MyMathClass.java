import java.util.ArrayList;

public class MyMathClass<T extends Number> {

    private T num;

    public double standardDeviation(ArrayList<T> nums){

        if (nums.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty. Cannot calculate standard deviation.");
        }

//        find the number of elements
        int count = 0;
        for(int i = 0; i < nums.size(); i++){
            count += 1;
        }

//        find the sum of elements
        double sum = 0;
        for(T j : nums){
            sum += j.doubleValue();
        }

//        find the mean
        double mean = sum/count;

//        find the standard deviation
        double sd;
        double sum2 = 0.0;
        for (T K : nums) {
            sum2 += Math.pow(mean - K.doubleValue(), 2);
        }
        sd = Math.sqrt(sum2/ nums.size() - 1);

//        return the value
        return sd;
    }

    public static void main(String[] args) {
//        Test Code
        ArrayList<Double> number = new ArrayList<>();
        number.add(82.0);
        number.add(93.0);
        number.add(98.0);
        number.add(89.0);
        number.add(88.0);

//        compile time error
        try{
            MyMathClass<Double> answer = new MyMathClass<>();
        }catch(IllegalArgumentException e){
            System.err.println("ArrayList contains non-numeric types.");
        }
        MyMathClass<Double> answer = new MyMathClass<>();
        System.out.println("The standard deviation:- " + answer.standardDeviation(number));
    }

}
