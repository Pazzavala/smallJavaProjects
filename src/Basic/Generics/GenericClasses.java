package Basic.Generics;

public class GenericClasses {
    public static void main(String[] args) {
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(1.0);
        MyCharacterClass myChar = new MyCharacterClass('F');

        System.out.println(myInt.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myDouble.getValue());

//        The generic class
        MyGenericClass<Integer> myGenericInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myGenericDouble = new MyGenericClass<>(1.0);
        MyGenericClass<Character> myGenericChar = new MyGenericClass<>('F');

        System.out.println(myGenericInt.getValue());
        System.out.println(myGenericChar.getValue());
        System.out.println(myGenericDouble.getValue());
    }
}
