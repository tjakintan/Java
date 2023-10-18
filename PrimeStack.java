import java.util.ArrayList;
import java.util.List;

// Stack Class
public class PrimeStack {

    private int size;
    private List<Integer> stackList;

    public PrimeStack(int size){
        this.size = size;
        this.stackList = new ArrayList<>(size);
    }

    public boolean isEmpty(){
        return stackList.isEmpty();
    }
    public boolean contains(int element){
        return stackList.contains(element);
    }
    public int peek(){
        int last = stackList.size() - 1;
        return stackList.get(last);
    }
    public void pop(){
        int last = stackList.size() - 1;
        stackList.remove(last);
    }
    public void push(int element){
        stackList.add(element);
    }





// Class Implementation
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // The number is divisible, so it's not prime
            }
        }

        return true; // If no divisors found, the number is prime
    }

    public static void main(String[] args) {

//        Initialize PrimeStack
        PrimeStack stack = new PrimeStack(120);

//        1st 120 prime numbers(In Order)
        System.out.println("In Order:- ");
        for (int i = 1; i < 120; i++){
            if (isPrime(i)){
                stack.push(i);
                System.out.print(i + " ");
            }
        }

//        1st 120 prime numbers(In Reverse Order)
        System.out.println();
        System.out.print("Reverse Order:- ");
        while (!stack.isEmpty()){
            int top = stack.peek();
            System.out.print(top + " ");
            stack.pop();
        }
    }




}
