import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Code that may throw a checked exception
            File file = new File("nonexistentfile.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            // Handle the checked exception
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("This is the finally block.");
        }
    }
}
