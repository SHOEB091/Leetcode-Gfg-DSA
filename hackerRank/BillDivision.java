package hackerRank;

import java.util.List;

public class BillDivision {

    public static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum = 0;

    // sum all except the item Anna didn't eat
    for (int i = 0; i < bill.size(); i++) {
        if (i != k) {
            sum += bill.get(i);
        }
    }

    int annaShare = sum / 2;

    if (annaShare == b) {
        System.out.println("Bon Appetit");
    } else {
        System.out.println(b - annaShare);
    }
}



    public static void main(String[] args) {
        
    }
}
