package stack;

import java.util.ArrayList;
import java.util.List;

public class AsteroidCollisionList {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                list.add(asteroids[i]);
            } else {
                while (!list.isEmpty() && list.get(list.size() - 1) > 0 && list.get(list.size() - 1) < Math.abs(asteroids[i])) {
                    list.remove(list.size() - 1);
                }
                if (!list.isEmpty() && list.get(list.size() - 1) == Math.abs(asteroids[i])) {
                    list.remove(list.size() - 1);
                } else {
                    if (list.isEmpty() || list.get(list.size() - 1) < 0) {
                        list.add(asteroids[i]);
                    }
                }
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollisionList acl = new AsteroidCollisionList();
        int[] asteroids = {5, 10, -5};
        int[] result = acl.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [5, 10]

        asteroids = new int[]{8, -8};
        result = acl.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print []

        asteroids = new int[]{10, 2, -5};
        result = acl.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [10]

        asteroids = new int[]{-2, -1, 1, 2};
        result = acl.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [-2, -1, 1, 2]
    }
}
