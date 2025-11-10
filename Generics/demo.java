package Generics;

import java.util.ArrayList;

/*
1. Why Generics?
Problem before Generics:
Collections could store anything, so it caused type safety issues.
*/

public class demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123); // 😬 different type

        String s = (String) list.get(0); // Need to cast manually

        ArrayList<String> list1 = new ArrayList<>();
        list.add("Hello");
        // list.add(123); ❌ Error at compile time!

        String s1 = list1.get(0); // No casting needed

    }
}
