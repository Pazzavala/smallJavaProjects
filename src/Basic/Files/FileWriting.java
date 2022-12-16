package Basic.Files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Files\\Secrete_message_File.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
