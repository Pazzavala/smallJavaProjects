package Basic.Files;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        file - an abstract representation of file and directory pathname
        File file = new File("/Users/pazzavala/Desktop/Java Projects/smallJavaProjects/src/Basic/Files/Secrete_message_project.txt");
        File file2 = new File("C:\\Users\\Maria Zavala\\Desktop\\GitHub\\Java Master\\smallJavaProjects\\src\\Basic\\Files\\Secrete_message_File.txt");
        File file3 = new File("C:/Users/Maria Zavala/Desktop/GitHub/Java Master/smallJavaProjects/src/Basic/OOP/Secrete_message_OOP");

        if(file.exists() && file2.exists())
            System.out.println("These files exist :O !");
        else
            System.out.println("That files does not exist :(");

        if(file3.exists()) {
            System.out.println(file3.getPath());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println("Verify that this is a file not a folder: " + file.isFile());
//            file.delete();   deletes our file
            System.out.println(file2.getName());
      } else {
            System.out.println("File does not exist");
        }
    }
}
