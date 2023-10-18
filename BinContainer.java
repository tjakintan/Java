import java.util.ArrayList;
import java.util.Scanner;


public class BinContainer {
    public static void main(String[] args){
        int numbers;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of objects: ");
        numbers = scanner.nextInt();

        int[] weights = new int[numbers];
        System.out.println("Enter the weights of the objects: ");
        for(int i = 0; i < weights.length; i++){
            weights[i] = scanner.nextInt();
        }

        ArrayList<ArrayList<Integer>> containers = new ArrayList<>();
        int containerCount = 0;

//         placing elements in existing containers

        for (int i = 0; i < numbers; i++) {

            boolean placed = false;

            for (int j = 0; j < containers.size(); j++) {
                int currentWeight = containers.get(j).stream().mapToInt(Integer::intValue).sum();
                if (currentWeight + weights[i] <= 10) {
                    containers.get(j).add(weights[i]);
                    placed = true;
                    break;
                }
            }
//            Create a new container if its filled

            if (!placed) {
                ArrayList<Integer> newContainer = new ArrayList<>();
                newContainer.add(weights[i]);
                containers.add(newContainer);
            }
            containerCount +=1;
        }

        for (int i = 0; i < containers.size(); i++) {
            System.out.print("Container " + (i + 1) + " contains objects with weight ");
            for (int j = 0; j < containers.get(i).size(); j++) {
                System.out.print(containers.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }

}
