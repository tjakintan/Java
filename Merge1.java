import java.util.Scanner;

public class Merge1 {

    public static int[] merge(int[] arr1, int[] arr2){

        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] mergeArr = new int[len1 + len2];

        for (int i = 0; i < len1; i++){
            mergeArr[i] = arr1[i];
        }
        for (int j = 0; j < len2; j++){
            mergeArr[arr1.length + j] = arr2[j];
        }

        int len = mergeArr.length;;
        boolean swap;
        do {
            swap = false;
            for (int i = 1; i < len; i++){
                if (mergeArr[i-1] > mergeArr[i]){
                    int temp = mergeArr[i-1];
                    mergeArr[i-1] = mergeArr[i];
                    mergeArr[i] = temp;
                    swap = true;
                }
            }
            len--;
        } while (swap);

        return mergeArr;
    }



    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter list 1: ");

        String input = scanner1.nextLine();

        String[] numberStr = input.split(" ");
        int[] numbers = new int[numberStr.length];

        for (int i = 0; i < numberStr.length; i++){
            numbers[i] = Integer.parseInt(numberStr[i]);
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter list 2: ");

        String input2 = scanner2.nextLine();

        String[] numberStr2 = input2.split(" ");
        int[] numbers2 = new int[numberStr2.length];

        for (int j = 0; j < numberStr2.length; j++){
            numbers2[j] = Integer.parseInt(numberStr2[j]);
        }

        int[] answers = merge(numbers, numbers2);
        System.out.print("The merged list is ");
        for (int elem : answers){
            System.out.print(elem);
            System.out.print(" ");
        }

    }

}
