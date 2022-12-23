package Basic.Generics;

// Can do mulpiple genereci values
// public class MyGenericClass <T, V> { ... }
public class MyGenericClass <T> {
    T x;

    MyGenericClass(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }
}
