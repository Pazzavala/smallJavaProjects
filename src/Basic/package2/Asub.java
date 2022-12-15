package Basic.package2;

import Basic.package1.*;

public class Asub extends A {

    public static void main(String[] args) {
        C c = new C();
        //  We can access this bc in same package
        System.out.println(c.defaultMessage);


        Asub asub = new Asub();
        //  We can access the protected message bc its a sub class of the A class.
        System.out.println(asub.protectedMessage);
    }
}