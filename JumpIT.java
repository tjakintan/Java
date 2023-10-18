import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class JumpIT {

    private static int findCheapestCostPosition(ArrayList<Integer> board, int position, Map<Integer, Integer> memo) {

        // Base case
        if (position >= board.size() - 1) {
            return 0;
        }

        // if the result is in the map already
        if (memo.containsKey(position)) {
            return memo.get(position);
        }

        int minCost = Integer.MAX_VALUE;
        int maxJump = Math.min(board.size() - 1, position + 2); // Maximum jump to consider

        // find next jump
        for (int i = position + 1; i <= maxJump; i++) {
            int jumpCost = board.get(i) + findCheapestCostPosition(board, i, memo);
            minCost = Math.min(minCost, jumpCost);
        }

        memo.put(position, minCost);
        return minCost;
    }

    public static int findCheapestCost(ArrayList<Integer> board) {
//        Store results
        Map<Integer, Integer> memo = new HashMap<>();
        return findCheapestCostPosition(board, 0, memo);
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(0);
//        numbers.add(3);
//        numbers.add(80);
//        numbers.add(6);
//        numbers.add(57);
//        numbers.add(10);


        for (int i = 0; i <= 6; i++){
            int randomNumber = random.nextInt(100);
            numbers.add(randomNumber);
        }
//        for (int elem : numbers){
//            System.out.print(elem + " ");
//        }
        System.out.println("\nThe cheapest cost is: " + findCheapestCost(numbers));


    }

}
