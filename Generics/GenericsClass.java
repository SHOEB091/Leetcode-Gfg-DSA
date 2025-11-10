package Generics;

class Box<T> { // T = Type parameter
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenericsClass {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.set("Shoeb");
        System.out.println(box1.get()); // Shoeb

        Box<Integer> box2 = new Box<>();
        box2.set(123);
        System.out.println(box2.get()); // 123

    }
}
