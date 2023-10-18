import java.util.ArrayList;
import java.util.Arrays;

public class Eratosthenes {
    public static ArrayList<Integer> findPrimes(int num) {
        ArrayList<Integer> lists = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            lists.add(i);
        }
        ArrayList<Integer> prime = new ArrayList<>();
        int currentPrime = 2;
        while (!lists.isEmpty()){

            prime.add(currentPrime);

//            remove multiples of current Prime
            for(int i = 0; i < lists.size(); i++){
                if(lists.get(i) % currentPrime == 0){
                    lists.remove(i);
                    i--;
                }
            }

//        Find the next unmarked number (next prime)
            boolean found = false;
            for (int i = 0; i < lists.size(); i++) {
                if (lists.get(i) > currentPrime) {
                    currentPrime = lists.get(i);
                    found = true;
                    break;
                }
            }
            if (!found){
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        ArrayList<Integer> prime = findPrimes(100);
        for(int i: prime){
            System.out.print(i + " ");
        }

    }


}
