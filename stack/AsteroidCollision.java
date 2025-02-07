package stack;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                stack.push(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i])) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i])) {
                    stack.pop();
                } else {
                    if (stack.isEmpty() || stack.peek() < 0) {
                        stack.push(asteroids[i]);
                    }
                }
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        AsteroidCollision ac = new AsteroidCollision();
        int[] asteroids = {5, 10, -5};
        int[] result = ac.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [5, 10]

        asteroids = new int[]{8, -8};
        result = ac.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print []

        asteroids = new int[]{10, 2, -5};
        result = ac.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [10]

        asteroids = new int[]{-2, -1, 1, 2};
        result = ac.asteroidCollision(asteroids);
        System.out.println(java.util.Arrays.toString(result)); // Should print [-2, -1, 1, 2]
    }
}