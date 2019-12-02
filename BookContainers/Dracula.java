import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;
 
public class Dracula 
{
    //Declare String to hold text
    String text;

    //This constructor goes and gets the file and loads the whole of the text into
    //text. It first sets the file path using the path library, then uses the Files
    //library to load the contents of the file at that path into a string, which is
    //put into the text variable.

    //https://howtodoinjava.com/java11/files-readstring-read-file-to-string/
    //https://stackoverflow.com/questions/326390/how-do-i-create-a-java-string-from-the-contents-of-a-file
    //https://stackoverflow.com/questions/2559527/non-static-variable-cannot-be-referenced-from-a-static-context/2559596#2559596

    public Dracula()
    {
        Path filePath = Paths.get("/Users/dsobolewski/Desktop/APCS/BookContainers/Dracula.txt");
 
        try
        {
            text = Files.readString(filePath);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
    }
}