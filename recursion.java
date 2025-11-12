public class recursion {

    // Recursion Demo
    public static String recursionDemo(int n1) {
        if (n1 == 1) {
            return "shoeb";
        }
        String name = "shoeb";
        return name + recursionDemo(n1 - 1);
    }

    public static int sumOfNnsturalNumber(int n1) {
        // base case
        if (n1 == 1) {
            return 1;
        }

        return n1 + sumOfNnsturalNumber(n1 - 1);
    }

    public static int factorial(int n) {
        /// base case
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void printNameNtimes(String name, int count, int N) {
        // Base Case
        if (count == N) {
            return;
        }
        // logic
        System.out.println(name);

        // Recursive call with incremented count
        printNameNtimes(name, count + 1, N);

    }

    public static void printNumbers(int current, int n) {
        // Base case: if current exceeds n, stop recursion
        if (current > n)
            return;

        // Print current number
        System.out.print(current + " ");

        // Recursive call with next number
        printNumbers(current + 1, n);
    }

    public static void printNToOne(int n) {
        // Base case
        if (n < 1) {
            return;
        }
        System.out.println(n + " ");
        printNToOne(n - 1);
    }

    public static void printArray(int ans[], int N) {
        System.out.println("Reversed array is:- \n");
        for (int i = 0; i < N; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void reverseArray(int[] arr, int N) {
        // base case
        int[] ans = new int[N];

        for (int i = N - 1; i >= 0; i--) {
            ans[N - i - 1] = arr[i];
        }

        printArray(ans, N);
    }

    // public boolean isPalindrome(String s) {
    // // Step 1: Convert to lowercase
    // s = s.toLowerCase();

    // // Step 2: Remove non-alphanumeric characters
    // StringBuilder cleaned = new StringBuilder();
    // for (char c : s.toCharArray()) {
    // if (Character.isLetterOrDigit(c)) {
    // cleaned.append(c);
    // }
    // }

    // // Step 3: Reverse the cleaned string
    // String reversed = new StringBuilder(cleaned).reverse().toString();

    // // Step 4: Compare cleaned and reversed
    // return cleaned.toString().equals(reversed);
    // }

    // USING TWO POINTER APPROACH
    public boolean isPalindrome(String s) {
        // convert whole string to lowercase
        s = s.toLowerCase();

        // use two pointers: one from start, one from end
        int left = 0;
        int right = s.length() - 1;

        // run the loop until left crosses right
        while (left < right) {

            // skip characters that are not letters or numbers from the left side
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            // skip characters that are not letters or numbers from the right side
            if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            // compare both characters
            if (s.charAt(left) != s.charAt(right)) {
                return false; // if not same → not a palindrome
            }

            // move both pointers towards the center
            left++;
            right--;
        }

        // if loop ends, it's a palindrome
        return true;
    }

    //Fibonacci Number
    public static int fibonaci(int N){
        //base case 
        if(N==0){
            return 0;
        }
        if(N==1){
            return 1;
        }
        return fibonaci(N-1)+fibonaci(N-2);
    }

    public static void main(String[] args) {
        int N = 5;
        
        System.out.println(fibonaci(N));
    }

}
