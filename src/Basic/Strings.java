package Basic;

public class Strings {
    public static void main(String[] args) {
        String name = "Paz";

        boolean result = name.equals("paz");
        System.out.println(result);

        result = name.equalsIgnoreCase("paz");
        System.out.println(result);

        int length = name.length();

        char c = name.charAt(2);
        System.out.println(length + "\n" + c);

        int idx = name.indexOf("a");
        System.out.println(idx);

        boolean empty = name.isEmpty();
        empty = name.isBlank();

        String big = name.toUpperCase();
        System.out.println(big);

        name = "     paz    ";
        System.out.println(name);

        String cut = name.trim();
        System.out.println(cut);

        cut = name.replace("z", "y").trim();
        System.out.println(cut);

    }
}
