package Basic;

public class Wrapper {
    public static void main(String[] args) {

        // Autoboxing: Compiler makes conversion between 
        // primitive type to object wrapper class
        int x = 5;
        Integer y = x; // autoboxing: int -> Integer        

        Boolean a = true; // autoboxing all under
        Character b = '$';
        Integer c = 43;
        Double d = 133.2;
        String e = "hello";

        // Unboxing: 
        Integer r = 5;
        int f = r; // unboxing: Integer -> int

        if (a == true)
            System.out.println(true);


        if (e == "hello")
            System.out.println(true);

        if (e.equals("hello")) 
            System.out.println(true);
    }
}
