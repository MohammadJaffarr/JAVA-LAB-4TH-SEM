
/** Write a program using character Stream to copy a text file
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
    public static void main(String[] args) {
        String sourceFile = "abc.txt";
        String destFile = "final.txt";

        try (FileReader reader = new FileReader(sourceFile);
                FileWriter writer = new FileWriter(destFile)) {

            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }

            System.out.println("File copied ");
        } catch (IOException e) {
            System.out.println("Error " + e);
        }
    }
}