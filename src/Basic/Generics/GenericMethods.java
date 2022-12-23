package Basic.Generics;

public class GenericMethods {
//      Generics - enables types (classes and interfaces) to be parameters when defining:
//                  Classes, interfaces and methods
//                  a benefit is to eliminate the need to create multiple versions
//                  of methods or classes for various data types.
//                  Use 1 version for all reference data types

    public static void main(String[] args) {

        Integer[] intArray = { 1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        Character[] charArray = { 'a', 'b' , 'c', 'd', 'e'};
        String[] strArray = {"A", "B", "C", "D", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(strArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(charArray));
        System.out.println(getFirst(strArray));

//        Player player = new Player();
//        Enemy enemy = new Enemy();
//        Item item = new Item();
//        Tree tree = new Tree();
//
//        draw(player);
//        draw(enemy);
//        draw(item);
//        draw(tree);
    }

//    public static <T> void draw(T x) {
//        x.draw();
//    }

//      Usually put <T>
    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x : array)
            System.out.print(x + " ");

        System.out.println();
    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }
}
