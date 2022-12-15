package Basic.package1;
import Basic.package2.*;

public class A {

    protected String protectedMessage = "This is a protected message";
    public static void main(String[] args) {
        C c = new C();

        B b = new B();
        // We cant acces this bc different package
        // System.out.println(c.defaultMessage);
        
        // We can see the public message from package2 where C is
        // Public allows variables or methods or classes to be 
        // accessed from anywhere within the project.
        System.out.println(c.publicMessage);

        // Cant do this bc its private
        // System.out.println(b.privateMessage);

        
    }
}
