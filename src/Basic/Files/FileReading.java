package Basic.Files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {
//    FileReader - reads contents of a file as a stream of characters One by one
//    read() returns an int value which contains the byte value
//    when read() return -1, there is no more data to be read.
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Files\\ART.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
