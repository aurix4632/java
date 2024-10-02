import java.io.FileReader;
import java.io.IOException;

public class ReadFileAndConvertToUpperCase2 {
    public static void main(String[] args) {
        String fileName = "abc.txt";  // Change this to the path of your file if it's not in the same directory as the Java file

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            
            while ((line = reader.readLine()) != null) {
                // Convert each line to uppercase and print it
                System.out.println(line.toUpperCase());
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
