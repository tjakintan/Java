import java.io.*;

public class DoubleLetters {

    public static int countDoubleLetters(String word){
        int count = 0;
        for (int i = 0; i < word.length() - 1; i++){
            if (word.charAt(i) == word.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static String wordWithMost(String fileName) throws IOException {
        String result = "";
        int max = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    int count = countDoubleLetters(word);
                    if (count > max) {
                        max = count;
                        result = word;
                    }
                }
            }
            return result;
        }
    }


    public static void main(String[] args) throws IOException {

        String filePath = "/Users/tjakintan/Downloads/words.txt";
        var inputFile = new File(filePath);
        if(inputFile.exists()){
            System.out.println("inputFile");
        }else {
            System.out.println("not");
        }
        String answer = wordWithMost(filePath);
        System.out.println(answer);

    }

}
