import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try {
            // true = append mode
            FileWriter writer = new FileWriter("sample.txt", true);
            writer.write("\nDivyansh lo prove kr rha hu.");
            writer.close();

            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }
}
   