package MultiThreading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Lambda = short form of “write the method here”.
Form: (params) -> expression
      (params) -> { /* many statements */ /* }

Works only with Functional Interfaces (one abstract method).
Examples below: Runnable (threads), Comparator (sorting), custom MathOp (math).
*/
public class LambdaExpression {
    public static void main(String[] args) {
        // 1) Runnable with lambda (start a thread)
        // Old way (anonymous class) was: new Thread(new Runnable(){ public void run(){ ... }})
        Thread t = new Thread(() -> {
            System.out.println("Hello from lambda thread!");
        });
        t.start();
        try { t.join(); } catch (InterruptedException ignored) {}

        // 2) Custom functional interface: Math operation
        MathOp add = (a, b) -> a + b;                 // one-line expression
        MathOp multiply = (a, b) -> {                 // multi-line with return
            int res = a * b;
            return res;
        };
        System.out.println("Add 4+3 = " + add.apply(4, 3));
        System.out.println("Mul 4*3 = " + multiply.apply(4, 3));

        // 3) Comparator with lambda: sort names by length
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "ram", "alex", "zoe", "jonathan");
        // (a, b) -> a.length() - b.length()  means: compare by length
        names.sort((a, b) -> a.length() - b.length());
        System.out.println("Sorted by length: " + names);

        // 4) Method reference (shorter form of lambda when you just call a method)
        // x -> System.out.println(x)  becomes  System.out::println
        names.forEach(System.out::println);

        // 5) Capturing a local variable (must be effectively final)
        int base = 10; // do not change 'base' after this
        MathOp addBase = (x, y) -> x + y + base; // uses 'base' from outside
        System.out.println("Add with base (2,3) = " + addBase.apply(2, 3));
    }
}

// Functional interface: exactly one abstract method
@FunctionalInterface
interface MathOp {
    int apply(int a, int b);
}