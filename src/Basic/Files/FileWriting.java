package Basic.Files;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriting {
//    FileWriter - Write to a file

    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Files\\Secrete_message_File.txt");
            writer.write("Roses are red\nViolets are blue\nIDC about you.");
            writer.append("\nA Poem by PAZ");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
