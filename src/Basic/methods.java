package Basic;

public class methods {
    public static void main(String[] args) {
        Hello();
        Hello();
        HelloName("MAria");

        int age = 22;
        HelloName("MAria", age);

        int furtureAge = ageInFuture(age, 10);
        HelloName("MAria", furtureAge);

    }

    // static not usually needed but needed 
    // here bc our main is static

    static void Hello() {
        System.out.println("Hello");
    }
    // This is an overloaded method 1
    static void HelloName(String name) {
        System.out.println("Hello " + name);

    }
    // This is an overloaded method 2
    static void HelloName(String name, int age) {
        System.out.println("Hello " + name + " " + age);

    }

    static int ageInFuture(int age, int years) {
        return age + years;
    }

}
