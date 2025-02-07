package SlidingWindow;

public class PrefixSumSubArray {
    public static void main(String[] args) {
        int [] org = {1,6,3,2,7,2};
        int queries [][]= {{0,3},{2,4},{2,5}};
        int prefix [] = new int[org.length];
        prefix [0] = org[0];//store the first element 

        //filling the prefix array
        for(int i=1;i<org.length;i++){
           prefix[i]= prefix[i-1]+org[i];
        }
    }
}
