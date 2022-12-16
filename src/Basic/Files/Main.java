import java.io.File;

public class Main {
    public static void main(String[] args) {
//        file - an abstract representation of file and directory pathname
        File file = new File("Secrete_message_project.txt");

        if(file.exists())
            System.out.println("That file exist :O !");
        else
            System.out.println("That files does not exist :(");
    }
}
