package Generics;

interface Container<T> {
    void add(T item);

    T get();
}

class StringContainer implements Container<String> {
    private String item;

    public void add(String item) {
        this.item = item;
    }

    public String get() {
        return item;
    }
}

// Bounded Type Parameter
class Calculator<T extends Number> { // only Numbers allowed
    public void show(T value) {
        System.out.println("Number: " + value);
    }
}

public class GenericInterface {
    public static void main(String[] args) {
        Calculator<Integer> c1 = new Calculator<>();
        c1.show(10); // ✅

        //Calculator<String> c2 = new Calculator<>(); // ❌ Error

    }
}
