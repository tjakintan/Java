import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BookRating {
    public static void main(String[] args) {
        String filename = "/Users/tjakintan/Documents/practise.rtf";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            int totalRatings = Integer.parseInt(String.valueOf(reader.read()));
            HashMap<String, Double> bookAverages = new HashMap<>();
            HashMap<String, Integer> bookReviews = new HashMap<>();

            for (int i = 0; i < totalRatings; i++) {
                String bookTitle = reader.readLine();
                int rating = Integer.parseInt(String.valueOf(reader.read()));

                if (bookAverages.containsKey(bookTitle)) {
                    double currentAverage = bookAverages.get(bookTitle);
                    int currentReviews = bookReviews.get(bookTitle);

                    double newAverage = ((currentAverage * currentReviews) + rating) / (currentReviews + 1);
                    bookAverages.put(bookTitle, newAverage);
                    bookReviews.put(bookTitle, currentReviews + 1);
                } else {
                    bookAverages.put(bookTitle, (double) rating);
                    bookReviews.put(bookTitle, 1);
                }
            }

            reader.close();

            // Print the averages
            for (String bookTitle : bookAverages.keySet()) {
                int reviews = bookReviews.get(bookTitle);
                double averageRating = bookAverages.get(bookTitle);
                System.out.printf("%s: %d review%s, average of %.1f / 5\n",
                        bookTitle, reviews, (reviews > 1 ? "s" : ""), averageRating);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


