package Basic.package2;

public class C {

    // Default modifier can only be accessed by classes within same package
    String defaultMessage = "This is the default";

    // Can be accessed from other pakages as logn as they are in same project
    public String publicMessage = "This is a public message";

    // Accessable to a different class in a diffrent package as long as
    // the class is a subclass of the class with the protected memeber.
    protected String protectedMessage = "This is a protected message";

    // Can only be used in class where its defined.
    private String privateMessage = "This is a private message";
}
