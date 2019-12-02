import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
 
public class BookLoader 
{
    String text;

    public BookLoader(String fileLoc)
    {
        Path filePath = Paths.get(fileLoc);
 
        try {
            text = Files.readString(filePath);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
    }
}