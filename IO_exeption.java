
import java.io.*;

// Example of FileNotFoundException
public class IO_exeption {

  public static void main(String[] args) {
    
    try {
        // Creating an instance of FileReader class
        FileReader fileReader = new FileReader("Text.txt");
        
        System.out.println(fileReader.read());
    
        fileReader.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
  }
}
