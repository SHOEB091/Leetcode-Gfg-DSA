package hackerRank;

import java.util.HashMap;
import java.util.List;

public class SalesByMatch {

    //Optimal Approach
    public static int sockMerchant1(int n, List<Integer> ar) {
    HashMap<Integer, Integer> map = new HashMap<>();

    // Count frequencies
    for (int num : ar) {
        map.put(num, map.getOrDefault(num, 0) + 1);
    }

    // Count pairs
    int pairs = 0;
    for (int count : map.values()) {
        pairs += count / 2;
    }

    return pairs;
}



    // BruteForce Approach
    public static int sockMerchant(int n, List<Integer> ar) {

        int pair = 0;
        boolean[] visited = new boolean[n]; // To mark socks already paired

        for (int i = 0; i < n; i++) {
            if (visited[i])
                continue; // Skip already paired sock

            for (int j = i + 1; j < n; j++) {
                if (!visited[j] && ar.get(i).equals(ar.get(j))) {
                    // Found a pair
                    visited[i] = true;
                    visited[j] = true;
                    pair++;
                    break; // Stop searching for i
                }
            }
        }

        return pair;
    }

    public static void main(String[] args) {

    }
}
